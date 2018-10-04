package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Product;
import dao.ProductDAO;
import impl.ProductDAOImpl;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

ProductDAO udao = new ProductDAOImpl();

request.setAttribute("Product", udao.getProduct());

      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Bootstrap Example</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <style> \n");
      out.write("      body{\n");
      out.write("          font-style: italic Helvetica sans-serif;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("  h2 {\n");
      out.write("\n");
      out.write("    text-align: center;\n");
      out.write("  }\n");
      out.write(" h3 {\n");
      out.write("  color: black;\n");
      out.write("  cursor: pointer;\n");
      out.write("  text-align: center;\n");
      out.write("\n");
      out.write(" }\n");
      out.write("\n");
      out.write(" h4 {\n");
      out.write("  margin-left: 90px;\n");
      out.write("  color: green;\n");
      out.write("  margin-right: 50px;\n");
      out.write("  cursor: pointer;\n");
      out.write(" }\n");
      out.write("\n");
      out.write(" h1 {\n");
      out.write("\n");
      out.write("  font-size: 30px;\n");
      out.write("\n");
      out.write(" }\n");
      out.write(".thumbnail{\n");
      out.write("  margin-top:40px;\n");
      out.write("  transition:all 0.5s;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".thumbnail:hover{\n");
      out.write("transform:scale(1.05);\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("P {\n");
      out.write("  font-size: 30px;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write(" <nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("      <li class=\"active\"><a href=\"\">Home</a></li>\n");
      out.write("      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">CATEGORIES<span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"Offers zone.html\">OFFERS ZONE</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("      <li><a href=\"CONTACT US.html\">CART</a></li>\n");
      out.write("      <li><a href=\"ProductSuccess.jsp\">Product</a></li>\n");
      out.write("    </ul>\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("      <li><a href=\"AddUsers.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("      <li><a href=\"Login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("  <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("    <!-- Indicators -->\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- Wrapper for slides -->\n");
      out.write("    <div class=\"carousel-inner\">\n");
      out.write("      <div class=\"item active\">\n");
      out.write("        <img src=\"img3.jpg\" alt=\"Los Angeles\" style=\"width:100%;\">\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img src=\"img2.png\" alt=\"Chicago\" style=width:100%;\">\n");
      out.write("      </div>\n");
      out.write("    <!-- Left and right controls -->\n");
      out.write("    <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("      <span class=\"sr-only\">Previous</span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("      <span class=\"sr-only\">Next</span>\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div id=\"heading block\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!---------------------------------->\n");
      out.write("<H2>Mobile New Launches</H2>\n");
      out.write(" <div class=\"row\">\n");
      out.write("     ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("           </div>\n");
      out.write("</div>\n");
      out.write(" </div>\n");
      out.write("<p>Latest</p>\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("      <div class=\"thumbnail\">\n");
      out.write("          <img src=\"l1.jpeg\" style=\"height: 170px;\"cursor: pointer;\">\n");
      out.write("          <div class=\"caption\">\n");
      out.write("            <h3>Mi LED Smart TV 4A 108cm(43)</h3>\n");
      out.write("            <h4>₹22.999</h4>\n");
      out.write("             <button class=\"snip1547\"><span>Add to Cart</span></button>\n");
      out.write("<button class=\"snip1547\"><span>Buy Now</span></button>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("      <div class=\"thumbnail\">\n");
      out.write("    \n");
      out.write("          <img src=\"l2.jpg\" style=\"height: 140px;\"cursor: pointer;\">\n");
      out.write("          <div class=\"caption\">\n");
      out.write("            <h3>MuscleBlaze Whey Gold Protein, 2 KG Rich Milk Chocolate</h3>\n");
      out.write("            <h4>₹4,498</h4>\n");
      out.write("            <button class=\"snip1547\"><span>Add to Cart</span></button>\n");
      out.write("<button class=\"snip1547\"><span>Buy Now</span></button>\n");
      out.write("          </div>\n");
      out.write("    \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("      <div class=\"thumbnail\">\n");
      out.write("    \n");
      out.write("          <img src=\"l3.jpg\" style=\"height: 170px;\"cursor: pointer;\">\n");
      out.write("          <div class=\"caption\">\n");
      out.write("          <h3>Honor 7X (Blue, 4GB RAM + 32GB Memory</h3>\n");
      out.write("          <h4>₹11,999</h4>\n");
      out.write("           <button class=\"snip1547\"><span>Add to Cart</span></button>\n");
      out.write("<button class=\"snip1547\"><span>Buy Now</span></button>\n");
      out.write("          </div>\n");
      out.write("    \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("      <div class=\"thumbnail\">\n");
      out.write("    \n");
      out.write("          <img src=\"l4.jpg\" style=\"height: 160px; cursor: pointer;\">\n");
      out.write("          <div class=\"caption\">\n");
      out.write("            <h3>Feed Up Combo Of 5 Men's Shirts 42 (Multicolored)</h3>\n");
      out.write("            <h4>₹1,499</h4>\n");
      out.write("           <button class=\"snip1547\"><span>Add to Cart</span></button>\n");
      out.write("<button class=\"snip1547\"><span>Buy Now</span></button>\n");
      out.write("          </div>\n");
      out.write("           </div>\n");
      out.write("</div>\n");
      out.write("<h3>Handpicked Deals</h3>\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("      <div class=\"thumbnail\">\n");
      out.write("          <img src=\"h1.jpg\" style=\"height: 175px;\"cursor: pointer;\">\n");
      out.write("          <div class=\"caption\">\n");
      out.write("            <h3>Delize Men's Black Casual Shoes</h3>\n");
      out.write("            <h4>₹1519</h4>\n");
      out.write("            <button class=\"snip1547\"><span>Add to Cart</span></button>\n");
      out.write("<button class=\"snip1547\"><span>Buy Now</span></button>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("      <div class=\"thumbnail\">\n");
      out.write("    \n");
      out.write("          <img src=\"h2.jpg\" style=\"height: 155px;\"cursor: pointer;\">\n");
      out.write("          <div class=\"caption\">\n");
      out.write("            <h3>Maharaja Whiteline 1000 W ABS Dry Iron-Classico DLX</h3>\n");
      out.write("            <h4>₹1019</h4>\n");
      out.write("            \n");
      out.write("           <button class=\"snip1547\"><span>Add to Cart</span></button>\n");
      out.write("<button class=\"snip1547\"><span>Buy Now</span></button>\n");
      out.write("          </div>\n");
      out.write("    \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("      <div class=\"thumbnail\">\n");
      out.write("    \n");
      out.write("          <img src=\"h3.jpg\" style=\"height: 158px;\"cursor: pointer;\">\n");
      out.write("          <div class=\"caption\">\n");
      out.write("          <h3>TSX Red, White and Black Collar T-Shirt Combo</h3>\n");
      out.write("          <h4>₹749</h4>\n");
      out.write("           <button class=\"snip1547\"><span>Add to Cart</span></button>\n");
      out.write("<button class=\"snip1547\"><span>Buy Now</span></button>\n");
      out.write("          </div>\n");
      out.write("    \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("      <div class=\"thumbnail\">\n");
      out.write("    \n");
      out.write("          <img src=\"h4.jpg\" style=\"height: 130px; cursor: pointer;\">\n");
      out.write("          <div class=\"caption\">\n");
      out.write("            <h3>Men's Floaters, Sporters Slip On. Casual Shoes & T-Shirt...</h3>\n");
      out.write("            <h4>₹1149</h4>\n");
      out.write("           <button class=\"snip1547\"><span>Add to Cart</span></button>\n");
      out.write("<button class=\"snip1547\"><span>Buy Now</span></button>\n");
      out.write("          </div>\n");
      out.write("           </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("          \n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Product}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("x");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    <div class=\"col-md-3\">\n");
          out.write("      <div class=\"thumbnail\">\n");
          out.write("          <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"height: 180px; cursor: pointer;\">\n");
          out.write("          <div class=\"caption\">\n");
          out.write("            <h3>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getProductname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\n");
          out.write("            <h4>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("            <a href=\"ViewSingleProduct.jsp?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><button class=\"snip1547\"><span>Add to Cart</span></button></a>\n");
          out.write("\n");
          out.write("          </div>\n");
          out.write("      </div>\n");
          out.write("    </div>\n");
          out.write("     ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
