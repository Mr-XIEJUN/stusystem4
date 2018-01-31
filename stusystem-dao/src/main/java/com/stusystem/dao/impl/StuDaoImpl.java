package com.stusystem.dao.impl;

import com.stusystem.dao.IStuDao;
import com.stusystem.entity.TbStu;
import com.stusystem.util.PageBean;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/12/4.
 */
@SuppressWarnings("ALL")
@Repository("stuDao")
public class StuDaoImpl extends BaseDao implements IStuDao {
    //添加学生
    @Override
    public boolean addTbStu(TbStu stu) {
        try {
            getSession().save(stu);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    //查询学生
    @Override
    public List findStuList(String hql) {

        return getSession().createQuery(hql).list();
    }
    //根据ID查询学生
    @Override
    public TbStu getStuById(TbStu stu) {

        return getSession().get(TbStu.class,stu.getSno());
    }

    @Override
    public boolean upDateStu(TbStu stu) {
        getSession().update(stu);
        return true;
    }

    @Override
    public boolean deletStu(TbStu stu) {
        stu=getStuById(stu);
        stu.setStype(0);
        getSession().update(stu);
        return true;
    }

    @Override
    public List findStuList(String hql, PageBean bean) {
        Query query=getSession().createQuery(hql);
        query.setFirstResult((bean.getCpage()-1)*bean.getShowNum());//从哪里开始查询
        query.setMaxResults(bean.getShowNum());//设置每页查询多少条
        //执行查询
        List list=query.list();
        return list;
    }
}
