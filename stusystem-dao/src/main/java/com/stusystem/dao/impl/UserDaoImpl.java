package com.stusystem.dao.impl;

import com.stusystem.dao.IUserDao;
import com.stusystem.entity.TbUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/12/18.
 */
@SuppressWarnings("ALL")
@Repository("userDao")
public class UserDaoImpl extends BaseDao implements IUserDao {
    @Override
    public boolean addUser(TbUser user) {
        getSession().save(user);
        return true;
    }

    @Override
    public List finUserList(String hql) {

       return getSession().createQuery(hql).list();

    }
}
