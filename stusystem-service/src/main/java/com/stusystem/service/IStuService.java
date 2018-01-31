package com.stusystem.service;

import com.stusystem.entity.TbStu;
import com.stusystem.util.PageBean;
/**
 * Created by Administrator on 2017/12/4.
 */
public interface IStuService {
    //添加学生
    public boolean addTbStu(TbStu stu);

    //查询所有学生详情
    public PageBean findStuList(PageBean bean);
    //根据ID查询学生
    public TbStu getStuById(TbStu stu);
    //修改学生
    public boolean upDateStu(TbStu stu);
    //删除学生
    public boolean deletStu(TbStu stu);
}
