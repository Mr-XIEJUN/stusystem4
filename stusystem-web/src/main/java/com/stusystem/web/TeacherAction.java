package com.stusystem.web;

import com.opensymphony.xwork2.ActionContext;
import com.stusystem.entity.TbTeacher;
import com.stusystem.service.IPostService;
import com.stusystem.service.ITeacherService;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import java.io.File;

/**
 * Created by Administrator on 2017/12/28.
 */
@Controller("teacherAction")
@Scope("prototype")
public class TeacherAction {
    private TbTeacher tbTeacher;
    private String message;
    private File teacherImage;
    private String teacherImageFileName;
    @Resource(name = "postService")
    private IPostService postService;
    @Resource(name = "teacherService")
    private ITeacherService teacherService;

    public String toAddTeacher(){
        ActionContext.getContext().put("postList",postService.findPostList());
        return "toAddTeacher";
    }

    public String doAddTeacher(){
        uploadImge();
        teacherService.addTeacher(tbTeacher);
        System.out.println("stuImage的值是:"+teacherImage);
        return "doAddTeacher";
    }

    public String findTeacherList(){
        ActionContext.getContext().put("teacherList",teacherService.findTeacherList());
        return "teacherList";
    }
    public String toUpdateTeacher(){
        tbTeacher=teacherService.getTeacherById(tbTeacher);
        ActionContext.getContext().put("postList",postService.findPostList());
        return "toUpdateTeacher";
    }
    public String doUpdateTeacher(){
        uploadImge();
        teacherService.upDateTeacher(tbTeacher);
        return "doUpdateTeacher";
    }
    //执行图像上传操作
    private void uploadImge(){
        if(teacherImage!=null&&teacherImageFileName!=null){
            ServletContext ctx= ServletActionContext.getServletContext();
            String path=ctx.getRealPath("/upload");
            String filePath=path+"/"+teacherImageFileName;//获取文件要上传的路径
            try {
                /*System.out.println("teacherImage值:"+teacherImage);
                System.out.println("path值:"+path);
                System.out.println("teacherImageFileName的值是"+teacherImageFileName);
                System.out.println("filePath值:"+filePath);*/
                FileUtils.copyFile(teacherImage, new File(filePath));//执行上传
                //记录文件路径
                tbTeacher.setTimage("upload/"+teacherImageFileName);//记录图片路径

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public TbTeacher getTbTeacher() {
        return tbTeacher;
    }

    public void setTbTeacher(TbTeacher tbTeacher) {
        this.tbTeacher = tbTeacher;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public File getTeacherImage() {
        return teacherImage;
    }

    public void setTeacherImage(File teacherImage) {
        this.teacherImage = teacherImage;
    }

    public String getTeacherImageFileName() {
        return teacherImageFileName;
    }

    public void setTeacherImageFileName(String teacherImageFileName) {
        this.teacherImageFileName = teacherImageFileName;
    }

    public void setPostService(IPostService postService) {
        this.postService = postService;
    }

    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }
}
