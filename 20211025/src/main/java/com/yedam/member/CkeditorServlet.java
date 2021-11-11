package com.yedam.member;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonObject;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.oreilly.servlet.multipart.FileRenamePolicy;

@WebServlet("/CkeditorServlet")
public class CkeditorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CkeditorServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 파일 업로드는 전부 post 방식이다.
		response.setContentType("application/json;charset=UTF-8");
		
		String saveDir = "upload";
		ServletContext context = request.getServletContext();
		saveDir = context.getRealPath(saveDir);
		System.out.println("saveDir:" + saveDir);
		int maxSize = 10 * 1024 * 1024;
		String encoding = "UTF-8";
		FileRenamePolicy policy = new DefaultFileRenamePolicy();
		
		MultipartRequest multi = null;
		multi = new MultipartRequest(request, saveDir, maxSize, encoding, policy);
		
		Enumeration names = multi.getFileNames();
		
		while(names.hasMoreElements()) {
			String name = (String)names.nextElement();
			
			String originalName = multi.getOriginalFileName(name);
			String fileSystemName = multi.getFilesystemName(name);
			String fileType = multi.getContentType(name);
			
			System.out.println("originalName: " + originalName);
			System.out.println("fileSystemName: " + fileSystemName);
			System.out.println("fileType: " + fileType);
			
			String fileUrl = request.getContextPath() + "/upload/" + fileSystemName;	// 방금 올라간 파일 위치.
			
			JsonObject json = new JsonObject();
			json.addProperty("uploaded", 1);	// 0: fail, 1: success
			json.addProperty("fileName", fileSystemName);
			json.addProperty("url", fileUrl);
			
			response.getWriter().println(json);
		}
	}
}
