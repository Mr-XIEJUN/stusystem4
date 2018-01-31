package com.stusystem.service;

import com.stusystem.entity.TbUser;

/**
 * Created by Administrator on 2017/12/18.
 */
public interface IUserService {
    //添加用户
    public boolean addUser(TbUser user);
    //登陆
    public TbUser doLogin(String name,String pwd);
}
