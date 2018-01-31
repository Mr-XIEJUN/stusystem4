package com.stusystem.service.impl;

import com.stusystem.dao.IClassDao;
import com.stusystem.entity.TbClass;
import com.stusystem.service.IClassService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/12/4.
 */
@Service("clsService")
@Transactional(propagation = Propagation.REQUIRED)
public class ClassServiceImpl implements IClassService {
    @Resource(name = "clsDao")
    private IClassDao clsDao;
    @Override
    public boolean addClass(TbClass cls) {
        return clsDao.addClass(cls);
    }

    @Override
    public List findClassList() {
        String hql="from TbClass";
        return clsDao.findClassList(hql);
    }

    @Override
    public List findClassInfo() {
        String hql="select c.cno,c.cname,count(s.sname) from TbClass c LEFT JOIN TbStu s " +
                " on c.cno=s.cls.cno "+
                " GROUP BY c.cno,c.cname";
        return clsDao.findClassList(hql);

    }

    public void setClsDao(IClassDao clsDao) {
        this.clsDao = clsDao;
    }
}
