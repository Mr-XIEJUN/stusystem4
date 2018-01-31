package com.stusystem.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/12/26.
 */
@Entity
@Table(name = "tb_post")
public class TbPost implements Serializable {
    private int pno;
    private String pposition;

    public TbPost() {
    }

    public TbPost(int pno, String pposition) {
        this.pno = pno;
        this.pposition = pposition;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public String getPposition() {
        return pposition;
    }

    public void setPposition(String pposition) {
        this.pposition = pposition;
    }
}
