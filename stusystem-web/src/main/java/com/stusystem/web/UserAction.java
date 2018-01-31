package com.stusystem.web;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.stusystem.entity.TbUser;
import com.stusystem.service.IUserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/12/18.
 */
@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport {
    @Resource(name = "userService")
    private IUserService userService;
    private TbUser user;
    private String  message;
    private String uname;
    //添加用户
    public String doAddUser(){
        if( userService.addUser(user)){
           message="1";
        }else {
            message="2";
        }
        return "doAddUser";
    }
    //用户登录
    public String doLogin(){
        TbUser u= userService.doLogin(user.getUname(),user.getUpwd());
        if(u!=null){
            u.setUpwd("");
            ActionContext.getContext().getSession().put("loginUser", user);
            return "main";
        }else{
            addActionError("用户名和密码错误！");
        }
        return "input";
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public IUserService getUserService() {
        return userService;
    }

    public TbUser getUser() {
        return user;
    }

    public void setUser(TbUser user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
