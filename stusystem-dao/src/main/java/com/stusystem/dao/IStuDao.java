package com.stusystem.dao;

import com.stusystem.entity.TbStu;
import com.stusystem.util.PageBean;

import java.util.List;

/**
 * Created by Administrator on 2017/12/4.
 */
public interface IStuDao {
    //添加学生
    public boolean addTbStu(TbStu stu);
    //查询所有学生
    public List findStuList(String hql);
    //根据ID查询学生
    public TbStu getStuById(TbStu stu);
    //修改
    public  boolean upDateStu(TbStu stu);
    //删除
    public boolean deletStu(TbStu stu);


    //分页查询
    public List findStuList(String hql,PageBean bean);
}
