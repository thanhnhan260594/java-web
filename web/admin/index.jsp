
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">

        <title>Trang quản trị</title>



        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>      
        <link href="css/AdminLTE.css" rel="stylesheet" type="text/css"/>       
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
        <link href="css/AdminLTE.min.css" rel="stylesheet" type="text/css"/>
        <!--<script src="${root}/js/jquery-1.11.1.min.js"></script>-->
        <link href="css/skins/_all-skins.css" rel="stylesheet" type="text/css"/>
        <!--        
                 iCheck 
                <link rel="stylesheet" href="${root}/plugins/iCheck/flat/blue.css">
                 Morris chart 
                <link rel="stylesheet" href="${root}/plugins/morris/morris.css">
                 jvectormap 
                <link rel="stylesheet" href="${root}/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
                 Date Picker 
                <link rel="stylesheet" href="${root}/plugins/datepicker/datepicker3.css">
                 Daterange picker 
                <link rel="stylesheet" href="${root}/plugins/daterangepicker/daterangepicker.css">
                 bootstrap wysihtml5 - text editor 
                <link rel="stylesheet" href="${root}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">-->
    </head>


    <body class="hold-transition skin-blue sidebar-mini">
        <jsp:include page="_Header.jsp"></jsp:include>
        <jsp:include page="_Sidebar.jsp"></jsp:include>

            <div class="content-wrapper">
            <jsp:include page="_Content.jsp"></jsp:include>
            </div>
        <jsp:include page="_Footer.jsp"></jsp:include>

<!--            <script src="${root}/plugins/jQuery/jquery-2.2.3.min.js"></script>
         jQuery UI 1.11.4 
        <script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
         Resolve conflict in jQuery UI tooltip with Bootstrap tooltip 
        <script>
            $.widget.bridge('uibutton', $.ui.button);
        </script>
         Bootstrap 3.3.6 
        <script src="${root}/bootstrap/js/bootstrap.min.js"></script>
         Morris.js charts 
        <script src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
        <script src="${root}/plugins/morris/morris.min.js"></script>
         Sparkline 
        <script src="${root}/plugins/sparkline/jquery.sparkline.min.js"></script>
         jvectormap 
        <script src="${root}/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
        <script src="${root}/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
         jQuery Knob Chart 
        <script src="${root}/plugins/knob/jquery.knob.js"></script>
         daterangepicker 
        <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>
        <script src="${root}/plugins/daterangepicker/daterangepicker.js"></script>
         datepicker 
        <script src="${root}/plugins/datepicker/bootstrap-datepicker.js"></script>
         Bootstrap WYSIHTML5 
        <script src="${root}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
         Slimscroll 
        <script src="${root}/plugins/slimScroll/jquery.slimscroll.min.js"></script>
         FastClick 
        <script src="${root}/plugins/fastclick/fastclick.js"></script>
         AdminLTE App 
        <script src="${root}/js/app.min.js"></script>
         AdminLTE dashboard demo (This is only for demo purposes) 
        <script src="${root}/js/pages/dashboard.js"></script>
         AdminLTE for demo purposes 
        <script src="${root}/js/demo.js"></script>-->
    </body>
</html>
