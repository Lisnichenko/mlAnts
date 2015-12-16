<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="mes"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
        <!-- Bootstrap core CSS -->
        <link href="assets/css/bootstrap.css" rel="stylesheet">
        <!--external css-->
        <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
        <link rel="stylesheet" type="text/css" href="assets/css/zabuto_calendar.css">
        <link rel="stylesheet" type="text/css" href="assets/js/gritter/css/jquery.gritter.css" />
        <link rel="stylesheet" type="text/css" href="assets/lineicons/style.css">    

        <!-- Custom styles for this template -->
        <link href="assets/css/style.css" rel="stylesheet">
        <link href="assets/css/style-responsive.css" rel="stylesheet">

        <script src="assets/js/chart-master/Chart.js"></script>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title><mes:message code="soldier_list.title"/></title>
</head>
<body>
    <section id="container" >
        <jsp:include page="header.jsp" />
        <jsp:include page="menu.jsp" />
            <section id="main-content">
                <section class="wrapper">
<div class="row mt">
                  <div class="col-md-12">
                      <div class="content-panel">
                          <table id="allSoldier" class="tablesorter table table-striped table-advance table-hover">
	                  	  	  <h4><i class="fa fa-angle-right"></i> <mes:message code="soldier_list.all_soldiers"/>
                                          <!--</h4>-->
                                          <div class="btn-group pull-right">
						  <button type="button" class="btn btn-theme04 dropdown-toggle" data-toggle="dropdown">
						    Action <span class="caret"></span>
						  </button>
						  <ul class="dropdown-menu" role="menu">
						    <li><a href="#">Action</a></li>
						    <li><a href="#">Another action</a></li>
						    <li><a href="#">Something else here</a></li>
						    <li class="divider"></li>
						    <li><a href="#">Separated link</a></li>
						  </ul>
						</div>
                                          </h4>
	                  	  	  <hr>
                              <thead>
                              <tr>
                                  <th><mes:message code="soldier_list.name"/></th>
                                  <th><mes:message code="soldier_list.subdivision"/></th>
                                  <th><mes:message code="soldier_list.profile"/></th>
                                  <th><mes:message code="soldier_list.is_ready"/></th>
                                  <th><mes:message code="soldier_list.status"/></th>
                                  <th></th>
                              </tr>
                              </thead>
                              <tbody>
                              <c:forEach var="soldier" items="${soldiers}" varStatus="status">    
                              <tr>
                                  <c:set var="soldierFormId" value="soldier{status.index}"/>
                                  <td><a href="soldier.html/#">${soldier.fullName}</a></td>
                                  <td>${soldier.subdivision}</td>
                                  
                                  <td>${soldier.allProfile}</td>
                                  <td>${soldier.readiness}</td>
                                  <td>${soldier.status}</td>
                                  <td>
                                      <button class="btn btn-success btn-xs"><i class="fa fa-check"></i></button>
                                      <button class="btn btn-primary btn-xs"><i class="fa fa-pencil"></i></button>
                                      <button class="btn btn-danger btn-xs"><i class="fa fa-trash-o "></i></button>
                                  </td>
                              </tr>                              
                              </c:forEach>
                              </tbody>
                          </table>
                      </div><!-- /content-panel -->
                  <br>
                  <button type="button" class="btn btn-success">Add Soldier</button>
                  <br>
                  </div><!-- /col-md-12 -->
</div><!-- /row mt -->
                </section>
            </section>

        <jsp:include page="footer.jsp" />  
    </section>
       <!-- js placed at the end of the document so the pages load faster -->
    <script src="assets/js/jquery.js"></script>
    <script src="assets/js/jquery-1.8.3.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script class="include" type="text/javascript" src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
    <script src="assets/js/jquery.scrollTo.min.js"></script>
    <script src="assets/js/jquery.nicescroll.js" type="text/javascript"></script>
    <script src="assets/js/jquery.sparkline.js"></script>


    <!--common script for all pages-->
    <script src="assets/js/common-scripts.js"></script>
    
    <script type="text/javascript" src="assets/js/gritter/js/jquery.gritter.js"></script>
    <script type="text/javascript" src="assets/js/gritter-conf.js"></script>

    <!--script for this page-->
    <script src="assets/js/sparkline-chart.js"></script>    
    <script src="assets/js/zabuto_calendar.js"></script>
    
    <!-- Make table Sortable #allSoldier-->
    <script src="assets/js/jquery.tablesorter.js"></script>
    <script>
    $(document).ready(function() 
    { 
        $("#allSoldier").tablesorter(); 
    } 
    ); 
    </script>
    <!-- Make table Sortable -->
</body>

</html>