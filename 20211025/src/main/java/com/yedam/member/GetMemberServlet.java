package com.yedam.member;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetMemberServlet
 */
@WebServlet({ "/GetMemberServlet", "/get_member" })
public class GetMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public GetMemberServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/xml;charset=UTF-8");
		PrintWriter out = response.getWriter();

		MemDAO dao = new MemDAO();
		List<MemberVO> list = dao.getMemberList();

//		out.println("<ul>");
		out.println("<record>");
//		out.println("<h3>헬로우, World</h3>");

		for (MemberVO member : list) {
			out.println("<li>" + member.getUserId() + ", " //
					+ member.getUserName() + ", " //
					+ member.getBirth_date() + ", " //
					+ member.getGender() + "</li>");
			
//			out.println("<row>"
//					+ "<id>" + member.getUserId() + "</id>" //
//					+ "<name>" + member.getUserName() + "</name>" //
//					+ "<birth>" + member.getBirth_date() + "</birth>" //
//					+ "<gender>" + member.getGender() + "</gender>" 
//					+ "</row>");
		}

		out.println("</record>");
//		out.println("</ul>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
