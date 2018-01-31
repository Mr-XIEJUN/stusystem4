package com.stusystem.service;

import com.stusystem.entity.TbClass;

import java.util.List;

/**
 * Created by Administrator on 2017/12/4.
 */
public interface IClassService {
    //添加班级
    public boolean addClass(TbClass cls);
    //查询所有班级
    public List findClassList();
    //查询班级及人数
    public List findClassInfo();
}
