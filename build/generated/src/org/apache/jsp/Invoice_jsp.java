package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Invoice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("   <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-xs-12\">\n");
      out.write("    \t\t<div class=\"invoice-title\">\n");
      out.write("    \t\t\t<h2>Invoice</h2><h3 class=\"pull-right\">Order # 12345</h3>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t\t<hr>\n");
      out.write("    \t\t<div class=\"row\">\n");
      out.write("    \t\t\t<div class=\"col-xs-6\">\n");
      out.write("    \t\t\t\t<address>\n");
      out.write("    \t\t\t\t<strong>Billed To:</strong><br>\n");
      out.write("    \t\t\t\t\tBharat Singh Rawat<br>\n");
      out.write("    \t\t\t\t\tH-16/161 Sangam Vihar<br>\n");
      out.write("    \t\t\t\t\tApt. 4B<br>\n");
      out.write("    \t\t\t\t\t\n");
      out.write("    \t\t\t\t</address>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t\t<div class=\"col-xs-6 text-right\">\n");
      out.write("    \t\t\t\t<address>\n");
      out.write("        \t\t\t<strong>Shipped To:</strong><br>\n");
      out.write("    \t\t\t\t\tBharat Singh Rawat<br>\n");
      out.write("    \t\t\t\t\tH-16/161 Sangam Vihar<br>\n");
      out.write("    \t\t\t\t\tApt. 4B<br>\n");
      out.write("    \t\t\t\t\n");
      out.write("    \t\t\t\t</address>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t\t<div class=\"row\">\n");
      out.write("    \t\t\t<div class=\"col-xs-6\">\n");
      out.write("    \t\t\t\t<address>\n");
      out.write("    \t\t\t\t\t<strong>Payment Method:</strong><br>\n");
      out.write("    \t\t\t\t\tVisa ending **** 4242<br>\n");
      out.write("    \t\t\t\t\tbabloorawat123@gmail.com.com\n");
      out.write("    \t\t\t\t</address>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t\t<div class=\"col-xs-6 text-right\">\n");
      out.write("    \t\t\t\t<address>\n");
      out.write("    \t\t\t\t\t<strong>Order Date:</strong><br>\n");
      out.write("    \t\t\t\t\tOctober 7, 2018<br><br>\n");
      out.write("    \t\t\t\t</address>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t</div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"row\">\n");
      out.write("    \t<div class=\"col-md-12\">\n");
      out.write("    \t\t<div class=\"panel panel-default\">\n");
      out.write("    \t\t\t<div class=\"panel-heading\">\n");
      out.write("    \t\t\t\t<h3 class=\"panel-title\"><strong>Order summary</strong></h3>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t\t<div class=\"panel-body\">\n");
      out.write("    \t\t\t\t<div class=\"table-responsive\">\n");
      out.write("    \t\t\t\t\t<table class=\"table table-condensed\">\n");
      out.write("    \t\t\t\t\t\t<thead>\n");
      out.write("                                <tr>\n");
      out.write("        \t\t\t\t\t\t\t<td><strong>Item</strong></td>\n");
      out.write("        \t\t\t\t\t\t\t<td class=\"text-center\"><strong>Price</strong></td>\n");
      out.write("        \t\t\t\t\t\t\t<td class=\"text-center\"><strong>Quantity</strong></td>\n");
      out.write("        \t\t\t\t\t\t\t<td class=\"text-right\"><strong>Totals</strong></td>\n");
      out.write("                                </tr>\n");
      out.write("    \t\t\t\t\t\t</thead>\n");
      out.write("    \t\t\t\t\t\t<tbody>\n");
      out.write("    \t\t\t\t\t\t\t<!-- foreach ($order->lineItems as $line) or some such thing here -->\n");
      out.write("    \t\t\t\t\t\t\t<tr>\n");
      out.write("    \t\t\t\t\t\t\t\t<td>BS-200</td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"text-center\">₹550</td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"text-center\">1</td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"text-right\">₹550</td>\n");
      out.write("    \t\t\t\t\t\t\t</tr>\n");
      out.write("                                <tr>\n");
      out.write("        \t\t\t\t\t\t\t<td>BS-400</td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"text-center\">₹648</td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"text-center\">3</td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"text-right\">₹1944</td>\n");
      out.write("    \t\t\t\t\t\t\t</tr>\n");
      out.write("                                <tr>\n");
      out.write("            \t\t\t\t\t\t<td>BS-1000</td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"text-center\">₹999</td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"text-center\">1</td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"text-right\">₹999</td>\n");
      out.write("    \t\t\t\t\t\t\t</tr>\n");
      out.write("    \t\t\t\t\t\t\t<tr>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"thick-line\"></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"thick-line\"></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"thick-line text-center\"><strong>Subtotal</strong></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"thick-line text-right\">₹600</td>\n");
      out.write("    \t\t\t\t\t\t\t</tr>\n");
      out.write("    \t\t\t\t\t\t\t<tr>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line\"></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line\"></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line text-center\"><strong>Shipping</strong></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line text-right\">₹52</td>\n");
      out.write("    \t\t\t\t\t\t\t</tr>\n");
      out.write("    \t\t\t\t\t\t\t<tr>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line\"></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line\"></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line text-center\"><strong>Total</strong></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line text-right\">₹4,143</td>\n");
      out.write("    \t\t\t\t\t\t\t</tr>\n");
      out.write("    \t\t\t\t\t\t</tbody>\n");
      out.write("    \t\t\t\t\t</table>\n");
      out.write("    \t\t\t\t</div>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t</div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
}
