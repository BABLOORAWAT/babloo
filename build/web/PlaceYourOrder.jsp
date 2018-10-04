<%-- 
    Document   : PlaceYourOrder
    Created on : Sep 28, 2018, 4:46:49 PM
    Author     : BABLOO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <head>
    <body style="width: 75%; margin: auto; margin-top: 55px;" >
        <form action="UpdateAddressCart" method="post">
            <input type="hidden" name="email" value="${param.email}"/>
        
        <textarea name="shippingaddress" class="form-control" placeholder="Enter your Billing address" style="height: 140px;"></textarea><br>
         <textarea name="billingaddress" class="form-control" placeholder="Enter your Shipping address" style="height: 140px;"></textarea><br>
         <input type="submit" value="place your order" class="btn btn-success btn-lg" style="background-color: red"><br>
         
                
        </form>     
    </body>
</html>
