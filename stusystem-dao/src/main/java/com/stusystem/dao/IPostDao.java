package com.stusystem.dao;

import com.stusystem.entity.TbPost;

import java.util.List;

/**
 * Created by Administrator on 2017/12/26.
 */
public interface IPostDao {
    //添加职位
    public boolean addPost(TbPost post);
    //查询职位
    public List findPostList(String hql);
}
