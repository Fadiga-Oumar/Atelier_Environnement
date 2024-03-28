<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="p1.User"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Display User Info</title>
</head>
<body>
    <%
    User u = (User) session.getAttribute("user");
    if (u != null) {
    %>
    <h1>Votre Adresse mail est : <%= u.getMail() %></h1>
    <h1>Votre Mot de passe est : <%= u.getPassword() %></h1>
    <% } else { %>
    <p>Aucun utilisateur n'est connecté.</p>
    <% } %>
</body>
</html>
