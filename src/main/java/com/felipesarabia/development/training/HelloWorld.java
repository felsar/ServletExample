package com.felipesarabia.development.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    /**
     * doGet and doPost will call this method
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//Set response type as html
    	response.setContentType("text/html; charset=UTF-8"); 
    	//Create a outpur as response.getWriter
    	PrintWriter output = response.getWriter();
    	output.println("<!DOCTYPE html>"+
    			"<html><head></head>"+
    			"<body>"+
    			"<h1>Hello World</h1>"+
    			"<span>By Felipe Sarabia</h1>"+
    			"</body>"+
    			"</html>"
    	);
    	//Close the output
    	output.close();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	

}
