package com.stusystem.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/12/26.
 */
@Entity
@Table(name = "tb_teacher")
public class TbTeacher implements Serializable {
    private int tno;
    private String tname;
    private int tage;
    private String tsex;
    private String tphone;
    private Date tintime;
    private String timage;
    private int ttype;
    private TbPost tbPost;

    public TbTeacher() {
    }

    public TbTeacher(int tno, String tname, int tage, String tsex, String tphone, Date tintime, String timage, int ttype, TbPost tbPost) {
        this.tno = tno;
        this.tname = tname;
        this.tage = tage;
        this.tsex = tsex;
        this.tphone = tphone;
        this.tintime = tintime;
        this.timage = timage;
        this.ttype = ttype;
        this.tbPost = tbPost;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getTno() {
        return tno;
    }

    public void setTno(int tno) {
        this.tno = tno;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public int getTage() {
        return tage;
    }

    public void setTage(int tage) {
        this.tage = tage;
    }

    public String getTsex() {
        return tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex;
    }

    public String getTphone() {
        return tphone;
    }

    public void setTphone(String tphone) {
        this.tphone = tphone;
    }

    public Date getTintime() {
        return tintime;
    }

    public void setTintime(Date tintime) {
        this.tintime = tintime;
    }

    public String getTimage() {
        return timage;
    }

    public void setTimage(String timage) {
        this.timage = timage;
    }

    public int getTtype() {
        return ttype;
    }

    public void setTtype(int ttype) {
        this.ttype = ttype;
    }

    @ManyToOne(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER)
    @JoinColumn(name = "tpno")
    public TbPost getTbPost() {
        return tbPost;
    }

    public void setTbPost(TbPost tbPost) {
        this.tbPost = tbPost;
    }
}
