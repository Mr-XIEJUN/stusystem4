package com.stusystem.service.impl;

import com.stusystem.dao.ITeacherDao;
import com.stusystem.entity.TbTeacher;
import com.stusystem.service.ITeacherService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/12/28.
 */
@Service("teacherService")
@Transactional(propagation = Propagation.REQUIRED)
public class TeacherServiceImpl implements ITeacherService {
    @Resource(name = "teacherDao")
    private ITeacherDao teacherDao;
    @Override
    public boolean addTeacher(TbTeacher teacher) {
        return teacherDao.addTheacher(teacher);
    }

    @Override
    public List findTeacherList() {
        String hql="from TbTeacher t inner join t.tbPost p where t.ttype='1' order by p.pno";
        return teacherDao.findTheacherList(hql);
    }

    @Override
    public TbTeacher getTeacherById(TbTeacher teacher) {
        return teacherDao.getTheacherById(teacher);
    }

    @Override
    public boolean upDateTeacher(TbTeacher teacher) {
        return teacherDao.upDateTheacher(teacher);
    }

    public void setTeacherDao(ITeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }
}
