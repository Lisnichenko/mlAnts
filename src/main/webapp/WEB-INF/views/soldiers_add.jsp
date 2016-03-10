<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="mes"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    
                   <div class="btn-group pull-right">
                                    <button type="button" id="add_positions" class="btn btn-theme04">More positions</button>
                                </div>
                 
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
    
    <script>
        $(document).ready(function(){
            $("#add_positions").click(function(){
                var position_counts = parseInt($("#position_counts").val())+1 ;
                var html_position = "<div class=\"form-group\">"+
                        "<label class=\"col-sm-2 control-label\">Position Name</label><div class=\"col-sm-3\">"+
                        "<input id=\"positionNameInput\" name=\"position[" + position_counts + 
                        "].name\" class=\"form-control\" value=\"\" type=\"text\">"+
                        "</div><label class=\"col-sm-2 control-label\">Position Count</label><div class=\"col-sm-3\">"+
                        "<input id=\"positionCountInput\" name=\"position[" + position_counts + 
                        "].count\" class=\"form-control\" value=\"0\" type=\"text\">"+
                        "</div></div>";
                $(".add_new_position").prepend(html_position);
                $("#position_counts").val(position_counts);
                $("body").getNiceScroll().resize();
            });
        });
    </script>
</body>

</html>