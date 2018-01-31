package com.stusystem.dao;

import com.stusystem.entity.TbTeacher;

import java.util.List;

/**
 * Created by Administrator on 2017/12/26.
 */
public interface ITeacherDao {
    //添加老师
    public boolean addTheacher(TbTeacher teacher);
    //查询所有老师
    public List findTheacherList(String hql);
    //根据ID查询老师
    public TbTeacher getTheacherById(TbTeacher teacher);
    //修改
    public  boolean upDateTheacher(TbTeacher teacher);


}
