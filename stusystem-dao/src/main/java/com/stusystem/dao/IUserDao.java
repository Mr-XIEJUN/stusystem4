package com.stusystem.dao;
import com.stusystem.entity.TbUser;

import java.util.List;

/**
 * Created by Administrator on 2017/12/18.
 */
public interface IUserDao {
    //添加用户
    public boolean addUser(TbUser user);
    //查询用户
    public List finUserList(String hql);
}
