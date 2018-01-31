package com.stusystem.service;



import com.stusystem.entity.TbTeacher;

import java.util.List;


/**
 * Created by Administrator on 2017/12/28.
 */
public interface ITeacherService {
    //添加老师
    public boolean addTeacher(TbTeacher teacher);
    //查询所有老师详情
    public List findTeacherList();
    //根据ID查询老师
    public TbTeacher getTeacherById(TbTeacher teacher);
    //修改老师
    public boolean upDateTeacher(TbTeacher teacher);

}
