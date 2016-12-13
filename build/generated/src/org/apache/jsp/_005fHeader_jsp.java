package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Category;
import dao.CategoryDAO;

public final class _005fHeader_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 CategoryDAO categoryDAO = new CategoryDAO(); 
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"head\">\n");
      out.write("                    <div class=\" logo\">\n");
      out.write("                        <a href=\"index.jsp\"><img src=\"images/logo.png\" alt=\"\"></a>\t\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"header-top\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"col-sm-5 col-md-offset-2  header-login\">\n");
      out.write("                        <ul >\n");
      out.write("                            <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                            <li><a href=\"register.jsp\">Register</a></li>\n");
      out.write("                            <li><a href=\"checkout.jsp\">Checkout</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-5 header-social\">\t\t\n");
      out.write("                        <ul >\n");
      out.write("                            <li><a href=\"#\"><i></i></a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"ic1\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"ic2\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"ic3\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"ic4\"></i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <div class=\"head-top\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-8 col-md-offset-2 h_menu4\">\n");
      out.write("                        <nav class=\"navbar nav_bottom\" role=\"navigation\">\n");
      out.write("\n");
      out.write("                            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                            <div class=\"navbar-header nav_2\">\n");
      out.write("                                <button type=\"button\" class=\"navbar-toggle collapsed navbar-toggle1\" data-toggle=\"collapse\" data-target=\"#bs-megadropdown-tabs\">\n");
      out.write("                                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                </button>\n");
      out.write("\n");
      out.write("                            </div> \n");
      out.write("                            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                            <div class=\"collapse navbar-collapse\" id=\"bs-megadropdown-tabs\">\n");
      out.write("                                <ul class=\"nav navbar-nav nav_1\">\n");
      out.write("                                    <li><a class=\"color\" href=\"index.jsp\">Trang chủ</a></li>\n");
      out.write("\n");
      out.write("                                    <li class=\"dropdown mega-dropdown active\">\n");
      out.write("                                        <a class=\"color1\" href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Sản Phẩm<span class=\"caret\"></span></a>\t\t\t\t\n");
      out.write("                                        <div class=\"dropdown-menu \">\n");
      out.write("                                            <div class=\"menu-top\">\n");
      out.write("                                                <div class=\"col1\">\n");
      out.write("                                                    <div class=\"h_nav\">\n");
      out.write("                                                        <h4>Nữ</h4>\n");
      out.write("                                                        <ul>\n");
      out.write("                                                            ");

                                                                for (Category c : categoryDAO.getListCategory(2)) {
                                                            
      out.write("\n");
      out.write("                                                            <li><a href=\"product.jsp?category=");
      out.print(c.getCategoryID());
      out.write('"');
      out.write('>');
      out.print(c.getCategoryName());
      out.write("</a></li>        \n");
      out.write("                                                                ");

                                                                    }
                                                                
      out.write("\n");
      out.write("\n");
      out.write("                                                        </ul>\t\n");
      out.write("                                                    </div>\t\t\t\t\t\t\t\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col1\">\n");
      out.write("                                                    <div class=\"h_nav\">\n");
      out.write("                                                        <h4>Nam</h4>\n");
      out.write("                                                        <ul>\n");
      out.write("                                                            ");

                                                                for (Category c : categoryDAO.getListCategory(1)) {
                                                            
      out.write("\n");
      out.write("                                                            <li><a href=\"product.jsp?category=");
      out.print(c.getCategoryID());
      out.write('"');
      out.write('>');
      out.print(c.getCategoryName());
      out.write("</a></li>        \n");
      out.write("                                                                ");

                                                                    }
                                                                
      out.write("\n");
      out.write("\n");
      out.write("                                                        </ul>\t\n");
      out.write("                                                    </div>\t\t\t\t\t\t\t\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col1\">\n");
      out.write("                                                    <div class=\"h_nav\">\n");
      out.write("                                                        <h4>Trẻ em</h4>\n");
      out.write("                                                        <ul>\n");
      out.write("                                                            ");

                                                                for (Category c : categoryDAO.getListCategory(3)) {
                                                            
      out.write("\n");
      out.write("                                                            <li><a href=\"product.jsp?category=");
      out.print(c.getCategoryID());
      out.write('"');
      out.write('>');
      out.print(c.getCategoryName());
      out.write("</a></li>        \n");
      out.write("                                                                ");

                                                                    }
                                                                
      out.write("\n");
      out.write("\n");
      out.write("                                                        </ul>\t\n");
      out.write("                                                    </div>\t\t\t\t\t\t\t\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"clearfix\"></div>\n");
      out.write("                                            </div>                  \n");
      out.write("                                        </div>\t\t\t\t\n");
      out.write("                                    </li>\t\t\n");
      out.write("                                    <li><a class=\"color3\" href=\"product.jsp\">Sale</a></li>\n");
      out.write("                                    <li><a class=\"color4\" href=\"404.jsp\">Giới thiệu</a></li>\n");
      out.write("                                    <li><a class=\"color5\" href=\"typo.html\">Tin Tức</a></li>\n");
      out.write("                                    <li ><a class=\"color6\" href=\"contact.jsp\">Liên hệ</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div><!-- /.navbar-collapse -->\n");
      out.write("\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-2 search-right\">\n");
      out.write("                        <ul class=\"heart\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"wishlist.html\" >\n");
      out.write("                                    <span class=\"glyphicon glyphicon-heart\" aria-hidden=\"true\"></span>\n");
      out.write("                                </a></li>\n");
      out.write("                            <li><a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><i class=\"glyphicon glyphicon-search\"> </i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"cart box_1\">\n");
      out.write("                            <a href=\"checkout.html\">\n");
      out.write("                                <h3> <div class=\"total\">\n");
      out.write("                                        <span class=\"simpleCart_total\"></span></div>\n");
      out.write("                                    <img src=\"images/cart.png\" alt=\"\"/></h3>\n");
      out.write("                            </a>\n");
      out.write("                            <p><a href=\"javascript:;\" class=\"simpleCart_empty\">Giỏ hàng</a></p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("\n");
      out.write("                        <!----->\n");
      out.write("\n");
      out.write("                        <!---pop-up-box---->\t\t\t\t\t  \n");
      out.write("                        <link href=\"css/popuo-box.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("                        <script src=\"js/jquery.magnific-popup.js\" type=\"text/javascript\"></script>\n");
      out.write("                        <!---//pop-up-box---->\n");
      out.write("                        <div id=\"small-dialog\" class=\"mfp-hide\">\n");
      out.write("                            <div class=\"search-top\">\n");
      out.write("                                <div class=\"login-search\">\n");
      out.write("                                    <input type=\"submit\" value=\"\">\n");
      out.write("                                    <input type=\"text\" value=\"Search..\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\n");
      out.write("                                                            this.value = 'Search..';\n");
      out.write("                                                        }\">\t\t\n");
      out.write("                                </div>\n");
      out.write("                                <p>Tìm kiếm</p>\n");
      out.write("                            </div>\t\t\t\t\n");
      out.write("                        </div>\n");
      out.write("                        <script>\n");
      out.write("                            $(document).ready(function () {\n");
      out.write("                                $('.popup-with-zoom-anim').magnificPopup({\n");
      out.write("                                    type: 'inline',\n");
      out.write("                                    fixedContentPos: false,\n");
      out.write("                                    fixedBgPos: true,\n");
      out.write("                                    overflowY: 'auto',\n");
      out.write("                                    closeBtnInside: true,\n");
      out.write("                                    preloader: false,\n");
      out.write("                                    midClick: true,\n");
      out.write("                                    removalDelay: 300,\n");
      out.write("                                    mainClass: 'my-mfp-zoom-in'\n");
      out.write("                                });\n");
      out.write("\n");
      out.write("                            });\n");
      out.write("                        </script>\t\t\n");
      out.write("                        <!----->\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                </div>\t\n");
      out.write("            </div>\t\n");
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
