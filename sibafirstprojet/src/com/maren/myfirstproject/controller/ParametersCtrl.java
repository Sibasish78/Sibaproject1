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
 * Servlet implementation class ParametersCtrl(sibasish)
 */
@WebServlet("/ParametersCtrl")
public class ParametersCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)(sibasish)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//retrieve request parameter (sibasish)
		String name166=request.getParameter("txtName");
		String pass166=request.getParameter("pass");
		// returns a printwriter object that can send character text to the client(sibasish)
		PrintWriter out=response.getWriter();
		//name and password would simply print(sibasish)
		out.print("<b> Name <b>:"+name166);
		out.print("<b> Password <b>:"+pass166);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)(sibasish)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
