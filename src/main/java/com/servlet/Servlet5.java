package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet5  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
		
		String name = req.getParameter("name");
		out.print("<h1> hello "+ name+". nice to meet u ");
		
		out.print("<h3> please go for the next page...</h3>");
		out.print("<a href='s6'> next page</a>");
		
		    HttpSession httpSession  =  req.getSession();
		    
		   httpSession.setAttribute("key",name);
		   

		
		
	}	
 
}
