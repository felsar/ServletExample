package com.felipesarabia.development.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.felipesarabia.development.training.model.*;
/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String firstName = request.getParameter("firstName");
		String lastName= request.getParameter("lastName");
		String bDate = request.getParameter("birthDate");
		Date birthDate = null;
		try {
			birthDate = new SimpleDateFormat("YYYY-MM-DD").parse(bDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String email = request.getParameter("email");
		String yoe = request.getParameter("experience");
		String[] programmingLanguages = request.getParameterValues("programmingLanguages");
		
		out.println("<h1>Registration User Information</h1>");
		out.println("<div>");
		out.println("First Name: "+ firstName);
		out.println("Last Name: "+ lastName);
		out.println("Birth Date: "+ bDate);
		out.println("Email: "+ email);
		out.println("Years of Experience: "+ yoe);
		out.println("Languages: ");
		for(String language: programmingLanguages) {
			out.println("*"+ language);
		}
		out.println("</div>");
		out.close();
		
		Person persona = new Person(firstName, lastName,email,birthDate);
	}

}
