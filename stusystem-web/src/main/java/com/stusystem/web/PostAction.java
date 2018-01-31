package com.stusystem.web;

/**
 * Created by Administrator on 2017/12/26.
 */

import com.stusystem.entity.TbPost;
import com.stusystem.service.IPostService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;


@Controller("postAction")
@Scope("prototype")
public class PostAction {
    private TbPost post;
    private List postList;
    @Resource(name = "postService")
    private IPostService postService;

    public String doAddPost(){

        postService.addPost(post);
        return "doAddPost";
    }
    public String doPostList(){
        postList=postService.findPostList();
        System.out.println(postList.size());
        return "postList";
    }
    public TbPost getPost() {
        return post;
    }

    public void setPost(TbPost post) {
        this.post = post;
    }

    public List getPosrList() {
        return postList;
    }

    public List getPostList() {
        return postList;
    }

    public void setPostList(List postList) {
        this.postList = postList;
    }
}
