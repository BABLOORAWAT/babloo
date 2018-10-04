 <%@page import="model.Product" %>
<%@page import="dao.ProductDAO" %>
<%@page import="impl.ProductDAOImpl" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
ProductDAO udao = new ProductDAOImpl();

request.setAttribute("Product", udao.getProduct());
%>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style> 
      body{
          font-style: italic Helvetica sans-serif;
      }

  h2 {

    text-align: center;
  }
 h3 {
  color: black;
  cursor: pointer;
  text-align: center;

 }

 h4 {
  margin-left: 90px;
  color: green;
  margin-right: 50px;
  cursor: pointer;
 }

 h1 {

  font-size: 30px;

 }
.thumbnail{
  margin-top:40px;
  transition:all 0.5s;

}
.thumbnail:hover{
transform:scale(1.05);

}

P {
  font-size: 30px;
  text-align: center;
}




</style>
</head>
<body>

 <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">CATEGORIES<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="Offers zone.html">MensWear</a></li>
          <li><a href="">KidsWear</a></li>
        </ul>
      </li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="AddUsers.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="Login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>

  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="img3.jpg" alt="Los Angeles" style="width:100%;">
      </div>

      <div class="item">
        <img src="img2.png" alt="Chicago" style=width:100%;">
      </div>
    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
  <div class="container">
    <div id="heading block">




  



<!---------------------------------->
<H2>FASHION ZONE</H2>
 <div class="row">
     <c:forEach items="${Product}" var="x">
    <div class="col-md-3">
      <div class="thumbnail">
          <img src="${x.getImage()}" style="height: 180px; cursor: pointer;">
          <div class="caption">
            <h3>${x.getProductname()}</h3>
            <h4>${x.getPrice()}</h4>
            <a href="ViewSingleProduct.jsp?id=${x.getId()}"><button class="snip1547"><span>Add to Cart</span></button></a>

          </div>
      </div>
    </div>
     </c:forEach>
           </div>
</div>
 </div>
<p>Latest</p>
<div class="row">
    <div class="col-md-3">
      <div class="thumbnail">
          <img src="l1.jpeg" style="height: 170px;"cursor: pointer;">
          <div class="caption">
            <h3>Mi LED Smart TV 4A 108cm(43)</h3>
            <h4>₹22.999</h4>
             <button class="snip1547"><span>Add to Cart</span></button>
<button class="snip1547"><span>Buy Now</span></button>
          </div>
      </div>
    </div>
    <div class="col-md-3">
      <div class="thumbnail">
    
          <img src="l2.jpg" style="height: 140px;"cursor: pointer;">
          <div class="caption">
            <h3>MuscleBlaze Whey Gold Protein, 2 KG Rich Milk Chocolate</h3>
            <h4>₹4,498</h4>
            <button class="snip1547"><span>Add to Cart</span></button>
<button class="snip1547"><span>Buy Now</span></button>
          </div>
    
      </div>
    </div>
    <div class="col-md-3">
      <div class="thumbnail">
    
          <img src="l3.jpg" style="height: 170px;"cursor: pointer;">
          <div class="caption">
          <h3>Honor 7X (Blue, 4GB RAM + 32GB Memory</h3>
          <h4>₹11,999</h4>
           <button class="snip1547"><span>Add to Cart</span></button>
<button class="snip1547"><span>Buy Now</span></button>
          </div>
    
      </div>
    </div>
    <div class="col-md-3">
      <div class="thumbnail">
    
          <img src="l4.jpg" style="height: 160px; cursor: pointer;">
          <div class="caption">
            <h3>Feed Up Combo Of 5 Men's Shirts 42 (Multicolored)</h3>
            <h4>₹1,499</h4>
           <button class="snip1547"><span>Add to Cart</span></button>
<button class="snip1547"><span>Buy Now</span></button>
          </div>
           </div>
</div>
<h3>Handpicked Deals</h3>
<div class="row">
    <div class="col-md-3">
      <div class="thumbnail">
          <img src="h1.jpg" style="height: 175px;"cursor: pointer;">
          <div class="caption">
            <h3>Delize Men's Black Casual Shoes</h3>
            <h4>₹1519</h4>
            <button class="snip1547"><span>Add to Cart</span></button>
<button class="snip1547"><span>Buy Now</span></button>
          </div>
      </div>
    </div>
    <div class="col-md-3">
      <div class="thumbnail">
    
          <img src="h2.jpg" style="height: 155px;"cursor: pointer;">
          <div class="caption">
            <h3>Maharaja Whiteline 1000 W ABS Dry Iron-Classico DLX</h3>
            <h4>₹1019</h4>
            
           <button class="snip1547"><span>Add to Cart</span></button>
<button class="snip1547"><span>Buy Now</span></button>
          </div>
    
      </div>
    </div>
    <div class="col-md-3">
      <div class="thumbnail">
    
          <img src="h3.jpg" style="height: 158px;"cursor: pointer;">
          <div class="caption">
          <h3>TSX Red, White and Black Collar T-Shirt Combo</h3>
          <h4>₹749</h4>
           <button class="snip1547"><span>Add to Cart</span></button>
<button class="snip1547"><span>Buy Now</span></button>
          </div>
    
      </div>
    </div>
    <div class="col-md-3">
      <div class="thumbnail">
    
          <img src="h4.jpg" style="height: 130px; cursor: pointer;">
          <div class="caption">
            <h3>Men's Floaters, Sporters Slip On. Casual Shoes & T-Shirt...</h3>
            <h4>₹1149</h4>
           <button class="snip1547"><span>Add to Cart</span></button>
<button class="snip1547"><span>Buy Now</span></button>
          </div>
           </div>
</div>


          
</body>
</html>
