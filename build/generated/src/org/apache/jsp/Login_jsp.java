package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Log In</title>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("         <script>\n");
      out.write("function validate(){\n");
      out.write("var email=document.form.user.value;\n");
      out.write("var password=document.form.pass.value;\n");
      out.write("if(email==\"\"){\n");
      out.write(" alert(\"Enter email!\");\n");
      out.write("  return false;\n");
      out.write("}\n");
      out.write("if(password==\"\"){\n");
      out.write(" alert(\"Enter Password!\");\n");
      out.write("  return false;\n");
      out.write("}\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body style=\"margin: auto; width: 80%;\">\n");
      out.write("        <h1>LOG IN:</h1>\n");
      out.write("        \n");
      out.write("                <form name=\"form\" method=\"post\" action=\"checklogin\" onsubmit=\"javascript:return validate();\">\n");
      out.write("                \n");
      out.write("                 <h3>Email:</h3>\n");
      out.write("                <input type=\"text\" name=\"email\" placeholder=\"Enter Email\" class=\"form-control\" required>\n");
      out.write("           \n");
      out.write("                 <h3>Password:</h3>\n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\"Enter Password\"  class=\"form-control\" required>\n");
      out.write("           \n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("                    <input type=\"submit\" value=\"Log In\" class=\"btn btn-lg btn-success\">\n");
      out.write("            \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
