package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/First_servlet_cookie")
public class First_servlet_cookie extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter wr = resp.getWriter();
		wr.println("hello");
		String username=req.getParameter("uname");
		String pass=req.getParameter("pass");
		wr.print("username: "+username+" password: "+pass);
		
		Cookie ck1= new Cookie("uname", username);
		Cookie ck2= new Cookie("pass", pass);
		
		resp.addCookie(ck1);
		resp.addCookie(ck2);
		
		wr.print("<form action='Second_servlet_cookie'>");
		wr.print("<input type='submit' value='go'>");
		wr.print("</form>");
				
	}

}
