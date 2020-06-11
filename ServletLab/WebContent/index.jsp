<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Claim Academy</title>
<link rel = "stylesheet" type="text/css" href="./styles/styles.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
<form action="RegistrationServlet" method="post" >
  <div class="form-group">
    <label for="firstName">First Name</label>
    <input type="text" class="form-control" name="firstName" id="firstName" placeholder="First Name">
  </div>
    <div class="form-group">
    <label for="lastName">Last Name</label>
    <input type="text" class="form-control" name="lastName" id="lastName" placeholder="Last Name">
  </div>
    <div class="form-group">
    <label for="email">Email address</label>
    <input type="email" class="form-control" name="email" id="exampleInputEmail1" placeholder="Email">
  </div>
  <div class="form-group">
    <label for="Password">Password</label>
    <input type="password" class="form-control" name="passord" id="password">
  </div>
  
  <br>Address<br>
  
  <div class="form-group">
    <label for="street">Street</label>
    <input type="text" class="form-control" name="street" id="street" placeholder="street">
  </div>
  <div class="form-group">
    <label for="city">City</label>
    <input type="text" class="form-control" name="city" id="city" placeholder="city">
  </div>
  <div class="form-group">
    <label for="state">State</label>
    <input type="text" class="form-control" name="state" id="state" placeholder="state">
  </div>
  <div class="form-group">
    <label for="zipCode">Zip Code</label>
    <input type="text" class="form-control" name="zipCode" id="zipCode" placeholder="zipCode">
  </div>
  
    <div class="checkbox">
    <label >
    <input type="checkbox" >Check me out
    </label>
  </div>

  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>