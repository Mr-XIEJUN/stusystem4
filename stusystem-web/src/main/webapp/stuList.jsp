<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/4
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ page errorPage="/error.jsp"%>
<html>
<head>
    <title>Title</title>
    <style>
    .divclass{
    text-align: center;
    position: absolute;
    top: 40%;
    left: 25%;
    }
    </style>
</head>
<body style="background: url('img/2222.png')">
<h2 style="text-align: center">学生列表</h2>
<div class="divclass">
<table border="1" width="700">
    <tr>
        <td>编号</td><td>班级</td>
        <td>姓名</td><td>年龄</td>
        <td>性别</td> <td>时间</td>
        <td>图片</td><td>管理</td>
    </tr>
    <s:iterator value="pageBean.result" var="st" status="ids">
        <tr>
            <td>${(pageBean.cpage-1)*pageBean.showNum+ids.count}</td><td>${st[1].cname}</td>
            <td>${st[0].sname}</td><td>${st[0].sage}</td>
            <td>${st[0].ssex}</td>
            <td>${st[0].sintime.toString().substring(0,10)}</td>
            <td>
                <img src="${st[0].simage}" width="60" height="60">
            </td>
            <td>
                <a href="perAction_perIdList?stu.sno=${st[0].sno }">查询成绩</a>
                <a href="perAction_addPer?stu.sno=${st[0].sno }">添加成绩</a>
                <a href="stuAction_toupDate?stu.sno=${st[0].sno }">修改</a>|
                <a href="stuAction_deletStu?stu.sno=${st[0].sno }">删除</a>
            </td>
        </tr>
    </s:iterator>
    <tr>
        <td colspan="7" style="text-align: center">
            共查询到${pageBean.allNum}条${pageBean.allPage }页数据，当前第${pageBean.cpage }页
            <a href="stuAction_doFindStuList?pageBean.cpage=1">首页</a>|
            <a href="stuAction_doFindStuList?pageBean.cpage=${pageBean.cpage-1>0?pageBean.cpage-1:1}">上一页</a>|
            <a href="stuAction_doFindStuList?pageBean.cpage=${pageBean.cpage+1>pageBean.allPage?pageBean.allPage:pageBean.cpage+1}">下一页</a>|
            <a href="stuAction_doFindStuList?pageBean.cpage=${pageBean.allPage}">尾页</a>
        </td>
    </tr>
</table>
    <br>
    <a href="index.jsp"><button>返回首页</button></a>
</div>
</body>
</html>
