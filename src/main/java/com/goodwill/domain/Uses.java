package com.goodwill.domain;

import java.io.Serializable;
import java.sql.*;

/**
 * Created by GeneratorJavaBean 
 */
public class Uses implements Serializable {

    private Integer id ;

    private String username ;

    private String password ;

    private String realname ;

    private String roler ;

    /**
     *  统计1
     */
    private Integer COUNTA ;

    public Integer getid() {
        return id;
    }

    public void setid(Integer id) {
        this.id = id;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public String getrealname() {
        return realname;
    }

    public void setrealname(String realname) {
        this.realname = realname;
    }

    public String getroler() {
        return roler;
    }

    public void setroler(String roler) {
        this.roler = roler;
    }

    public Integer getCOUNTA() {
        return COUNTA;
    }

    public void setCOUNTA(Integer COUNTA) {
        this.COUNTA = COUNTA;
    }

}