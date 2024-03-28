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
    <%
    String mail=request.getParameter("mail");
    String password=request.getParameter("password");
    
    User u=new User();
    u.setMail(mail);
    u.setPassword(password);
    session.setAttribute("user",u);
    response.sendRedirect("affich1.jsp");
    %>
</body>
</html>
