<%@taglib uri="http://www.springframework.org/tags" prefix="mes"%>
<aside>
    <div id="sidebar"  class="nav-collapse ">
        <!-- sidebar menu start-->
        <ul class="sidebar-menu" id="nav-accordion">

            <p class="centered"><a href="profile.html"><img src="assets/img/ui-sam.jpg" class="img-circle" width="60"></a></p>
            <h5 class="centered">Military Ants</h5> 

            <li class="sub-menu">
                <a class="active" href="soldiers_list">
                    <i class="fa fa-dashboard"></i>
                    <span><mes:message code="soldier_list.all_soldiers"/></span>
                </a>
          
            </li>
            <li class="sub-menu">
                <a href="units_list">
                    <i class="fa fa-dashboard"></i>
                    <span><mes:message code="menu.Units"/></span>
                </a>
            </li>     
            <li class="sub-menu">
                <a href="profiles_list">
                    <i class="fa fa-dashboard"></i>
                    <span><mes:message code="menu.Profiles"/></span>
                </a>
            </li>
            <li class="sub-menu">
                <a href="items_list">
                    <i class="fa fa-dashboard"></i>
                    <span><mes:message code="menu.Material_assets"/></span>
                </a>
            </li>     
             <li class="sub-menu">
                <a href="javascript:;" >
                    <i class="fa fa-desktop"></i>
                    <span><mes:message code="menu.Stock"/></span>
                </a>
                <ul class="sub">
                    <li><a  href=""><mes:message code="menu.All_property"/></a></li>
                </ul>
                <ul class="sub">
                    <li><a  href=""><mes:message code="menu.Given_out"/></a></li>
                </ul>
                <ul class="sub">
                    <li><a  href=""><mes:message code="menu.Remains"/></a></li>
                </ul>
                <ul class="sub">
                    <li><a  href=""><mes:message code="menu.Requests"/></a></li>
                </ul>          
                <ul class="sub">
                    <li><a  href=""><mes:message code="menu.Repairs"/></a></li>
                </ul>
                <ul class="sub">
                    <li><a  href=""><mes:message code="menu.Cancellation"/></a></li>
                </ul>
                <ul class="sub">
                    <li><a  href=""><mes:message code="menu.Coming"/></a></li>
                </ul>
                <ul class="sub">
                    <li><a  href=""><mes:message code="menu.Notification"/></a></li>
                </ul>
                
            </li>

        </ul>
        <!-- sidebar menu end-->
    </div>
</aside>