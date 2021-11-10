package com.yedam.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteSchedule
 */
@WebServlet("/DeleteScheduleServlet")
public class DeleteScheduleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteScheduleServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/json;charset=UTF-8");
		
		String title = request.getParameter("title");
		
		MemDAO dao = new MemDAO();
		boolean deleteOK = dao.deleteSchedule(title);
		
		if(deleteOK) {
			// {"retCode":"OK"}
			response.getWriter().print("{\"retCode\":\"OK\"}");
		} else {
			// {"retCode":"NG"}
			response.getWriter().print("{\"retCode\":\"NG\"}");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/json;charset=UTF-8");
		
		String title = request.getParameter("title");
		
		MemDAO dao = new MemDAO();
		boolean deleteOK = dao.deleteSchedule(title);
		
		if(deleteOK) {
			// {"retCode":"OK"}
			response.getWriter().print("{\"retCode\":\"OK\"}");
		} else {
			// {"retCode":"NG"}
			response.getWriter().print("{\"retCode\":\"NG\"}");
		}
	}

}
