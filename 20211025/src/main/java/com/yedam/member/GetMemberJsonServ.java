package com.yedam.member;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

/**
 * Servlet implementation class GetMemberJsonServ
 */
@WebServlet("/GetMemberJsonServ")
public class GetMemberJsonServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetMemberJsonServ() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/json;charset=UTF-8");
		PrintWriter out = response.getWriter();
		// {"name":"Hongkildong", "age":20, "phone":"010-1234-5678"}
		// "[{\"id\":\"?\", \"name\":?, birth:?, gender:?}, {}, {}]";
		MemDAO dao = new MemDAO();
		List<MemberVO> list = dao.getMemberList();
//		int cnt = list.size();
//		out.println("[");
//		
//		for (int i = 0; i < cnt; i++) {
//			out.println("{\"id\": \"" + list.get(i).getUserId()
//					+ "\", \"name\": \" " + list.get(i).getUserName()
//					+ "\", \"birth\": \" " + list.get(i).getBirth_date()
//					+ "\", \"gender\": \" " + list.get(i).getGender()
//					+ "\"}");
//			if(i != cnt - 1) {
//				out.println(",");
//			}
//		}
//		out.println("]");
		Gson gson = new GsonBuilder().create();
		out.println(gson.toJson(list));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		// 입력하는 기능.
		MemDAO dao = new MemDAO();
		String userId = request.getParameter("u_i");
		String userName = request.getParameter("u_n");
		String address = request.getParameter("u_a");
		String phone = request.getParameter("u_p");
		String gender = request.getParameter("u_g");
		String birth = request.getParameter("u_b");
		
		MemberVO vo = new MemberVO();
		vo.setUserId(userId);
		vo.setUserName(userName);
		vo.setAddress(address);
		vo.setPhone(phone);
		vo.setGender(gender);
		vo.setBirth_date(birth);
		
		Gson gson = new GsonBuilder().create();	// json 반환.
		JsonObject jsonObj = new JsonObject();	// json 데이터 만들기.
		
//		System.out.println(vo);
		// {"retCode":"OK", "retVal": {vo}}
		// {"retCode":"NG", "retVal": "담당자에게 문의!!"}
		
		boolean flag = dao.insertMember(vo);
		if(flag != true) {
			jsonObj.addProperty("retCode", "NG");
			jsonObj.addProperty("retMsg", "오류발생!! \n 담당자(000-111) 문의!");
			
//			response.getWriter().println("{\"retCode\":\"NG\", \"retVal\": \"담당자에게 문의!!\"}");
		} else {
			jsonObj.addProperty("retCode", "OK");
			jsonObj.addProperty("userId", vo.getUserId());
			jsonObj.addProperty("userName", vo.getUserName());
			jsonObj.addProperty("birth_date", vo.getBirth_date());
			jsonObj.addProperty("address", vo.getAddress());
			jsonObj.addProperty("phone", vo.getPhone());
			jsonObj.addProperty("gender", vo.getGender());
//			response.getWriter().println("OK");
		}
		response.getWriter().println(gson.toJson(jsonObj));
	}
}
