package com.user;

public class Course {
	private String CourseName;
	private String professor;
	private WeekDay[]occurences;
	private String time;
	private String roomNumber;
	private String startDate;
	private double tuition;
	public Course() {
		super();
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public WeekDay[] getOccurences() {
		return occurences;
	}
	public void setOccurences(WeekDay[] occurences) {
		this.occurences = occurences;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	
	
}
	public double getTuition() {
		return tuition;
	}
	public void setTuition(double tuition) {
		this.tuition = tuition;
	}
}
