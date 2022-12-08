package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Second_servlet_cookie
 */
@WebServlet("/Second_servlet_cookie")
public class Second_servlet_cookie extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter wr =resp.getWriter();
		
		Cookie ck[]=req.getCookies();
//		for (int i = 0; i < ck.length; i++) {
//			wr.print(ck[i].getName()+" "+ck[i].getValue());
//		}
		wr.print("hello "+ck[0].getValue());
	}
}
