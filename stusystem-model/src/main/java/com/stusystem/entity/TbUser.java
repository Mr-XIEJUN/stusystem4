package com.stusystem.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/12/14.
 */
@Entity
@Table(name = "tb_user")
public class TbUser {
    private int uno;
    private String uname;
    private String upwd;
    private int utype;

    public TbUser() {
    }

    public TbUser(int uno, String uname, String upwd, int utype) {
        this.uno = uno;
        this.uname = uname;
        this.upwd = upwd;
        this.utype = utype;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getUno() {
        return uno;
    }

    public void setUno(int uno) {
        this.uno = uno;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public int getUtype() {
        return utype;
    }

    public void setUtype(int utype) {
        this.utype = utype;
    }
}
