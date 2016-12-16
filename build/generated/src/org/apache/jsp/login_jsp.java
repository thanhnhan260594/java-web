package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Đăng nhập</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <!--theme-style-->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\n");
      out.write("        <!--//theme-style-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Shopin Responsive web template, Bootstrap Web Templates, Flat Web Templates, AndroId Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!--theme-style-->\n");
      out.write("        <link href=\"css/style4.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\n");
      out.write("        <!--//theme-style-->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <!--- start-rate---->\n");
      out.write("        <script src=\"js/jstarbox.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jstarbox.css\" type=\"text/css\" media=\"screen\" charset=\"utf-8\" />\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(function () {\n");
      out.write("                jQuery('.starbox').each(function () {\n");
      out.write("                    var starbox = jQuery(this);\n");
      out.write("                    starbox.starbox({\n");
      out.write("                        average: starbox.attr('data-start-value'),\n");
      out.write("                        changeable: starbox.hasClass('unchangeable') ? false : starbox.hasClass('clickonce') ? 'once' : true,\n");
      out.write("                        ghosting: starbox.hasClass('ghosting'),\n");
      out.write("                        autoUpdateAverage: starbox.hasClass('autoupdate'),\n");
      out.write("                        buttons: starbox.hasClass('smooth') ? false : starbox.attr('data-button-count') || 5,\n");
      out.write("                        stars: starbox.attr('data-star-count') || 5\n");
      out.write("                    }).bind('starbox-value-changed', function (event, value) {\n");
      out.write("                        if (starbox.hasClass('random')) {\n");
      out.write("                            var val = Math.random();\n");
      out.write("                            starbox.next().text(' ' + val);\n");
      out.write("                            return val;\n");
      out.write("                        }\n");
      out.write("                    })\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!---//End-rate---->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--header-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "_Header.jsp", out, false);
      out.write("\n");
      out.write("            <!--banner-->\n");
      out.write("            <div class=\"banner-top\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h1>Đăng nhập</h1>\n");
      out.write("                    <em></em>\n");
      out.write("                    <h2><a href=\"index.html\">Trang chủ</a><label>/</label>Đăng nhập</a></h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--login-->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"login\">\n");
      out.write("\n");
      out.write("                    <form action=\"UserServlet\" method=\"POST\">\n");
      out.write("                        <div class=\"col-md-6 login-do\">\n");
      out.write("                        ");
if (session.getAttribute("error") != null) {
      out.write(" <div class=\"alert alert-danger\" role=\"alert\"><p>");
      out.print(session.getAttribute("error"));
      out.write("</p> </div> ");
}
      out.write("\n");
      out.write("                        <div class=\"login-mail\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Email\" required=\"\" name=\"email\" >\n");
      out.write("                            <i  class=\"glyphicon glyphicon-envelope\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"login-mail\">\n");
      out.write("                            <input type=\"password\" placeholder=\"Password\" required=\"\" name=\"password\">\n");
      out.write("                            <i class=\"glyphicon glyphicon-lock\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <a class=\"news-letter \" href=\"#\">\n");
      out.write("                            <label class=\"checkbox1\"><input type=\"checkbox\" name=\"checkbox\" ><i> </i>Forget Password</label>\n");
      out.write("                        </a>\n");
      out.write("                        <label class=\"hvr-skew-backward\">\n");
      out.write("                            <input type=\"hidden\" value=\"login\" name=\"command\">\n");
      out.write("                            <input type=\"submit\" value=\"Đăng nhập\">\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6 login-right\">\n");
      out.write("                        <h3>Chưa có tài khoản</h3>\n");
      out.write("\n");
      out.write("                        <p>Hãy đăng ký tài khoản để có thể mua hàng một cách nhanh chóng và đơn giản.</p>\n");
      out.write("                        <a href=\"register.jsp\" class=\" hvr-skew-backward\">Đăng ký</a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--//login-->\n");
      out.write("\n");
      out.write("        <!--brand-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "_Branch-img.jsp", out, false);
      out.write("\n");
      out.write("            <!--//brand-->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!--//content-->\n");
      out.write("    <!--//footer-->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "_Footer.jsp", out, false);
      out.write("\n");
      out.write("<!--//footer-->\n");
      out.write("\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("\n");
      out.write("<script src=\"js/simpleCart.min.js\"></script>\n");
      out.write("<!-- slide -->\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
