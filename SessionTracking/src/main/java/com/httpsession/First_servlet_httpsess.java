package com.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/First_servlet_httpsess")
public class First_servlet_httpsess extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter wr =resp.getWriter();
		String uname=req.getParameter("username");
		wr.print("hello "+uname);
		
		HttpSession session=req.getSession();
		session.setAttribute("uname", uname);
		wr.print("<a href='Second_servlet_httpsess'>visit</a>");
	}

}
