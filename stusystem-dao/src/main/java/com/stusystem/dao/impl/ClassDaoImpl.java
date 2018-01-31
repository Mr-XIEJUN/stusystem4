package com.stusystem.dao.impl;

import com.stusystem.dao.IClassDao;
import com.stusystem.entity.TbClass;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/12/4.
 */
@SuppressWarnings("ALL")
@Repository("clsDao")
public class ClassDaoImpl extends BaseDao implements IClassDao {
    @Override
    public boolean addClass(TbClass cls) {
        try {
            getSession().save(cls);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List findClassList(String hql) {

        return getSession().createQuery(hql).list();
    }
}
