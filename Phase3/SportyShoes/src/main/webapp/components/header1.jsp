<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<nav class="navbar navbar-expand-lg fixed-top navbar-light headerback"  style="background-color:#FFFDD0;">
  <a class="navbar-brand text-success logo" href="<%=request.getContextPath()%>/home" style="font-size: 31px;font-color:#000000; font-weight: bold; ">SPORTY SHOES</a>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link text-success" href="<%=request.getContextPath()%>/home" style="font-size: 25px; font-weight: bold; ">HOMEPAGE</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
    
		<c:if test = "${user_id != null }">
			<a style="margin-right: 6px; font-weight: bold;" class="btn btn-outline-success my-2 my-sm-0 buttonstylehome" type="submit" href="/dashboard">DASHBOARD</a>
        	<a style="margin-right: 6px; font-weight: bold;" class="btn btn-outline-success my-2 my-sm-0 buttonstylehome" type="submit" href="/logout">LOGOUT</a>
		</c:if>
		<c:if test = "${admin_id != null }">
			<a style="margin-right: 6px; font-weight: bold;" class="btn btn-outline-success my-2 my-sm-0 buttonstylehome" type="submit" href="/admindashboard">DASHBOARD</a>
        	<a style="margin-right: 6px; font-weight: bold;" class="btn btn-outline-success my-2 my-sm-0 buttonstylehome" type="submit" href="/logout">LOGOUT</a>
		</c:if>
			<c:if test ="${user_id == null && admin_id == null}">
			<a style="margin-right: 6px; font-weight: bold;" class="btn btn-outline-success my-2 my-sm-0 login" type="submit" href="/login">LOGIN</a>
		</c:if>
		
    </form>
  </div>
</nav>