<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="form.beans.NoteForm" %>
<%@ page import="mode.sco.Note" %>

<%
    NoteForm nf = (NoteForm) session.getAttribute("nf");
    if (nf == null) {
        // Gérer le cas où l'objet nf n'est pas trouvé dans la session
    }
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Notes</title>
</head>
<body>
    <h1>Liste des notes</h1>
    <table border="1">
        <tr>
            <th>Matière</th>
            <th>Note</th>
        </tr>
        <c:forEach items="${nf.lesNotes}" var="note">
            <tr>
                <td>${note.matiere}</td>
                <td>${note.note}</td>
            </tr>
        </c:forEach>
    </table>
    
    <%
        double total = 0;
        int count = 0;
        for (Note note : nf.getLesNotes()) {
            total += note.getNote();
            count++;
        }
        double moyenne = count > 0 ? total / count : 0;
    %>
    
    <h2>Moyenne des notes : <%= moyenne %></h2>
</body>
</html>
