//java package(sibasish)
package com.maren.myfirstproject.controller;
//importing all the classes from the packages(sibasish)
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScopeTestCtrl(sibasish)
 */
@WebServlet("/scopeTestCtrl")
public class ScopeTestCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)()
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// to set a value(sibasish)
		request.setAttribute("REQUEST","Request Scope");
		//get session has access to doget and dopost method and set the value of session,request,application(sibasish)
		request.getSession().setAttribute("SESSION","Session Scope");
		request.getSession().setAttribute("SESSION","Session Scope");
		request.getSession().setAttribute("APP","Application Scope");
		//getrequestdispatecher provides the facility of dispatching the request to another resource i.e. servlet,jsp or html(sibasish)
		request.getRequestDispatcher("/ScopeTest2").forward(request, response);;
		// returns a printwriter object that can send character text to the client here it is hello servlet(sibasish)
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
