<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Shaman">
    
    <title>Military Ants</title>

    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
        
    <!-- Custom styles for this template -->
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">
    <script src="assets/js/jquery.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->

	  <div id="login-page">
	  	<div class="container">
                    <c:url var="loginUrl" value="/login" />
		      <form class="form-login" action="${loginUrl}" method="post" >
		        <h2 class="form-login-heading">sign in now</h2>
		        <div class="login-wrap">
                            <c:if test="${param.error != null}">
                                    <div class="alert alert-danger">
                                            <p>Invalid username and password.</p>
                                    </div>
                            </c:if>
                            <c:if test="${param.logout != null}">
                                    <div class="alert alert-success">
                                            <p>You have been logged out successfully.</p>
                                    </div>
                            </c:if>
                            
                            <input type="text" class="form-control"  id="username" name="ssoId" placeholder="User ID" autofocus required>
		            <br>
		            <input type="password" class="form-control" id="password" name="password" placeholder="Password" required>
                            <input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />
                            <br>
		            <button class="btn btn-theme btn-block" href="${loginUrl}" type="submit"><i class="fa fa-lock"></i> SIGN IN</button>
         

		
		        </div>	          
		
		      </form>	  	
	  	
	  	</div>
	  </div>

    <!-- js placed at the end of the document so the pages load faster -->
    <!--BACKSTRETCH-->
    <!-- You can use an image of whatever size. This script will stretch to fit in any screen size.-->
    <script type="text/javascript" src="assets/js/jquery.backstretch.min.js"></script>
    <script>
        $.backstretch("assets/img/login-bg.jpg", {speed: 500});        
    </script>


  </body>
</html>
