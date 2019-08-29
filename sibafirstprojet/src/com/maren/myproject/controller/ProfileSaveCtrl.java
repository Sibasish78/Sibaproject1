//java package(sibasish)
package com.maren.myproject.controller;
//importing all the classes from the packages(sibasish)
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maren.myproject.model.Profile;


@WebServlet("/ProfileSaveCtrl")     
public class ProfileSaveCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)(sibasish)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//creating a new object profile166 of the class(sibasish)
		Profile profile166 = new Profile();
		// the set method would set the value and get method will return the variable value(sibasish)
		profile166.setUserid(request.getParameter("userid"));
		profile166.setName(request.getParameter("name"));
		profile166.setEmail(request.getParameter("email"));
		//here long class is use parse the charsequence argument as a signed long with specified radix(sibasish)
		profile166.setMobile(Long.parseLong(request.getParameter("mobile")));
		// save in database
		int res = new com.maren.myfirstproject.dao.ProfileDao().save(profile166);
		//to set the attribute
		request.setAttribute("RES", res);
		//getrequestdispatecher provides the facility of dispatching the request to another resource i.e. servlet,jsp or html(sibasish)
		request.getRequestDispatcher("/ProfileViewCtrl").forward(request, response);
	}

}
