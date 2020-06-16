package com.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.Course;

/**
 * Servlet implementation class DropServlet
 */
@WebServlet("/DropServlet")
public class DropServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DropServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		ArrayList<Course>courses= (ArrayList<Course>)session.getAttribute("courses");
		courses.remove(Integer.parseInt(request.getParameter("course")));
		double total=0;
		for(int i=0;i<courses.size();i++) {
			total +=courses.get(i).getTuition();
		}
		session.setAttribute("total", total);
		
	
		session.setAttribute("courses", courses);
		//System.out.println("test");
		RequestDispatcher rs = request.getRequestDispatcher("course.jsp");
		rs.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
