<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@page import="p1.User"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Authentication</title>
</head>
<body>
        <jsp:useBean id="u" class="p1.User" scope="session"/>
        <jsp:setProperty name="u"  property="mail" param="mail"/>
        <jsp:setProperty name="u"  property="password" param="password"/>
        <jsp:forward page="affich2"/>
        
        
</body>
</html>
