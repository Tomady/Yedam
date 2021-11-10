package com.yedam.member;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

/**
 * Servlet implementation class ModifyMemberServlet
 */
@WebServlet("/GetModifyMemberServlet")
public class GetModifyMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetModifyMemberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		// 삭제 기능을 넣도록.
		String deleteId = request.getParameter("id");
		
		MemDAO dao = new MemDAO();
		
		Gson gson = new GsonBuilder().create();	// json 반환.
		JsonObject jsonObj = new JsonObject();	// json 데이터 만들기.
		
		boolean flag = dao.deleteMember(deleteId);
		if(flag != false) {
			jsonObj.addProperty("retCode", "OK");
			jsonObj.addProperty("userId", deleteId);
			
		} else {
			jsonObj.addProperty("retCode", "NG");
			jsonObj.addProperty("retMsg", "오류발생!! \n 담당자(000-111) 문의!");
		}
		response.getWriter().println(gson.toJson(jsonObj));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		// 데이터 수정 및 화면변경.
		String userId = request.getParameter("id");	//input태그
		String userName = request.getParameter("nm");
		String userAddr = request.getParameter("ad");
		String userPhone = request.getParameter("ph");
		String userBirth = request.getParameter("br");
		String userGen = request.getParameter("gn");
		
		MemberVO vo = new MemberVO();
		vo.setUserId(userId);
		vo.setUserName(userName);
		vo.setAddress(userAddr);
		vo.setPhone(userPhone);
		vo.setBirth_date(userBirth);
		vo.setGender(userGen);
		
		MemDAO dao = new MemDAO();
		Map<String, Object> resultMap = dao.updateMember(vo);
		
		// json 포맷을 생성.
		Gson gson = new GsonBuilder().create();
		response.getWriter().println(gson.toJson(resultMap));
	}
}
