package com.goodwill.domain;

import java.io.Serializable;
import java.sql.*;

/**
 * Created by wangnianlei 
 */
public class Email_Config implements Serializable {

    /**
     *  邮件配置主键
     */
    private Integer EMAIL_ID ;

    /**
     *  发送服务器
     */
    private String STMPHOST ;

    /**
     *  邮箱账号
     */
    private String EMAIL_ACCOUNT ;

    /**
     *  邮箱密码
     */
    private String EMAIL_PASSWORD ;

    /**
     *  端口号
     */
    private Integer EMAIL_PORT ;

    /**
     *  内容模板
     */
    private String EMAIL_TEMPLATE ;

    /**
     *  机构主键
     */
    private Integer AGENCY_ID ;

    /**
     *  课题主键
     */
    private Integer SUBJECT_ID ;
    /**
     * 邮件主题
     */
    private String THEME;

    private String TO_EMAIL;

    public String getTHEME() {
        return THEME;
    }

    public void setTHEME(String THEME) {
        this.THEME = THEME;
    }

    public String getTO_EMAIL() {
        return TO_EMAIL;
    }

    public void setTO_EMAIL(String TO_EMAIL) {
        this.TO_EMAIL = TO_EMAIL;
    }

    public Integer getEMAIL_ID() {
        return EMAIL_ID;
    }

    public void setEMAIL_ID(Integer EMAIL_ID) {
        this.EMAIL_ID = EMAIL_ID;
    }

    public String getSTMPHOST() {
        return STMPHOST;
    }

    public void setSTMPHOST(String STMPHOST) {
        this.STMPHOST = STMPHOST;
    }

    public String getEMAIL_ACCOUNT() {
        return EMAIL_ACCOUNT;
    }

    public void setEMAIL_ACCOUNT(String EMAIL_ACCOUNT) {
        this.EMAIL_ACCOUNT = EMAIL_ACCOUNT;
    }

    public String getEMAIL_PASSWORD() {
        return EMAIL_PASSWORD;
    }

    public void setEMAIL_PASSWORD(String EMAIL_PASSWORD) {
        this.EMAIL_PASSWORD = EMAIL_PASSWORD;
    }

    public Integer getEMAIL_PORT() {
        return EMAIL_PORT;
    }

    public void setEMAIL_PORT(Integer EMAIL_PORT) {
        this.EMAIL_PORT = EMAIL_PORT;
    }

    public String getEMAIL_TEMPLATE() {
        return EMAIL_TEMPLATE;
    }

    public void setEMAIL_TEMPLATE(String EMAIL_TEMPLATE) {
        this.EMAIL_TEMPLATE = EMAIL_TEMPLATE;
    }

    public Integer getAGENCY_ID() {
        return AGENCY_ID;
    }

    public void setAGENCY_ID(Integer AGENCY_ID) {
        this.AGENCY_ID = AGENCY_ID;
    }

    public Integer getSUBJECT_ID() {
        return SUBJECT_ID;
    }

    public void setSUBJECT_ID(Integer SUBJECT_ID) {
        this.SUBJECT_ID = SUBJECT_ID;
    }



}