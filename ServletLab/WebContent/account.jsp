<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.user.Student"  %>
<%Student student = (Student)session.getAttribute("student");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
<!-- Navbar -->
<div class="fixed-top">
  <div class="collapse" id="navbarToggleExternalContent">
    <div class="bg-dark p-4">
      <h5 class="text-white h4">Collapsed content</h5>
      <span class="text-muted">Toggleable via the navbar brand.</span>
    </div>
  </div>
  <nav class="navbar navbar-dark bg-dark">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarToggleExternalContent" aria-controls="navbarToggleExternalContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    Welcome To<% out.print(student.getSchoolName()); %>
  </nav>
</div>
<!-- Jumbotron -->
<div class="jumbotron jumbotron-fluid">
  <div class="container">
    <h1 class="display-4">Hello, <%out.print(student.getFirstName()); %></h1>
    <p class="lead">This is a simple java servlet program for a functional website.</p>
  </div>
</div>
<!-- Containers -->
<div class="container">
  <div class="row">
    <div class="col-md-4">
      <h2>My GPA</h2>
      <p><% out.print(student.getGpa()); %></p>
    </div>
     <div class="col-md-4">
      <h2>Enter Grades</h2>
      <form action="GpaServlet" method=post>
      	<div class = "form-group">
      		<lable for="gradeOne">GradeOne</lable>
      		<input type = "text" class="form-control" name="gradeOne" id="gradeOne" placeholder="Grade One">
      	</div>
      	<div class = "form-group">
      		<lable for="gradeTwo">GradeTwo</lable>
      		<input type = "text" class="form-control" name="gradeTwo" id="gradeTwo" placeholder="Grade Two">
      	</div>
        <div class = "form-group">
      		<lable for="gradeThree">GradeThree</lable>
      		<input type = "text" class="form-control" name="gradeThree" id="gradeThree" placeholder="Grade Three">
      	<button type="submit" class="btn btn-default">Submit</button>
      	</div>
      </form>
     </div>
    <hr>
    <a href="/bmi.jsp">Visit BMI!</a>
    <footer>
    <p>&copy;2017 Company,Inc</p>
    </footer>
   
  </div>

</div>
</body>
</html>