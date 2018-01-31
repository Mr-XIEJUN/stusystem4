<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/27
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
</head>
<body>
    <h2>添加职位</h2>
    <span id="mySpan" style="color: red;"></span>
    <s:form method="POST" action="postAction_doAddPost">
        职位名称:<s:textfield name="post.pposition"/>
                <s:submit value="添加职位"/>
    </s:form>
<a href="index.jsp">返回首页</a>
</body>
</html>
<script type="text/javascript">
    $("input[type='submit']").click(function(){
        var name = $("input[name='post.pposition']").val();
        if(name == null || name.length <= 0 ){
            $("#mySpan").text("职位不能为空");
            return false;
        }
        return true;
    });
    function clearTips(){
        $("#mySpan").text("");
    }
</script>