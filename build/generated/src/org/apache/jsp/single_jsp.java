package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Product;
import dao.ProductDAO;

public final class single_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Chi tiết sản phẩm</title>\n");
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
      out.write("        <link href=\"css/form.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            ProductDAO productDAO = new ProductDAO();
            Product product = new Product();
            String productID = "";
            if (request.getParameter("product") != null) {
                productID = request.getParameter("product");
                product = productDAO.getProduct(Integer.parseInt(productID));
            }
        
      out.write("\n");
      out.write("        <!--header-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "_Header.jsp", out, false);
      out.write("\n");
      out.write("            <!--banner-->\n");
      out.write("            <div class=\"banner-top\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h1>Single</h1>\n");
      out.write("                    <em></em>\n");
      out.write("                    <h2><a href=\"index.html\">Home</a><label>/</label>Single</a></h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"single\">\n");
      out.write("\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"col-md-5 grid\">\t\t\n");
      out.write("                            <div class=\"flexslider\">\n");
      out.write("                                <ul class=\"slides\">\n");
      out.write("                                    <li data-thumb=\"images/si.jpg\">\n");
      out.write("                                        <div class=\"thumb-image\"> <img src=\"images/");
      out.print(product.getProductImage());
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\" alt=\"");
      out.print(product.getProductName());
      out.write("\"> </div>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\t\n");
      out.write("                    <div class=\"col-md-7 single-top-in\">\n");
      out.write("                        <div class=\"span_2_of_a1 simpleCart_shelfItem\">\n");
      out.write("                            <h3>");
      out.print(product.getProductName());
      out.write("</h3>\n");
      out.write("                            <p class=\"in-para\"></p>\n");
      out.write("                            <div class=\"price_single\">\n");
      out.write("                                <span class=\"reducedfrom item_price\"> ");
      out.print(product.getProductPrice());
      out.write(" VND </span>\n");
      out.write("                                <a href=\"#\">click for offer</a>\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <h4 class=\"quick\">Mô tả sản phẩm:</h4>\n");
      out.write("                            <p class=\"quick_desc\"> ");
      out.print(product.getProductDescription());
      out.write("</p>\n");
      out.write("                            <div class=\"wish-list\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li class=\"wish\"><a href=\"#\"><span class=\"glyphicon glyphicon-check\" aria-hidden=\"true\"></span>Add to Wishlist</a></li>\n");
      out.write("                                    <li class=\"compare\"><a href=\"#\"><span class=\"glyphicon glyphicon-resize-horizontal\" aria-hidden=\"true\"></span>Add to Compare</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"quantity\"> \n");
      out.write("                                <div class=\"quantity-select\">                           \n");
      out.write("                                    <div class=\"entry value-minus\">&nbsp;</div>\n");
      out.write("                                    <div class=\"entry value\"><span>1</span></div>\n");
      out.write("                                    <div class=\"entry value-plus active\">&nbsp;</div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!--quantity-->\n");
      out.write("                            <script>\n");
      out.write("                                $('.value-plus').on('click', function () {\n");
      out.write("                                    var divUpd = $(this).parent().find('.value'), newVal = parseInt(divUpd.text(), 10) + 1;\n");
      out.write("                                    divUpd.text(newVal);\n");
      out.write("                                });\n");
      out.write("\n");
      out.write("                                $('.value-minus').on('click', function () {\n");
      out.write("                                    var divUpd = $(this).parent().find('.value'), newVal = parseInt(divUpd.text(), 10) - 1;\n");
      out.write("                                    if (newVal >= 1)\n");
      out.write("                                        divUpd.text(newVal);\n");
      out.write("                                });\n");
      out.write("                            </script>\n");
      out.write("                            <!--quantity-->\n");
      out.write("\n");
      out.write("                            <a href=\"#\" class=\"add-to item_add hvr-skew-backward\">Thêm vào giỏ hàng</a>\n");
      out.write("                            <div class=\"clearfix\"> </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("                <!----->\n");
      out.write("\n");
      out.write("                <div class=\"clearfix\"> </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
      out.write("<script src=\"js/imagezoom.js\"></script>\n");
      out.write("\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script defer src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("// Can also be used with $(document).ready()\n");
      out.write("            $(window).load(function () {\n");
      out.write("                $('.flexslider').flexslider({\n");
      out.write("                    animation: \"slide\",\n");
      out.write("                    controlNav: \"thumbnails\"\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script src=\"js/simpleCart.min.js\"></script>\n");
      out.write("<!-- slide -->\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
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
