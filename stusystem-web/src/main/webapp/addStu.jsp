<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/25
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ page errorPage="/error.jsp"%>
<html>
<head>
    <title>addStu</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    <style>
        .mydiv{
            font-size: 25px;
        }

    </style>
</head>
<body style="background: url('img/2222.png')">
    <h2 style="text-align:center">添加学生</h2>
    <div style="text-align: center" class="mydiv">
    <s:if test="message==1">
        <script language="javascript"> //JavaScript脚本标注
        alert("添加学生成功");
        </script>
    </s:if>
    <s:elseif test="message==2">
        <script language="javascript"> //JavaScript脚本标注
        alert("添加学生失败");
        </script>
    </s:elseif>
    <s:form method="POST" action="stuAction_doAddStu" enctype="multipart/form-data">
        学生姓名:<s:textfield name="stu.sname"/><br/><br/>
        学生年龄:<s:textfield name="stu.sage"/><br/><br/>
        学生性别:<s:radio list="{'男','女'}" value="%{'男'}" name="stu.ssex"/><br/><br/>
        入学时间:<s:textfield name="stu.sintime"/><br/><br/>
        学生图像:<s:file class="button" name="stuImage"/><br/><br/>
        分配班级:<s:select list="#request.clsList" name="stu.cls.cno" listKey="cno" listValue="cname" headerKey="" headerValue="请分配班级"/><br/>
        <s:hidden name="stu.stype" id="sno" /><br/>
        &nbsp;<s:submit value="添加学生"/><br/>
    </s:form>
          <a href="index.jsp"><button>返回首页</button></a>
    </div>
</body>
</html>
<script type="text/javascript">
    $("#sno").val("1");
</script>
<script type="text/javascript">
    $("input[type='submit']").click(function(){
        var name = $("input[name='stu.sname']").val();
        var age = $("input[name='stu.sage']").val();
        var intime = $("input[name='stu.sintime']").val();
        if(name == null || name.length <= 0 ){
            alert("信息未完善,请填写完整");
            return false;
        }else if(age==null||age.length<=0){
            alert("信息未完善,请填写完整");
            return false;
        }else if (intime==null||intime.length<=0){
            alert("信息未完善,请填写完整");
            return false;
        }
        //判断姓名的正则表达式
        var reg = /^[\u4E00-\u9FA5A-Za-z]+$/;
        if(reg.test(cname)) {

        }else{
            alert("姓名填写不规范");
            return false;
        }
        return true;
    });
</script>