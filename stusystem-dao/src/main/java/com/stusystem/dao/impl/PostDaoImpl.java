package com.stusystem.dao.impl;

import com.stusystem.dao.IPostDao;
import com.stusystem.entity.TbPost;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/12/26.
 */
@SuppressWarnings("ALL")
@Repository("postDao")
public class PostDaoImpl extends BaseDao implements IPostDao {
    @Override
    public boolean addPost(TbPost post) {
        try {
            getSession().save(post);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List findPostList(String hql) {
        return getSession().createQuery(hql).list();
    }
}
