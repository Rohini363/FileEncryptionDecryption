<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Encryption Result</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container">
<%
String result = (String) request.getAttribute("result");
String operation = (String) request.getAttribute("operation");

    if (result == null || operation == null) {
%>
    <h2>No result to display</h2>
    <p>Please <a href="index.html" style="color:#ffd700;">go back</a> and upload a file.</p>
<%
    } else {
%>
    <h2>✅ <%= operation.toUpperCase() %> Result</h2>
    <textarea rows="15" style="width:100%; border-radius: 10px; padding: 10px;"><%= result %></textarea>
    <br><br>
    <a href="index.html"><button>🔁 Try Another File</button></a>
<%
        session.removeAttribute("result");
        session.removeAttribute("operation");
    }
%>
</div>
</body>
</html>
