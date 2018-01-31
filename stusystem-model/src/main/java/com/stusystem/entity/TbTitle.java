package com.stusystem.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2018/1/2.
 */
@Entity
@Table(name = "tb_title")
public class TbTitle {
    private int tno;
    private  int chinese; //语文
    private  int mathematics;//数学
    private  int  pEnglish;//英语
    private  int physics;//物理
    private  int chemistry;//化学

    private TbClass cls;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getTno() {
        return tno;
    }

    public void setTno(int tno) {
        this.tno = tno;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMathematics() {
        return mathematics;
    }

    public void setMathematics(int mathematics) {
        this.mathematics = mathematics;
    }

    public int getpEnglish() {
        return pEnglish;
    }

    public void setpEnglish(int pEnglish) {
        this.pEnglish = pEnglish;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }
    @ManyToOne(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER)
    @JoinColumn(name = "tcno")
    public TbClass getCls() {
        return cls;
    }

    public void setCls(TbClass cls) {
        this.cls = cls;
    }
}
