<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/4
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<title>addClass</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<head>
</head>
<body style="background: url('img/2222.png')">
    <h2 style="text-align: center">添加班级</h2>
    <div style="text-align: center">
        <s:form method="POST" action="clsAction_doAddClass">
             班级名称:<s:textfield  name="cls.cname"/>
                      <s:submit value="添加班级"/>
        </s:form>
        <a href="index.jsp"><button>返回首页</button></a>
    </div>
</body>
</html>
<script type="text/javascript">
    $("input[type='submit']").click(function(){
        var cname = $("input[name='cls.cname']").val();
        var reg = /^[0-9]\d{1,3}$/;
        if(cname == null || cname.length <= 0 ){
            alert("班级不能为空");
            return false;
    }
        if(reg.test(cname)) {
            alert("可以添加");
            return true;
        } else {
            alert("班级编号只能为1~999之间");
            return false;
        }
          return true;

    });
</script>