package co.dy.prj.comm;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dy.prj.command.HomeCommand;
import co.dy.prj.command.LoginCommand;
import co.dy.prj.command.LoginForm;
import co.dy.prj.command.Logout;
import co.dy.prj.command.MemberList;

public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Command> map = new HashMap<String, Command>();
	
	public FrontController() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		// 초기값 설정("login.do", new LoginCommand())
		map.put("/home.do", new HomeCommand());	// 홈 페이지를 보여주는 Command
		map.put("/login.do", new LoginCommand());	// 로그인 처리
		map.put("/memberList.do", new MemberList());	// 멤버 목록 보기
		map.put("/loginForm.do", new LoginForm());	// 로그인 폼 호출
		map.put("/logout.do", new Logout());	// 로그아웃 처리
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 요청을 분석하고 처리하는 부분(서비스 부분)
		request.setCharacterEncoding("UTF-8");	// 한글 깨짐 처리.
		String uri = request.getRequestURI();	// URI 가져오기.
		System.out.println("uri: " + uri);
		String contextPath = request.getContextPath();	// contextPath 가져오기.
		System.out.println("contextPath: " + contextPath);
		String page = uri.substring(contextPath.length());	// 실제 요청 페이지(uri - contextPath);
		System.out.println("page: " + page);
		
		Command command = map.get(page);	// 요청에 대한 수행할 command를 찾음.
		String viewPage = command.run(request, response);
		System.out.println("viewPage: " + viewPage);
		
		// WEB-INF에 접근할 수 있도록 viewResolve를 만듦.
		if(!viewPage.endsWith(".do")) {	// endsWith -> 문자열 마지막에 ".do"가 포함되어있는지 검사.
			viewPage = "WEB-INF/views/" + viewPage + ".jsp";
			System.out.println("if viewPage: " + viewPage);
		}
		
		// 응답을 처리한다.
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		System.out.println("forward처리");
	}
}
