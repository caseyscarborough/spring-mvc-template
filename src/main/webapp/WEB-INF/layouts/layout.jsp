<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title></title>
  <link rel="stylesheet" type="text/css" href="<spring:url value="/resources/main.css" />">
</head>
<body>
<div id="header">
  <tiles:insertAttribute name="header" />
</div>

<div id="content">
  <tiles:insertAttribute name="body" />
</div>

<div id="footer">
  <tiles:insertAttribute name="footer" />
</div>
</body>
</html>