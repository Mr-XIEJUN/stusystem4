<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ page errorPage="/error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
	<title>Login Form</title>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
	<style>
.all{
	text-align:center;
	font-size: 50px;
}
	</style>
</head>

<body style="background: url('img/2222.png')">
<div style="color:#f8614f">
	<s:actionerror/>
	${errorMessage}

</div>
<div class="all">
<s:form method="post" action="userAction_doLogin">
	UserName:<s:textfield name="user.uname" /><br/>
	UserPwd:<s:password name="user.upwd"/><br/>
	<s:submit style="font-size:50px" value="登录"/>
</s:form>
</div>
</body>
</html>
<script type="text/javascript">
		$("input[type='submit']").click(function(){
		var name = $("input[name='user.uname']").val();
		var pwd = $("input[name='user.upwd']").val();
			 if(name == null || name.length <= 0 ){
		        alert("账号不为空");
			return false;
		}else if(pwd==null||pwd.length<=0){
			  alert("密码不为空");
			return false;
		}
			return true;
		});

</script>