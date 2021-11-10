package com.yedam.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/FileUploadServlet")
public class FileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FileUploadServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		int maxSize = 1024 * 1024 * 10;	// 10MB
		ServletContext context = getServletContext();
		String saveDir = context.getRealPath("images");

		MultipartRequest multi = new MultipartRequest(request, saveDir, maxSize, "UTF-8",
				new DefaultFileRenamePolicy());
		
		String prod_item = multi.getParameter("prod_item");
		String prod_desc = multi.getParameter("prod_desc");
		String like_it = multi.getParameter("like_it");
		String origin_price = multi.getParameter("origin_price");
		String sale_price = multi.getParameter("sale_price");
		String prod_image = multi.getFilesystemName("prod_image");
		
		ItemVO vo = new ItemVO();
		vo.setProd_item(prod_item);
		vo.setProd_desc(prod_desc);
		vo.setLike_it(Double.parseDouble(like_it));
		vo.setOrigin_price(Integer.parseInt(origin_price));
		vo.setSale_price(Integer.parseInt(sale_price));
		vo.setProd_image(prod_image);
		
		System.out.println("실제위치: " + saveDir);
		
		PrintWriter out = response.getWriter();
		
		// 파일: 서버, 사용자 입력값: db저장.
		ItemVO itemVO = new ItemVO();
		MemDAO dao = new MemDAO();
		itemVO = dao.uploadProduct(vo);
		
		Gson gson = new GsonBuilder().create();
		out.println(gson.toJson(itemVO));
	}
}
