package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("    body {font-style: italic Helvetica sans-serif;}\n");
      out.write("form {border: 3px solid #f1f1f1;}\n");
      out.write("body\n");
      out.write("{\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    background: #efefef;\n");
      out.write("    font-size: 16px;\n");
      out.write("    color: #777;\n");
      out.write("    font-family: sans-serif;\n");
      out.write("    font-weight: 300;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#login-box\n");
      out.write("{\n");
      out.write("    position: relative;\n");
      out.write("    margin: 5% auto;\n");
      out.write("    height: 400px;\n");
      out.write("    width: 600px;\n");
      out.write("    background: #fff;\n");
      out.write("    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.6);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".left-box\n");
      out.write("{\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    left: 0;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    padding: 40px;\n");
      out.write("    width: 300px;\n");
      out.write("    height: 400px;    \n");
      out.write("}\n");
      out.write("\n");
      out.write("h1\n");
      out.write("{\n");
      out.write("    margin: 0 0 20px 0;\n");
      out.write("    font-weight: 300;\n");
      out.write("    font-size: 28px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"text\"],\n");
      out.write("input[type=\"password\"]\n");
      out.write("{\n");
      out.write("    display: block;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    padding: 4px;\n");
      out.write("    width: 220px;\n");
      out.write("    height: 32px;\n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("    border-bottom: 1px solid #aaa;\n");
      out.write("    font-family: sans-serif;\n");
      out.write("    font-weight: 400;\n");
      out.write("    font-size: 15px;\n");
      out.write("    transition: 0.2s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"submit\"]\n");
      out.write("{\n");
      out.write("    margin-bottom: 28px;\n");
      out.write("    width: 120px;\n");
      out.write("    height: 32px;\n");
      out.write("    background: #f44336;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 2px;\n");
      out.write("    color: #fff;\n");
      out.write("    font-family: sans-serif;\n");
      out.write("    font-weight: 500;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    transition: 0.2s ease;\n");
      out.write("    cursor: pointer;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"submit\"]:hover,\n");
      out.write("input[type=\"submit\"]:focus\n");
      out.write("{\n");
      out.write("    background: #ff5722;\n");
      out.write("    transition: 0.2s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".right-box\n");
      out.write("{\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    right: 0;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    padding: 40px;\n");
      out.write("    width: 300px;\n");
      out.write("    height: 400px;\n");
      out.write("    background-image: url(image1.jpg);\n");
      out.write("    background-size: cover;\n");
      out.write("    background-position: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".or\n");
      out.write("{\n");
      out.write("    position: absolute;\n");
      out.write("    top: 180px;\n");
      out.write("    left: 280px;\n");
      out.write("    width: 40px;\n");
      out.write("    height: 40px;\n");
      out.write("    background: #efefef;\n");
      out.write("    border-radius: 50%;\n");
      out.write("    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.6);\n");
      out.write("    line-height: 40px;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".right-box .signinwith\n");
      out.write("{\n");
      out.write("    display: block;\n");
      out.write("    margin-bottom: 40px;\n");
      out.write("    font-size: 28px;\n");
      out.write("    color: #fff;\n");
      out.write("    text-align: center;\n");
      out.write("    text-shadow: 0 2px 4px rgba(0, 0, 0, 0.6);\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("button.social\n");
      out.write("{\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    width: 220px;\n");
      out.write("    height: 36px;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 2px;\n");
      out.write("    color: #fff;\n");
      out.write("    font-family: sans-serif;\n");
      out.write("    font-weight: 500;\n");
      out.write("    transition: 0.2s ease;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".facebook\n");
      out.write("{\n");
      out.write("    background: #32508e;\n");
      out.write("}\n");
      out.write(".twitter\n");
      out.write("{\n");
      out.write("    background: #55acee;\n");
      out.write("}\n");
      out.write(".google\n");
      out.write("{\n");
      out.write("    background: #dd4b39;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("      <div class=\"left-box\">\n");
      out.write("        <h1> Sign Up</h1>\n");
      out.write("          \n");
      out.write("          <input type=\"text\" name=\"username\" placeholder=\"Username\"/>\n");
      out.write("          <input type=\"text\" name=\"email\" placeholder=\"Email\"/>\n");
      out.write("          <input type=\"password\" name=\"password\" placeholder=\"Password\"/>\n");
      out.write("        \n");
      out.write("          <input type=\"password\" name=\"password2\" placeholder=\"Retype password\"/>\n");
      out.write("        \n");
      out.write("          <input type=\"submit\" name=\"signup-button\" value=\"Sign Up\"/>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <div class=\"right-box\">\n");
      out.write("        \n");
      out.write("        <button class=\"social facebook\">Log in with Facebook</button>    \n");
      out.write("        <button class=\"social twitter\">Log in with Twitter</button> \n");
      out.write("        <button class=\"social google\">Log in with Google+</button> \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <div class=\"or\">OR</div>\n");
      out.write("    </div>\n");
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
}
