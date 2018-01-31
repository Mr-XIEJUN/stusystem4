package com.stusystem.dao.impl;

import com.stusystem.dao.ITeacherDao;
import com.stusystem.entity.TbTeacher;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/12/26.
 */
@SuppressWarnings("ALL")
@Repository("teacherDao")
public class TeacherDaoImpl extends BaseDao implements ITeacherDao {


    @Override
    public boolean addTheacher(TbTeacher teacher) {
        try {
            getSession().save(teacher);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List findTheacherList(String hql) {
        return getSession().createQuery(hql).list();
    }

    @Override
    public TbTeacher getTheacherById(TbTeacher teacher) {
        return getSession().get(TbTeacher.class,teacher.getTno());
    }

    @Override
    public boolean upDateTheacher(TbTeacher teacher) {
        getSession().update(teacher);
        return true;
    }
}
