package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Quản lý sản phẩm</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "_Header.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "_Sidebar.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"content-wrapper\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"box\">\n");
      out.write("                        <div class=\"box-header\">\n");
      out.write("                            <h3 class=\"box-title\">Simple Full Width Table</h3>\n");
      out.write("\n");
      out.write("                            <div class=\"box-tools\">\n");
      out.write("                                <ul class=\"pagination pagination-sm no-margin pull-right\">\n");
      out.write("                                    <li><a href=\"#\">«</a></li>\n");
      out.write("                                    <li><a href=\"#\">1</a></li>\n");
      out.write("                                    <li><a href=\"#\">2</a></li>\n");
      out.write("                                    <li><a href=\"#\">3</a></li>\n");
      out.write("                                    <li><a href=\"#\">»</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.box-header -->\n");
      out.write("                        <div class=\"box-body no-padding\">\n");
      out.write("                            <table class=\"table\">\n");
      out.write("                                <tbody><tr>\n");
      out.write("                                        <th style=\"width: 10px\">#</th>\n");
      out.write("                                        <th>Task</th>\n");
      out.write("                                        <th>Progress</th>\n");
      out.write("                                        <th style=\"width: 40px\">Label</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>1.</td>\n");
      out.write("                                        <td>Update software</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div class=\"progress progress-xs\">\n");
      out.write("                                                <div class=\"progress-bar progress-bar-danger\" style=\"width: 55%\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td><span class=\"badge bg-red\">55%</span></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>2.</td>\n");
      out.write("                                        <td>Clean database</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div class=\"progress progress-xs\">\n");
      out.write("                                                <div class=\"progress-bar progress-bar-yellow\" style=\"width: 70%\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td><span class=\"badge bg-yellow\">70%</span></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>3.</td>\n");
      out.write("                                        <td>Cron job running</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div class=\"progress progress-xs progress-striped active\">\n");
      out.write("                                                <div class=\"progress-bar progress-bar-primary\" style=\"width: 30%\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td><span class=\"badge bg-light-blue\">30%</span></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>4.</td>\n");
      out.write("                                        <td>Fix and squish bugs</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div class=\"progress progress-xs progress-striped active\">\n");
      out.write("                                                <div class=\"progress-bar progress-bar-success\" style=\"width: 90%\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td><span class=\"badge bg-green\">90%</span></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody></table>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.box-body -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.box -->\n");
      out.write("\n");
      out.write("                    <div class=\"box\">\n");
      out.write("                        <div class=\"box-header\">\n");
      out.write("                            <h3 class=\"box-title\">Striped Full Width Table</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.box-header -->\n");
      out.write("                        <div class=\"box-body no-padding\">\n");
      out.write("                            <table class=\"table table-striped\">\n");
      out.write("                                <tbody><tr>\n");
      out.write("                                        <th style=\"width: 10px\">#</th>\n");
      out.write("                                        <th>Task</th>\n");
      out.write("                                        <th>Progress</th>\n");
      out.write("                                        <th style=\"width: 40px\">Label</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>1.</td>\n");
      out.write("                                        <td>Update software</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div class=\"progress progress-xs\">\n");
      out.write("                                                <div class=\"progress-bar progress-bar-danger\" style=\"width: 55%\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td><span class=\"badge bg-red\">55%</span></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>2.</td>\n");
      out.write("                                        <td>Clean database</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div class=\"progress progress-xs\">\n");
      out.write("                                                <div class=\"progress-bar progress-bar-yellow\" style=\"width: 70%\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td><span class=\"badge bg-yellow\">70%</span></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>3.</td>\n");
      out.write("                                        <td>Cron job running</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div class=\"progress progress-xs progress-striped active\">\n");
      out.write("                                                <div class=\"progress-bar progress-bar-primary\" style=\"width: 30%\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td><span class=\"badge bg-light-blue\">30%</span></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>4.</td>\n");
      out.write("                                        <td>Fix and squish bugs</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div class=\"progress progress-xs progress-striped active\">\n");
      out.write("                                                <div class=\"progress-bar progress-bar-success\" style=\"width: 90%\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td><span class=\"badge bg-green\">90%</span></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody></table>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.box-body -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.box -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "_Footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
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
