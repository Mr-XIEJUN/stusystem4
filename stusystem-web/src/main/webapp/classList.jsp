<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/4
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ClassList</title>
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
    <style>
        .divclass{
            text-align: center;
            position: absolute;
            top: 40%;
            left: 30%;
        }
    </style>
</head>
<body style="background: url('img/2222.png')">
<div class="divclass">
<table id="tab" border="1px" width="500" style="text-align: center">
    <tr>
        <td>编号</td><td>班级名称</td>
        <br>
        <td>班级人数</td>
    </tr>
   <!--查询了2个表  如果不查询人数的话就是 v.属性名  例如 v.cname-->
</table>
    <br>
<a href="index.jsp"><button>返回首页</button></a>
</div>
</body>
</html>

<script type="text/javascript">
    function loadData(){
        $("#tab tr:not(:first)").remove();
        $.get("clsAction_doFindClassList","",function (data) {
            $.each(data.clsList,function (i,v) {
                var tr="<tr>";
                tr+="<td>"+(i+1)+"</td>";
                tr+="<td>"+v[1]+"</td>";
                tr+="<td>"+v[2]+"</td>";
                tr+="</tr>";
                $("#tab").append(tr);
            });
        },"json");
    }
    window.onload=loadData;
</script>

