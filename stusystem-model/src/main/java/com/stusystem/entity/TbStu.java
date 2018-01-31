package com.stusystem.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/12/4.
 */
@Entity
@Table(name = "tb_stu")
public class TbStu implements Serializable{
    private int sno;
    private String sname;
    private int sage;
    private String ssex;
    private Date sintime;
    private String simage;
    private int stype;


    //建立多个学生对应一个班级的映射关系
    private TbClass cls;

    public TbStu() {
    }

    public TbStu(int sno, String sname, int sage, String ssex, Date sintime, String simage, int stype, TbClass cls) {
        this.sno = sno;
        this.sname = sname;
        this.sage = sage;
        this.ssex = ssex;
        this.sintime = sintime;
        this.simage = simage;
        this.stype = stype;
        this.cls = cls;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }



    @ManyToOne(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER)
    @JoinColumn(name = "scno")
    public TbClass getCls() {
        return cls;
    }
    public void setCls(TbClass cls) {
        this.cls = cls;
    }

    public Date getSintime() {
        return sintime;
    }

    public void setSintime(Date sintime) {
        this.sintime = sintime;
    }

    public String getSimage() {
        return simage;
    }

    public void setSimage(String simage) {
        this.simage = simage;
    }

    public int getStype() {
        return stype;
    }

    public void setStype(int stype) {
        this.stype = stype;
    }
}
