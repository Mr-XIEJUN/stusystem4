<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/28
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ page errorPage="/error.jsp"%>
<html>
<head>
    <title>addTeacher</title>
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
</head>
<body>
        <h2>添加老师</h2>
        <span id="mySpan" style="color: red;"></span>
    <s:form method="POST" action="teacherAction_doAddTeacher"  enctype="multipart/form-data">
        老师姓名:<s:textfield name="tbTeacher.tname"/><br/>
        老师年龄:<s:textfield name="tbTeacher.tage"/><br/>
        老师性别:<s:radio list="{'男','女'}" value="%{'男'}" name="tbTeacher.tsex"/><br/>
        老师电话:<s:textfield name="tbTeacher.tphone"/><br/>
        入职时间:<s:textfield name="tbTeacher.tintime"/><br/>
        老师图像:<s:file name="teacherImage"/><br/>
        分配职位:<s:select list="#request.postList" name="tbTeacher.tbPost.pno" listKey="pno" listValue="pposition" headerKey="" headerValue="请分配职位"/><br/>
        <s:hidden name="tbTeacher.ttype" id="tno" />
        <s:submit value="添加老师"/>
    </s:form>
        <a href="index.jsp">返回首页</a>
</html>
<script type="text/javascript">
    $("#tno").val("1");
</script>
<script type="text/javascript">
    $("input[type='submit']").click(function(){
        var name = $("input[name='tbTeacher.tname']").val();
        var age = $("input[name='tbTeacher.tage']").val();
        var tel = $("input[name='tbTeacher.tphone']").val();
        var intime = $("input[name='tbTeacher.tintime']").val();
        if(name == null || name.length <= 0 ){
           alert("信息未完善,请填写完整");
            return false;
        }else if(age==null||age.length<=0){
            alert("信息未完善,请填写完整");
            return false;
        }else if(tel==null||tel.length<=0){
            alert("信息未完善,请填写完整");
            return false;
        }else if(intime==null||intime.length<=0){
            alert("信息未完善,请填写完整");
            return false;
        }
        return true;
    });
    function clearTips(){
        $("#mySpan").text("");
    }
</script>