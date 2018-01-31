package com.stusystem.service;

import com.stusystem.entity.TbPost;

import java.util.List;

/**
 * Created by Administrator on 2017/12/26.
 */
public interface IPostService {
    public boolean addPost(TbPost post);
    public List findPostList();
}
