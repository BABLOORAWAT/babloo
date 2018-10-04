

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="impl.CartDAOImpl"%>
<%@page import="dao.CartDAO"%>
<%@page import="model.Product" %>
<%@page import="dao.ProductDAO" %>
<%@page import="impl.ProductDAOImpl" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<%
    CartDAO cdao = new CartDAOImpl();

    String email = request.getParameter("email");
    
    if( email != null )        
        request.setAttribute("cartItems", cdao.getCart( email ));       
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body style=" margin:100px;">
        <p style="font-size: 100px;">Thanks You</p>
        <br>
        <a href="index.html"><input type="button" value="Home" class="btn btn-success btn-lg"></a>
    </body>
</html>
