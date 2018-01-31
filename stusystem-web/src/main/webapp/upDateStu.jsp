<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ page errorPage="/error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>修改</h1>
	
	<s:form method="post" action="stuAction_doUpdateStu"  enctype="multipart/form-data">
	 <s:hidden name="stu.sno"/>
	    学生姓名:<s:textfield name="stu.sname"/><br/>
		学生年龄:<s:textfield name="stu.sage"/><br/>
	    学生性别:<s:radio name="stu.ssex" list="{'男','女'}"/><br/>
		入学时间:<s:textfield name="stu.sintime"/><br/>
		<s:hidden name="stu.simage"/>
		<img src="${stu.simage }" width="60" height="60"><br/>
		学生图像:<s:file name="stuImage"/><br/>
		班级:<s:select list="#request.clsList" name="stu.cls.cno" headerKey="" headerValue="请选择班级" listKey="cno" listValue="cname"/><br/>
		       <s:submit value="修改"/>
	<s:hidden name="stu.stype"/><br/>
	</s:form>
	<a href="index.jsp">返回首页</a>
</body>
</html>