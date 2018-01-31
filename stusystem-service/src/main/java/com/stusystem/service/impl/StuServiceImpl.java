package com.stusystem.service.impl;

import com.stusystem.dao.IStuDao;
import com.stusystem.entity.TbStu;
import com.stusystem.service.IStuService;
import com.stusystem.util.PageBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/12/4.
 */
@Service("stuService")
@Transactional(propagation = Propagation.REQUIRED)
public class StuServiceImpl implements IStuService {
   @Resource(name = "stuDao")
    private IStuDao stuDao;
    @Override
    public boolean addTbStu(TbStu stu) {
        return stuDao.addTbStu(stu);
    }

    @Override
    public PageBean findStuList(PageBean bean) {
        String hql="from TbStu s inner join s.cls c where s.stype='1' order by c.cno";
        bean.setResult(stuDao.findStuList(hql, bean));
        //获取总的数据条数
        bean.setAllNum(stuDao.findStuList(hql).size());
        return bean;
    }

    @Override
    public TbStu getStuById(TbStu stu) {
        return stuDao.getStuById(stu);
    }

    @Override
    public boolean upDateStu(TbStu stu) {
        return stuDao.upDateStu(stu);
    }

    @Override
    public boolean deletStu(TbStu stu) {
        return stuDao.deletStu(stu);
    }

    public void setStuDao(IStuDao stuDao) {
        this.stuDao = stuDao;
    }
}
