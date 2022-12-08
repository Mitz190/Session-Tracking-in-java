package com.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Second_servlet_httpsess")
public class Second_servlet_httpsess extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter wr =resp.getWriter();
		HttpSession session=req.getSession(false);
		String n =(String) session.getAttribute("uname");
		wr.print("hello user: "+n);
	
	}
}
