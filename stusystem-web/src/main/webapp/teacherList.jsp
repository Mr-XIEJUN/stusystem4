<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/29
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ page errorPage="/error.jsp"%>
<html>
<html>
<head>
    <title>teacherList</title>
</head>
<body>
<h2>老师列表</h2>
<table border="1" width="650" style="text-align: center;margin:0px auto;">
    <tr>
        <td>编号</td><td>职位</td>
        <td>姓名</td><td>年龄</td>
        <td>性别</td><td>电话</td>
        <td>电话</td><td>头像</td>
        <td>管理</td>
    </tr>
    <s:iterator value="#request.teacherList" var="th" status="ids">
        <tr>
            <td>${ids.count}</td><td>${th[1].pposition}</td>
            <td>${th[0].tname}</td><td>${th[0].tage}</td>
            <td>${th[0].tsex}</td><td>${th[0].tphone}</td>
            <td>${th[0].tintime}</td>
            <td>
                <img src="${th[0].timage}" width="60" height="60">
            </td>
            <td>
                <a href="teacherAction_toUpdateTeacher?tbTeacher.tno=${th[0].tno }">修改</a>|
            </td>
        </tr>
    </s:iterator>
</table>
<a href="index.jsp">返回首页</a>
</body>
</html>
