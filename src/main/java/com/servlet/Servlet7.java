package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet7  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
	  if(req.getSession()!= null) {
		  String ans = (String)req.getSession().getAttribute("key");
		  out.print("<h1> hello again to here "+ans+" </h1>");
	  }
	  else {
		  out.print("you are new user");
	  }
		
	}	
 
}
