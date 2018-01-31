package com.stusystem.web;

import com.stusystem.entity.TbClass;
import com.stusystem.service.IClassService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/12/4.
 */
@Controller("clsAction")
@Scope("prototype")
public class ClassAction {
    private TbClass cls;
    private List clsList;
    @Resource(name = "clsService")
    private IClassService clsService;
    //添加班级
    public  String doAddClass(){
        clsService.addClass(cls);
        return "addClass";
    }
    //查询所有班级不查人数
    public String doClassList(){
        clsList=clsService.findClassList();//查询所有班级详情
        return "clsList";
    }
    //查询所有班级及人数统计
    public String doFindClassList(){
        clsList=clsService.findClassInfo();//查询所有班级详情
        return "clsList";
    }
    public void setClsService(IClassService clsService) {
        this.clsService = clsService;
    }

    public TbClass getCls() {
        return cls;
    }

    public void setCls(TbClass cls) {
        this.cls = cls;
    }

    public List getClsList() {
        return clsList;
    }

    public void setClsList(List clsList) {
        this.clsList = clsList;
    }
}
