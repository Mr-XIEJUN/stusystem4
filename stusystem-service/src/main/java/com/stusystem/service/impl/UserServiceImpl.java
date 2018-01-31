package com.stusystem.service.impl;

import com.stusystem.dao.IUserDao;
import com.stusystem.entity.TbUser;
import com.stusystem.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
/**
 * Created by Administrator on 2017/12/18.
 */
@Service("userService")
@Transactional(propagation = Propagation.REQUIRED)
public class UserServiceImpl implements IUserService {
    @Resource(name = "userDao")
    private IUserDao userDao;
    @Override
    public boolean addUser(TbUser user) {
        return userDao.addUser(user);
    }

    @Override
    public TbUser doLogin(String name, String pwd) {
       String hql="from TbUser where uname='"+name+"'";
       List<TbUser> userList =userDao.finUserList(hql);
        for (TbUser users : userList) {
            if(users.getUname().equals(name)&&users.getUpwd().equals(pwd)){
                return users;
            }
        }
        return null;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
}
