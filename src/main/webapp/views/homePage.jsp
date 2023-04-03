<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<style type="text/css">

 label, a {
	font-size: x-large;
	color: black;
}

.banner-heading {
    letter-spacing: 1rem;
    text-shadow: .1rem .1rem .8rem rgba(0, 0, 0, .4);
   font-size:  xxx-large;
   color : white;
}

.container {

	position: relative;
	z-index: 2;

}

.col {
  margin-top: 200px;
}


</style>
</head>
<body>
	<jsp:include page="header.jsp" />
	
	<div class="container">
	

		<div class="col text-center">
			<h5 style="color:rgb(37, 150, 190)" class="text-uppercase font-weight-bold display-4  banner-heading">welcome
				to Sporty Shoes</h5>
			<a href="/shop"
				class="btn btn-lg btn-outline-primary text-uppercase px-12">
				Buy 
			</a>
		
		</div>
	</div>

	<div id="bg">
		<img src="/images/background.jpg" alt="">
	</div>
</body>
<footer>
	<jsp:include page="footer.jsp" />
</footer>
</html>