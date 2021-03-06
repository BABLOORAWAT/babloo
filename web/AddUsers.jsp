<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
    </head>
    <body style="margin: auto; width: 80%;">
        <div id="register">
        <h1> Register New User </h1>
    
        <form action="AddUsers" method="post">
            
            <h3>First Name:</h3>
            <input type="text" name="firstname" <c:if test="${not empty AddUsers}"> value="${AddUsers.getFirstname()}" </c:if> class="form-control" required>
            <h3>Last Name:</h3>
            <input type="text" name="lastname" <c:if test="${not empty AddUsers}"> value="${AddUsers.getLastname()}" </c:if> class="form-control" required>
            
            
            <h3>Email:</h3>
            <input type="email" name="email" <c:if test="${not empty AddUsers}"> value="${AddUsers.getEmail()}" </c:if> c class="form-control" required>
            
            <c:if test="${not empty errorsMap.email}">
               
                <c:forEach items="${errorsMap.email}" var="x">
                    <br>
                    <div class="alert alert-danger">${x}</div>
                </c:forEach>
                
                
            </c:if>
            
            <h3>Phone No:</h3>
            <input type="number" name="mobile" <c:if test="${not empty AddUsers}"> value="${AddUsers.getMobile()}" </c:if> class="form-control" required>
           
            <c:if test="${not empty errorsMap.mobile}">
                
                <c:forEach items="${errorsMap.mobile}" var="x">
                    <br>
                    <div class="alert alert-danger">${x}</div>
                </c:forEach>
                
                
            </c:if>
            
            <h3>Password:</h3>
            <input type="password" name="password" class="form-control" required>
            
            <h3>Confirm Password:</h3>
            <input type="password" name="cpassword" class="form-control" required>
            
            <c:if test="${not empty errorsMap.matchpasswords}">
                
                <c:forEach items="${errorsMap.matchpasswords}" var="x">
                    <br>
                    <div class="alert alert-danger">${x}</div>
                </c:forEach>
                
                
            </c:if>
            
            <h3>Address:</h3>
            <textarea name="address" class="form-control" required><c:if test="${not empty AddUsers}">${AddUsers.getAddress()}</c:if></textarea>
            
            <c:if test="${not empty errorsMap.address}">
                
                <c:forEach items="${errorsMap.address}" var="x">
                    <br>
                    <div class="alert alert-danger">${x}</div>
                </c:forEach>
                
                
            </c:if>
            
            <br>
            
            <input type="submit" value="Submit" class="btn btn-lg btn-success">
            
            
        </form>
        </div>
    </body>
</html>