<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>To-do list</title>
<style>
#prevDiv {
    background-color:black;
    color:white;
    text-align:center;
    padding:40px;
}
#addDiv {
    line-height:30px;
    background-color:#eeeeee;
    height:300px;
    width:50px;
    float:left;
    padding:5px; 
}
#noteDiv{
    width:350px;
    float:left;
    padding:10px; 
}
#nextDiv {
    background-color:black;
    color:white;
    clear:both;
    text-align:center;
    padding:40px; 
}
</style>
</head>

<body>

<div id="prevDiv">
<form action="Prev" method="post">
<input type="hidden" value="${currVal}" name="count"/>
<input type="submit"/>
</form>
</div>

<div id="addDiv">
	<a href="addactivity.jsp">+</a>
</div>

<div id="noteDiv">
	${currNote }
</p>
</div>

<div id="nextDiv">
<form action="Next" method="post">
<input type="hidden" value="${currVal}" name="count"/>
<input type="submit"/>
</form>
</div>

</body>
</html>