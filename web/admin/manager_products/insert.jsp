<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.ProductDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">

        <title>Trang quản lý sản phẩm</title>

        <c:set var="root" value="${pageContext.request.contextPath}"/>

        <link href="${root}/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="${root}/css/admin/AdminLTE.css" rel="stylesheet" type="text/css"/>
        <link href="${root}/css/admin/AdminLTE.min.css" rel="stylesheet" type="text/css"/>
        <link href="${root}/css/admin/skins/_all-skins.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">


    </head>


    <body class="hold-transition skin-blue sidebar-mini">



        <jsp:include page="../_Header.jsp"></jsp:include>
        <jsp:include page="../_Sidebar.jsp"></jsp:include>

            <div class="content-wrapper">
                <div class="col-md-12">
                    <h1>Quản lý sản phẩm</h1>
                    <div class="box col-md-6 ">
                        <h3 class="box-title" style="text-align: center">Thêm sản phẩm mới</h3>
                        <div class="col-md-3"></div>
                        <div class="box-body col-md-6 ">
                            <form role="form" action="/SHOP02/ManagerProductsServlet" method="post">
                                <!-- text input -->                               

                                <div class="form-group">
                                    <label>Tên sản phẩm</label>
                                    <input type="text" name="nameSupplies" class="form-control" placeholder="Enter ...">
                                </div>
                                <div class="form-group">
                                    <label>Giá</label>
                                    <input type="text" name="nameSupplies" class="form-control" placeholder="Enter ...">
                                </div>
                                <div class="form-group">
                                    <label>Hình ảnh</label>
                                    <input type="text" name="nameSupplies" class="form-control" placeholder="Enter ...">
                                </div>
                                <div class="form-group">
                                    <label>Mô tả</label>
                                    <textarea class="form-control" name="address" rows="3" placeholder="Enter ..."></textarea>
                                </div>
                                <div class="form-group">
                                    <label>Thương hiệu</label>
                                    <select class="form-control select2 select2-hidden-accessible" style="width: 100%;" tabindex="-1" aria-hidden="true">
                                        <option selected="selected">Alabama</option>
                                        <option>Alaska</option>
                                        <option>California</option>
                                        <option>Delaware</option>
                                        <option>Tennessee</option>
                                        <option>Texas</option>
                                        <option>Washington</option>
                                    </select>
                                </div>

                                <div class="form-group">
                                    <label>Phân loại</label>
                                    <select class="form-control select2 select2-hidden-accessible" style="width: 100%;" tabindex="-1" aria-hidden="true">
                                        <option selected="selected">Alabama</option>
                                        <option></option>
                                        <option>California</option>
                                        <option>Delaware</option>
                                        <option>Tennessee</option>
                                        <option>Texas</option>
                                        <option>Washington</option>
                                    </select>
                                </div>
                                <div class=" col-md-12">
                                    <div class=" col-md-6">                                    
                                        <input type="hidden" name="command" value="insert">
                                        <input type="submit" class="btn btn-block btn-info" value="Thêm">
                                    </div>
                                    <div class=" col-md-6">                                    
                                        <a href="${root}/admin/manager_products/index.jsp"><button type="button" class="btn btn-block btn-warning">Trở về</button></a>
                                </div>
                            </div>
                        </form>
                    </div>
                    <!-- /.box-body -->
                </div>
            </div>
        </div>

        <jsp:include page="../_Footer.jsp"></jsp:include>

    </body>
</html>
