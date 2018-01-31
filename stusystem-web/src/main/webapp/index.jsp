<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/25
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="/error.jsp"%>
<%@ page errorPage="/error.jsp"%>
<html>
<head>
    <title>index</title>

    <style>
        .button{
            font-size: 30px;
            width:100px;
            height:100px;
        }
        .fanhui{
            float:right;
            text-align: center;
            width:150px;
            height:50px;
        }
    </style>
</head>
<body>
<div style="background: url('img/2222.png');width:100%;height:100%">
    <h1 style="text-align: center">学生管理系统</h1>
    <div class="fanhui"><a href="loginUser.jsp"><button>退出登录</button></a></div>
    <br> <br> <br>
<hr>
    <div style="text-align: center">
    <a href="addClass.jsp"><button class="button">添加班级</button></a>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="classList.jsp"><button class="button">班级列表</button></a>
        <hr>
    <a href="stuAction_toAddStu"><button class="button">添加学生</button></a>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="stuAction_doFindStuList?pageBean.cpage=1"><button class="button">学生列表</button></a>
        <hr>
    <a href="addPost.jsp"><button class="button">添加职位</button></a>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="postList.jsp"><button class="button">查询职位</button></a>

        <hr>
    <a href="teacherAction_toAddTeacher"><button class="button">添加老师</button></a>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="teacherAction_findTeacherList"><button class="button">查询老师</button></a>
    </div>
</div>
</body>
</html>
