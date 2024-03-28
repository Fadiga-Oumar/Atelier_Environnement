<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@page import="java.util.Date"%>
<%@page import="java.net.InetAddress"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insert title here</title>
</head>
<body>
    <p>Nous sommes le <% out.println(new Date()); %></p>
    <p>Le nom de votre machine est : <% out.println(System.getProperty("user.name")); %></p>
    
    <% 
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            out.println("<p>Votre adresse IP est : " + localhost.getHostAddress() + "</p>");
        } catch (Exception e) {
            out.println("<p>Erreur lors de la récupération de l'adresse IP.</p>");
        }
    %>
    
    <p>Le nom de votre serveur sur lequel vous êtes connecté est : <% out.println(request.getServerName()); %></p>
</body>
</html>
