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
import com.user.WeekDay;

/**
 * Servlet implementation class SchedulerServlet
 */
@WebServlet("/SchedulerServlet")
public class SchedulerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SchedulerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		Course course = new Course();
		String[] weekdays = request.getParameterValues("weekday");
		WeekDay[]days = new WeekDay[weekdays.length];
		
		for(int i=0;i<weekdays.length;i++) {
			days[i]=WeekDay.valueOf(weekdays[i]);
		}
		
		Double creditHour = Double.parseDouble(request.getParameter("creditHours"));
		
		double tuitionFee= (creditHour*850)*(1.04225);
		
		course.setCourseName(request.getParameter("courseName"));
		course.setProfessor(request.getParameter("professor"));
		course.setOccurences(days);
		course.setRoomNumber(request.getParameter("roomNumber"));
		course.setStartDate(request.getParameter("startDate"));
		course.setTime(request.getParameter("time"));
		course.setCreditHour(creditHour);
		
		
	
		
		course.setTuition(tuitionFee);
		
		HttpSession session = request.getSession(true);
		ArrayList<Course>courses= (ArrayList<Course>)session.getAttribute("courses");
		if(courses == null) {
			courses= new ArrayList<Course>();
		}
		
		courses.add(course);
		
		double total=0;
		for(int i=0;i<courses.size();i++) {
			total +=courses.get(i).getTuition();
		}
		session.setAttribute("total", total);
		
		
		
		session.setAttribute("courses", courses);
		
		RequestDispatcher rs = request.getRequestDispatcher("course.jsp");
		rs.forward(request, response);
	}

}
