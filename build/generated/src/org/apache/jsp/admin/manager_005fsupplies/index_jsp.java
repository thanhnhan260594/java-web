package org.apache.jsp.admin.manager_005fsupplies;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Supply;
import java.util.ArrayList;
import dao.SupplyDAO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("\n");
      out.write("        <title>Trang quản lý thương hiệu</title>\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        \n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/admin/AdminLTE.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/admin/AdminLTE.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/admin/skins/_all-skins.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body class=\"hold-transition skin-blue sidebar-mini\">\n");
      out.write("\n");
      out.write("        ");

            SupplyDAO supplyDAO = new SupplyDAO();
            ArrayList<Supply> listSupply = supplyDAO.getListSupply();
        
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../_Header.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../_Sidebar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"content-wrapper\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <h1>Danh sách nhà cung cấp</h1>\n");
      out.write("                    <div class=\"box\">\n");
      out.write("                        <div class=\"box-header\">\n");
      out.write("                            <div class=\"col-sm-1 \"></div>\n");
      out.write("                            <div class=\"col-sm-2\">\n");
      out.write("\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/manager_supplies/insert.jsp\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-block btn-info btn-xs\"><i class=\"fa fa-plus\"></i> Thêm nhà cung cấp</button>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.box-header -->\n");
      out.write("                        <div class=\"box-body\">\n");
      out.write("                            <div class=\"row\"><div class=\"col-sm-12\"><table id=\"example1\" class=\"table table-bordered table-striped dataTable\" role=\"grid\" aria-describedby=\"example1_info\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr role=\"row\">\n");
      out.write("                                                <th  style=\"width: 13%;\">Mã nhà cung cấp</th>\n");
      out.write("                                                <th  style=\"width: 25%;\">Tên nhà cung cấp</th>\n");
      out.write("                                                <th  style=\"width: 32%;\">Địa chỉ</th>\n");
      out.write("                                                <th  style=\"width: 20%;\">Điện thoại</th>\n");
      out.write("                                                <th  style=\"width: 10%;\"> </th>\n");
      out.write("\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("\n");
      out.write("                                        <tbody>\n");
      out.write("                                        ");

                                            for (Supply supply : listSupply) {
                                        
      out.write("\n");
      out.write("                                        <tr role=\"row\" class=\"odd\">\n");
      out.write("                                            <td class=\"sorting_1\">");
      out.print(supply.getSupplyID());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(supply.getSupplyName());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(supply.getSuppleAddress());
      out.write(" </td>\n");
      out.write("                                            <td>");
      out.print(supply.getSupplePhone());
      out.write("</td>\n");
      out.write("                                            <td>\n");
      out.write("                                    <center>\n");
      out.write("                                        <a href=\"update.jsp\"><i class=\"fa fa-fw fa-edit\"></i></a> &nbsp;&nbsp;|&nbsp;&nbsp;\n");
      out.write("                                        <a href=\"#\"><i class=\"fa fa-fw fa-trash-o\"></i></a>\n");
      out.write("                                    </center>\n");
      out.write("                                    </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("\n");
      out.write("                                </table></div></div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-8\"></div>\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <div class=\"dataTables_paginate paging_simple_numbers\" id=\"example1_paginate\"><ul class=\"pagination\"><li class=\"paginate_button previous disabled\" id=\"example1_previous\"><a href=\"#\" aria-controls=\"example1\" data-dt-idx=\"0\" tabindex=\"0\">Previous</a></li><li class=\"paginate_button active\"><a href=\"#\" aria-controls=\"example1\" data-dt-idx=\"1\" tabindex=\"0\">1</a></li><li class=\"paginate_button \"><a href=\"#\" aria-controls=\"example1\" data-dt-idx=\"2\" tabindex=\"0\">2</a></li><li class=\"paginate_button \"><a href=\"#\" aria-controls=\"example1\" data-dt-idx=\"3\" tabindex=\"0\">3</a></li><li class=\"paginate_button \"><a href=\"#\" aria-controls=\"example1\" data-dt-idx=\"4\" tabindex=\"0\">4</a></li><li class=\"paginate_button \"><a href=\"#\" aria-controls=\"example1\" data-dt-idx=\"5\" tabindex=\"0\">5</a></li><li class=\"paginate_button \"><a href=\"#\" aria-controls=\"example1\" data-dt-idx=\"6\" tabindex=\"0\">6</a></li><li class=\"paginate_button next\" id=\"example1_next\"><a href=\"#\" aria-controls=\"example1\" data-dt-idx=\"7\" tabindex=\"0\">Next</a></li></ul></div>\n");
      out.write("                            </div></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.box-body -->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../_Footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("root");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
