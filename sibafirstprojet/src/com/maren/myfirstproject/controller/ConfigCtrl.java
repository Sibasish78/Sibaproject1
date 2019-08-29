//java package(sibasish)
package com.maren.myfirstproject.controller;
//importing all the classes from the packages(sibasish)
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigCtrl(sibasish)
 */
@WebServlet(
		urlPatterns = { "/ConfigCtrl" }, 
		initParams = { 
				//intialization of parameters (sibasish)
				@WebInitParam(name = "UNIV", value = "CUTM"), 
				@WebInitParam(name = "LOC", value = "BBSR")
		})
public class ConfigCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)(sibasish)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig config=getServletConfig();
		//gets the values of initialization parameter with the given name(sibasish)
		String univ166=config.getInitParameter("UNIV");
		String loc166=config.getInitParameter("LOC");
		//to print the content(sibasish)
		response.getWriter().append("University is:"+ univ166 +"at:"+loc166);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)(sibasish)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
