<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.user.Student"  %>
<%Student student = (Student)session.getAttribute("student");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BMI Calculator</title>
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
      <h2>My BMI</h2>
      <p><% out.print(student.getBmi()); %></p>
    </div>
     <div class="col-md-4">
      <h2>Enter Height</h2>
      <form action="BmiServlet" method=post>
      	<div class = "form-group">
      		<lable for="height">Height</lable>
      		<input type = "text" class="form-control" name="hight" id="hight" placeholder="Height">
      	</div>
      	<div class = "form-group">
      		<lable for="weight">Weight</lable>
      		<input type = "text" class="form-control" name="weight" id="weight" placeholder="Weight">
      	</div>

      	<button type="submit" class="btn btn-default">Submit</button>
      </form>
     </div>
    <hr>
    <footer>
    <p>&copy;2017 Company,Inc</p>
    </footer>
   
  </div>

</div>
</body>
</html>