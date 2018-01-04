package com.goodwill.domain;

import java.io.Serializable;
import java.sql.*;

/**
 * Created by GeneratorJavaBean 
 */
public class Concept implements Serializable {

    /**
     *  
     */
    private Integer ID ;

    /**
     *  
     */
    private String GOLD_NAME ;

    /**
     *  
     */
    private String GOLD_DESCRIPTION ;

    /**
     *  
     */
    private String GOLD_FROM ;

    /**
     *  
     */
    private String CREATEMAN_ID ;

    /**
     *  
     */
    private String CREATE_DATE ;

    /**
     *  
     */
    private Integer DEL_FLAG ;

    /**
     *  
     */
    private String GOLD_CONCEPTUALDOMAIN ;

    /**
     *  
     */
    private String INPUT_CODE ;

    /**
     *  
     */
    private Integer STATUS ;

    /**
     *  
     */
    private String LASTUPDATE_DATE ;

    /**
     *  
     */
    private String LASTUSE_DATE ;

    /**
     *  
     */
    private String LASTUSE_USERID ;

    /**
     *  
     */
    private Integer VERSION ;

    /**
     *  
     */
    private String VERSION_DATE ;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getGOLD_NAME() {
        return GOLD_NAME;
    }

    public void setGOLD_NAME(String GOLD_NAME) {
        this.GOLD_NAME = GOLD_NAME;
    }

    public String getGOLD_DESCRIPTION() {
        return GOLD_DESCRIPTION;
    }

    public void setGOLD_DESCRIPTION(String GOLD_DESCRIPTION) {
        this.GOLD_DESCRIPTION = GOLD_DESCRIPTION;
    }

    public String getGOLD_FROM() {
        return GOLD_FROM;
    }

    public void setGOLD_FROM(String GOLD_FROM) {
        this.GOLD_FROM = GOLD_FROM;
    }

    public String getCREATEMAN_ID() {
        return CREATEMAN_ID;
    }

    public void setCREATEMAN_ID(String CREATEMAN_ID) {
        this.CREATEMAN_ID = CREATEMAN_ID;
    }

    public String getCREATE_DATE() {
        return CREATE_DATE;
    }

    public void setCREATE_DATE(String CREATE_DATE) {
        this.CREATE_DATE = CREATE_DATE;
    }

    public Integer getDEL_FLAG() {
        return DEL_FLAG;
    }

    public void setDEL_FLAG(Integer DEL_FLAG) {
        this.DEL_FLAG = DEL_FLAG;
    }

    public String getGOLD_CONCEPTUALDOMAIN() {
        return GOLD_CONCEPTUALDOMAIN;
    }

    public void setGOLD_CONCEPTUALDOMAIN(String GOLD_CONCEPTUALDOMAIN) {
        this.GOLD_CONCEPTUALDOMAIN = GOLD_CONCEPTUALDOMAIN;
    }

    public String getINPUT_CODE() {
        return INPUT_CODE;
    }

    public void setINPUT_CODE(String INPUT_CODE) {
        this.INPUT_CODE = INPUT_CODE;
    }

    public Integer getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Integer STATUS) {
        this.STATUS = STATUS;
    }

    public String getLASTUPDATE_DATE() {
        return LASTUPDATE_DATE;
    }

    public void setLASTUPDATE_DATE(String LASTUPDATE_DATE) {
        this.LASTUPDATE_DATE = LASTUPDATE_DATE;
    }

    public String getLASTUSE_DATE() {
        return LASTUSE_DATE;
    }

    public void setLASTUSE_DATE(String LASTUSE_DATE) {
        this.LASTUSE_DATE = LASTUSE_DATE;
    }

    public String getLASTUSE_USERID() {
        return LASTUSE_USERID;
    }

    public void setLASTUSE_USERID(String LASTUSE_USERID) {
        this.LASTUSE_USERID = LASTUSE_USERID;
    }

    public Integer getVERSION() {
        return VERSION;
    }

    public void setVERSION(Integer VERSION) {
        this.VERSION = VERSION;
    }

    public String getVERSION_DATE() {
        return VERSION_DATE;
    }

    public void setVERSION_DATE(String VERSION_DATE) {
        this.VERSION_DATE = VERSION_DATE;
    }

}