//java package(sibasish)
package com.maren.myfirstproject.controller;
//importing all the classes from the packages(sibasish)
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScopeTest2(sibasish)
 */
@WebServlet("/ScopeTest2")
public class ScopeTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)(sibasish)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// sharing out data among resources(sibasish)
		String req166=(String) request.getAttribute("REQUEST");//will process current request(sibasish)
		String ses166=(String) request.getSession().getAttribute("SESSION");//will return current session(sibasish)
		//http session contains a reference to servletcontext that this seesion belong to(sibasish)
		String app166=(String) request.getServletContext().getAttribute("APP");
		// returns a printwriter object that can send character text to the client(sibasish)
		PrintWriter out=response.getWriter();
		out.println("Req:"+req166);
		out.println("Session:"+ses166);
		out.println("Application:"+app166);
		
	}

}
