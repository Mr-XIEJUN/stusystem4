<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/27
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="/error.jsp"%>
<html>
<head>
    <title>postLost</title>
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
</head>
<body>
<table id="tab" border="1" width="500">
    <tr>
        <td>编号</td>
        <td>职位名称</td>
    </tr>
</table>
<a href="index.jsp">返回首页</a>
</body>
</html>
<script type="text/javascript">
    function loadData(){
        $("#tab tr:not(:first)").remove();
        $.get("postAction_doPostList","",function (data) {
            $.each(data.postList,function (i,v) {
                var tr="<tr>";
                tr+="<td>"+(i+1)+"</td>";
                tr+="<td>"+v.pposition+"</td>";
                tr+="</tr>";
                $("#tab").append(tr);
            });
        },"json");
    }
    window.onload=loadData;
</script>
