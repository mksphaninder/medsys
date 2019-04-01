<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Medsys Registry</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<style><%@include file="/WEB-INF/jsp/index.css"%></style>
</head>
<body>
	<nav role="navigation" class="navbar navbar-inverse">
		<div class="">
			<a class="navbar-brand">MEDsys</a>
		</div>
		<div class="navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="/index">Home</a></li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<form method="POST">
			<div class="form-group">
				First name : <input type="text" name="fname" class="form-control"
					required="required"></input> 
				Last name : <input type="text" name="lname" class="form-control" required="required"></input> 
				Date of birth : <input type="text" name="dob" id="date" class="form-control"
					placeholder="mm/dd/yyyy" required="required"></input> 
				Address 1: <input type="text" name="addr1" class="form-control" required="required"></input>
				Address 2: <input type="text" name="addr2" class="form-control"
					required="required"></input> 
				City : <input type="text" name="city" class="form-control" required="required"></input> 
				State : <input type="text" name="state" class="form-control" required="required"></input>

				Zip-code : <input type="number" name="zip" class="form-control"
					required="required"></input>
			</div>
			<input class="btn btn-primary" type="submit" 
				style="display: block; margin: 0 auto;"></input>
		</form>
		<br>
		<button class="btn btn-primary" id="table_button" onclick="showDiv('toggle')"
			style="display: block; margin: 0 auto;">show</button>
	</div>
	<hr>
	<div id="mytable" style="display:none">
		<div class="container">
				<table class="table table-striped"> 
				<caption>Persons Table</caption>
				<thead>
					<tr>
						<th scope="col">FirstName</th>
						<th scope="col">Last Name</th>
						<th scope="col">Date of Birth</th>
						<th scope="col">Address 1</th>
						<th scope="col">Address 2</th>
						<th scope="col">City</th>
						<th scope="col">State</th>
						<th scope="col">Zip-code</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list }" var="person">
						<tr>
							<td>${person.fname }</td>
							<td>${person.lname }</td>
							<td><fmt:formatDate value="${person.dob }"
							pattern="MM/dd/yyyy"/></td>
							<td>${person.addr1 }</td>
							<td>${person.addr2 }</td>
							<td>${person.city }</td>
							<td>${person.state }</td>
							<td>${person.zip }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>	
	
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<script src="webjars/bootstrap-datepicker/1.0.1/js/bootstrap-datepicker.js"></script>
	<script>
		$('#date').datepicker({
			format: 'mm/dd/yyyy'
		});
	</script>
	<script>
		function showDiv(toggle) {
			document.getElementById("mytable").style.display = 'block';
		}
	</script>
	</body>
</html>