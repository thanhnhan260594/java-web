package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Thanh toán</title>\n");
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
      out.write("                    <h1>Giỏ hàng</h1>\n");
      out.write("                    <em></em>\n");
      out.write("                    <h2><a href=\"index.html\">Trang chủ</a><label>/</label>Giỏ hàng</a></h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--login-->\n");
      out.write("            <script>$(document).ready(function (c) {\n");
      out.write("                    $('.close1').on('click', function (c) {\n");
      out.write("                        $('.cart-header').fadeOut('slow', function (c) {\n");
      out.write("                            $('.cart-header').remove();\n");
      out.write("                        });\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("            <script>$(document).ready(function (c) {\n");
      out.write("                    $('.close2').on('click', function (c) {\n");
      out.write("                        $('.cart-header1').fadeOut('slow', function (c) {\n");
      out.write("                            $('.cart-header1').remove();\n");
      out.write("                        });\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("            <script>$(document).ready(function (c) {\n");
      out.write("                    $('.close3').on('click', function (c) {\n");
      out.write("                        $('.cart-header2').fadeOut('slow', function (c) {\n");
      out.write("                            $('.cart-header2').remove();\n");
      out.write("                        });\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"check-out\">\n");
      out.write("                    <div class=\"bs-example4\" data-example-id=\"simple-responsive-table\">\n");
      out.write("                        <div class=\"table-responsive\">\n");
      out.write("                            <table class=\"table-heading simpleCart_shelfItem\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <th class=\"table-grid\">Item</th>\n");
      out.write("\n");
      out.write("                                    <th>Prices</th>\n");
      out.write("                                    <th >Delivery </th>\n");
      out.write("                                    <th>Subtotal</th>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr class=\"cart-header\">\n");
      out.write("\n");
      out.write("                                    <td class=\"ring-in\"><a href=\"single.html\" class=\"at-in\"><img src=\"images/ch.jpg\" class=\"img-responsive\" alt=\"\"></a>\n");
      out.write("                                        <div class=\"sed\">\n");
      out.write("                                            <h5><a href=\"single.html\">Sed ut perspiciatis unde</a></h5>\n");
      out.write("                                            <p>(At vero eos et accusamus et iusto odio dignissimos ducimus ) </p>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"clearfix\"> </div>\n");
      out.write("                                        <div class=\"close1\"> </div></td>\n");
      out.write("                                    <td>$100.00</td>\n");
      out.write("                                    <td>FREE SHIPPING</td>\n");
      out.write("                                    <td class=\"item_price\">$100.00</td>\n");
      out.write("                                    <td class=\"add-check\"><a class=\"item_add hvr-skew-backward\" href=\"#\">Add To Cart</a></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr class=\"cart-header1\">\n");
      out.write("                                    <td class=\"ring-in\"><a href=\"single.html\" class=\"at-in\"><img src=\"images/ch2.jpg\" class=\"img-responsive\" alt=\"\"></a>\n");
      out.write("                                        <div class=\"sed\">\n");
      out.write("                                            <h5><a href=\"single.html\">Sed ut perspiciatis unde</a></h5>\n");
      out.write("                                            <p>(At vero eos et accusamus et iusto odio dignissimos ducimus ) </p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"clearfix\"> </div>\n");
      out.write("                                        <div class=\"close2\"> </div></td></td>\n");
      out.write("                                    <td>$100.00</td>\n");
      out.write("                                    <td>FREE SHIPPING</td>\n");
      out.write("                                    <td class=\"item_price\">$100.00</td>\n");
      out.write("                                    <td class=\"add-check\"><a class=\"item_add hvr-skew-backward\" href=\"#\">Add To Cart</a></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr class=\"cart-header2\">\n");
      out.write("                                    <td class=\"ring-in\"><a href=\"single.html\" class=\"at-in\"><img src=\"images/ch1.jpg\" class=\"img-responsive\" alt=\"\"></a>\n");
      out.write("                                        <div class=\"sed\">\n");
      out.write("                                            <h5><a href=\"single.html\">Sed ut perspiciatis unde</a></h5>\n");
      out.write("                                            <p>(At vero eos et accusamus et iusto odio dignissimos ducimus ) </p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"clearfix\"> </div>\n");
      out.write("                                        <div class=\"close3\"> </div></td></td>\n");
      out.write("                                    <td>$100.00</td>\n");
      out.write("                                    <td>FREE SHIPPING</td>\n");
      out.write("                                    <td class=\"item_price\">$100.00</td>\n");
      out.write("                                    <td class=\"add-check\"><a class=\"item_add hvr-skew-backward\" href=\"#\">Add To Cart</a></td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"produced\">\n");
      out.write("                        <a href=\"single.html\" class=\"hvr-skew-backward\">Produced To Buy</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--//login-->\n");
      out.write("            <!--brand-->\n");
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
