package com.yedam.member;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Servlet implementation class SearchMemberServlet
 */
@WebServlet("/SearchMemberServlet")
public class SearchMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchMemberServlet() {
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
		
		String id = request.getParameter("id");
		String name = request.getParameter("nm");
		String addr = request.getParameter("ad");
		String phone = request.getParameter("ph");
		String gender = request.getParameter("gn");
		
		MemberVO vo = new MemberVO();
		vo.setUserId(id);
		vo.setUserName(name);
		vo.setAddress(addr);
		vo.setPhone(phone);
		vo.setGender(gender);
		
		MemDAO dao = new MemDAO();
		List<MemberVO> list = dao.searchMemberList(vo);
		
		Gson gson = new GsonBuilder().create();
		response.getWriter().println(gson.toJson(list));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
