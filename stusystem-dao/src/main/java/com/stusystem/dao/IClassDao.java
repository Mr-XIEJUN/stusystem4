package com.stusystem.dao;

import com.stusystem.entity.TbClass;
import java.util.List;
/**
 * Created by Administrator on 2017/12/4.
 */
public interface IClassDao {
    //添加班级
    public  boolean addClass(TbClass cls);
    //查询班级
    public List findClassList(String hql);

}
