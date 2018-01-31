<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/25
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>addStu</title>
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
</head>
<body>
    <h2>添加用户</h2>
    <s:if test="message==1">
        <div style="color:green">添加成功</div>
    </s:if>
    <s:elseif test="message==2">
        <div style="color:red">添加失败</div>
    </s:elseif>
    <s:form method="POST" action="userAction_doAddUser">
        用户姓名:<s:textfield name="user.uname"/><br/>
        用户密码:<s:textfield name="user.upwd"/><br/>
        用户类型:<input name="user.utype" type="hidden" value="1">超级用户<br/>
        <s:submit value="添加用户"/>
    </s:form>
    <a href="index.jsp">返回首页</a>
</body>
</html>

