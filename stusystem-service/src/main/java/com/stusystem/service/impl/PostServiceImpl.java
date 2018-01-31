package com.stusystem.service.impl;

import com.stusystem.dao.IPostDao;
import com.stusystem.entity.TbPost;
import com.stusystem.service.IPostService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/12/26.
 */
@Service("postService")
@Transactional(propagation = Propagation.REQUIRED)
public class PostServiceImpl implements IPostService {
    @Resource(name = "postDao")
    private IPostDao postDao;
    @Override
    public boolean addPost(TbPost post) {
        return postDao.addPost(post);
    }

    @Override
    public List findPostList() {
        String hql="from TbPost";
        return postDao.findPostList(hql);
    }

    public void setPostDao(IPostDao postDao) {
        this.postDao = postDao;
    }
}
