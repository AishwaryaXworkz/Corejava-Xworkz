<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BlinkItApp</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">

</head>
<body>
	<div class="container w-50 border border-dark border-5 mt-5">

		<form action="register" method="post">
			
			<div class="mb-3">
				<label class="form-label">id</label> <input type="tel"
					class="form-control" placeholder=" " name="id">
			</div>


			<div class="mb-3">
				<label class="form-label">email</label> <input type="text"
					class="form-control" placeholder=" " name="email">
			</div>


			<div class="mb-3">
				<label class="form-label">phoneNumber</label> <input type="tel"
					class="form-control" placeholder=" " name="phoneNumber">
			</div>

         <div class="mb-3">
				<label class="form-label">name</label> <input type="text"
					class="form-control" placeholder=" " name="name">
			</div>
			
			<div class="mb-3">
				<label class="form-label">address</label> <input type="text"
					class="form-control" placeholder=" " name="address">
			</div>
			
			<div class="mb-3">
				<label class="form-label">payment</label> <input type="text"
					class="form-control" placeholder=" " name="payment">
			</div>
			<div class="mb-3">
				<label class="form-label">deliver</label> <input type="text"
					class="form-control" placeholder=" " name="deliver">
			</div>
			<div class="mb-3">
				<label class="form-label">deliverPerson</label> <input type="text"
					class="form-control" placeholder=" " name="deliverPerson">
			</div>
			<div class="mb-3">
				<label class="form-label">sharedProducts</label> <input type="text"
					class="form-control" placeholder=" " name="sharedProducts">
			</div>
			<div class="mb-3">
				<label class="form-label">rateBlinkIt</label> <input type="text"
					class="form-control" placeholder=" " name="rateBlinkIt">
			</div>
			
			<input type="submit" class="btn btn-success">

		</form>
	</div>


</body>
</html>