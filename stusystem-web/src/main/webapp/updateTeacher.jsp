<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/29
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ page errorPage="/error.jsp"%>
<html>
<head>
    <title>updateTeacher</title>
</head>
<body>
<h2>修改老师</h2>
<s:form method="POST" action="teacherAction_doUpdateTeacher"  enctype="multipart/form-data">
    <s:hidden name="tbTeacher.tno"/>
    老师姓名:<s:textfield name="tbTeacher.tname"/><br/>
    老师年龄:<s:textfield name="tbTeacher.tage"/><br/>
    老师性别:<s:radio list="{'男','女'}" name="tbTeacher.tsex"/><br/>
    老师电话:<s:textfield name="tbTeacher.tphone"/><br/>
    入职时间:<s:textfield name="tbTeacher.tintime"/><br/>
    <s:hidden name="tbTeacher.timage"/>
    <img src="${tbTeacher.timage }" width="60" height="60"><br/>
    老师图像:<s:file name="teacherImage"/><br/>
    分配职位:<s:select list="#request.postList" name="tbTeacher.tbPost.pno" listKey="pno" listValue="pposition" headerKey="" headerValue="请分配职位"/><br/>
    <s:hidden name="tbTeacher.ttype"/><br/>
    <s:submit value="修改老师"/>
</s:form>
<a href="index.jsp">返回首页</a>
</body>
</html>
