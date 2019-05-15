<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\1\6 0006
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path=request.getContextPath();
   String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
<html>
<head>
    <title>项目进度管理系统</title>
</head>
 <!-- 1.引入相关的js和css, 例如甘特图模板-->
  <script type="text/javascript" src="<%=basePath%>static/jquery/jquery-3.2.1.min.js"></script>
  <script type="text/javascript" src="<%=basePath %>static/bootstrap/js/bootstrap.js"></script>
  <script  type="text/javascript" src="<%=basePath%>static/bootstrap/js/bootstrap-treeview.js"></script>

<!-- 2.处理业务逻辑的js等 -->
 <script type="text/javascript" src="<%=basePath%>static/gantt-6.0.4/codebase/dhtmlxgantt.js"></script>
 <script type="text/javascript" src="<%=basePath%>static/gantt-6.0.4/codebase/locale/locale_cn.js"></script>
<script type="text/javascript" src="<%=basePath%>static/gantt-6.0.4/codebase/ext/dhtmlxgantt_marker.js"></script>
<script type="text/javascript" src="<%=basePath%>static/gantt-6.0.4/codebase/ext/dhtmlxgantt_tooltip.js"></script>
<script type="text/javascript" src="<%=basePath%>static/gantt-6.0.4/codebase/ext/dhtmlxgantt_undo.js"></script>
<script type="text/javascript" src="<%=basePath%>static/gantt-6.0.4/codebase/api.js"></script>
<!-- 引入对于的css-->
 <link rel="stylesheet" type="text/css" href="<%=basePath%>static/bootstrap/css/bootstrap.css">
 <link rel="stylesheet" type="text/css" href="<%=basePath%>static/bootstrap/css/bootstrap-treeview.css">
 <link rel="stylesheet" type="text/css" href="<%=basePath%>static/gantt-6.0.4/codebase/dhtmlxgantt.css">
<!--3.展示 -->
<body>
     <div class="webapp-title">
         <input value="导出PDF" type="button" class="btn btn-warning" onclick="gantt.exportToPDF()">
         <input  value="导出图片" type="button" class="btn btn-success" onclick="gantt.exportToPNG()">
         <input value="导出Excel" type="button" class="btn btn-danger" onclick="gantt.exportToExcel()">
         <input value="登出" type="button" class="btn btn-danger"  id="button_2">
     </div>
     <div class="panel panel-default">
         <div class="panel-heading">
             <h3>项目进度管理系统</h3>
         </div>
         <div class="panel-body">
              <div id="gantt_here" style="height: 400px;"></div>
         </div>

     </div>
</body>
<script type="text/javascript">

    gantt.init("gantt_here");
    //gantt.parse(tasks);
    gantt.load("../getData");

/*    // 添加进 任务项目 mysql
    gantt.attachEvent("onAfterTaskAdd",function(id,item){
        var formatFunc = gantt.date.date_to_str("%d-%m-%Y");
        var start_date = formatFunc(item.start_date);
        var end_date = formatFunc(item.end_date);
       /!* item.start_date=start_date;
        item.end_date=end_date;*!/
         $.ajax({
           type:"post",
           url:"../doAdd?start_date="+start_date+"&end_date="+end_date,
           data:item,
           success:function (res) {
               if(res==1) {
                   alert("添加成功！");
                   return false;//toastr.success("添加成功！");

               }else {
                   alert("添加失败！");//toastr.success("添加成功！");

               }
           }

           })
    });
     // 更新进 任务项目 mysql
    gantt.attachEvent("onAfterTaskUpdate",function(id,item){
        var formatFunc = gantt.date.date_to_str("%d-%m-%Y");
        var start_date = formatFunc(item.start_date);
        var end_date = formatFunc(item.end_date);
        /!* item.start_date=start_date;
         item.end_date=end_date;*!/
        $.ajax({
            type:"post",
            url:"../doUpdate?start_date="+start_date+"&end_date="+end_date,
            data:item,
            success:function (res) {
                if(res==1) {
                    alert("更新成功！");
                    return false;//toastr.success("添加成功！");

                }else {
                    alert("更新失败！");//toastr.success("添加成功！");

                }
            }

        })
    });
    // 删除 任务项目 mysql
    gantt.attachEvent("onAfterTaskDelete",function(id,item){

        $.ajax({
            type:"get",
            url:"../doDelete?id="+id,
            data:{},
            success:function (res) {
                if(res==1) {
                    alert("删除成功！");
                    return false;//toastr.success("添加成功！");

                }else {
                    alert("删除失败！");//toastr.success("添加成功！");

                }
            }

        })
    });
    // 添加关系到mysql
    gantt.attachEvent("onAfterLinkAdd",function(id,item){

        $.ajax({
            type:"post",
            url:"../doAddLink",
            data:item,
            success:function (res) {
                if(res==1) {
                    alert("添加成功！");
                    return false;//toastr.success("添加成功！");

                }else {
                    alert("添加失败！");//toastr.success("添加成功！");

                }
            }

        })
    });

    // 更新关系到mysql
    gantt.attachEvent("onAfterLinkUpdate",function(id,item){

        $.ajax({
            type:"post",
            url:"../doUpdateLink",
            data:item,
            success:function (res) {
                if(res==1) {
                    alert("更新成功！");
                    return false;//toastr.success("添加成功！");

                }else {
                    alert("更新失败！");//toastr.success("添加成功！");

                }
            }

        })
    });

    // 删除关系到mysql
    gantt.attachEvent("onAfterLinkDelete",function(id,item){

        $.ajax({
            type:"post",
            url:"../doDeleteLink?id="+id,
            data:item,
            success:function (res) {
                if(res==1) {
                    alert("删除成功！");
                    return false;//toastr.success("添加成功！");

                }else {
                    alert("删除失败！");//toastr.success("添加成功！");

                }
            }

        })
    });*/
    $("#button_2").click(function() {
        window.location.href="../static/home/index.jsp"
    });
</script>
</html>
