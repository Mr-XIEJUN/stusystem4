package com.stusystem.web;

import com.opensymphony.xwork2.ActionContext;
import com.stusystem.entity.TbStu;
import com.stusystem.service.IClassService;
import com.stusystem.service.IStuService;
import com.stusystem.util.PageBean;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import java.io.File;

/**
 * Created by Administrator on 2017/12/4.
 */
@Controller("stuAction")
@Scope("prototype")
public class StuAction {
    private String message;
    private File stuImage;
    private String stuImageFileName;
    private TbStu stu;

    @Resource(name = "stuService")
    private IStuService stuService;
    @Resource(name="clsService")
    private IClassService clsService;

  private PageBean pageBean;


    //去到添加学生页面
    public String toAddStu(){
        ActionContext.getContext().put("clsList",clsService.findClassList());
        return "addStu";
    }
    //添加学生
    public String doAddStu(){
        uploadImge();
        System.out.println(stuImage);
        System.out.println(stu.getSno());
        System.out.println(stu.getCls().getCno());
        if( stuService.addTbStu(stu)){
            message="1";
        }else{
            message="2";
        }

        return "toAddStu";
    }



    //查询所有学生详情
    public  String doFindStuList(){
       pageBean= stuService.findStuList(pageBean);
        return "stuList";
    }

    public String toupDate(){
        stu=stuService.getStuById(stu);
        ActionContext.getContext().put("clsList", clsService.findClassList());
        return "toupDate";
    }
    public String doUpdateStu(){
        uploadImge();
        stuService.upDateStu(stu);

        return "doupDate";
    }
    public  String deletStu(){
        stuService.deletStu(stu);
        return "delet";
    }


    //执行图像上传操作
    private void uploadImge(){
        if(stuImage!=null&&stuImageFileName!=null){
            ServletContext ctx= ServletActionContext.getServletContext();
            String path=ctx.getRealPath("/upload");
            String filePath=path+"/"+stuImageFileName;//获取文件要上传的路径
            try {
                /*System.out.println("stuImage值:"+stuImage);
                System.out.println("path值:"+path);
                System.out.("stuImageFileName值:"+stuImageFileName);
                System.out.println("filePath值:"+filePath);*/
                FileUtils.copyFile(stuImage, new File(filePath));//执行上传
                //记录文件路径
                stu.setSimage("upload/"+stuImageFileName);//记录图片路径

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }



    public TbStu getStu() {
        return stu;
    }
    public void setStu(TbStu stu) {
        this.stu = stu;
    }

    public void setStuService(IStuService stuService) {
        this.stuService = stuService;
    }

    public void setClsService(IClassService clsService) {
        this.clsService = clsService;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public File getStuImage() {
        return stuImage;
    }

    public void setStuImage(File stuImage) {
        this.stuImage = stuImage;
    }

    public String getStuImageFileName() {
        return stuImageFileName;
    }

    public void setStuImageFileName(String stuImageFileName) {
        this.stuImageFileName = stuImageFileName;
    }

    public PageBean getPageBean() {
        return pageBean;
    }

    public void setPageBean(PageBean pageBean) {
        this.pageBean = pageBean;
    }

}
