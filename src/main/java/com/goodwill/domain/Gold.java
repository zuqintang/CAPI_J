package com.goodwill.domain;

import java.io.Serializable;
import java.sql.*;

/**
 * Created by GeneratorJavaBean 
 */
public class Gold implements Serializable {

    /**
     *  
     */
    private Integer ID ;

    /**
     *  
     */
    private String FIELD_NAME ;

    /**
     *  
     */
    private String FIELD_VALUE ;

    /**
     *  
     */
    private String FIELD_DESCRIPTION ;

    /**
     *  
     */
    private String FIELD_CONCEPTUALDOMAIN ;

    /**
     *  
     */
    private String CREATE_MAN ;

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

    public String getFIELD_NAME() {
        return FIELD_NAME;
    }

    public void setFIELD_NAME(String FIELD_NAME) {
        this.FIELD_NAME = FIELD_NAME;
    }

    public String getFIELD_VALUE() {
        return FIELD_VALUE;
    }

    public void setFIELD_VALUE(String FIELD_VALUE) {
        this.FIELD_VALUE = FIELD_VALUE;
    }

    public String getFIELD_DESCRIPTION() {
        return FIELD_DESCRIPTION;
    }

    public void setFIELD_DESCRIPTION(String FIELD_DESCRIPTION) {
        this.FIELD_DESCRIPTION = FIELD_DESCRIPTION;
    }

    public String getFIELD_CONCEPTUALDOMAIN() {
        return FIELD_CONCEPTUALDOMAIN;
    }

    public void setFIELD_CONCEPTUALDOMAIN(String FIELD_CONCEPTUALDOMAIN) {
        this.FIELD_CONCEPTUALDOMAIN = FIELD_CONCEPTUALDOMAIN;
    }

    public String getCREATE_MAN() {
        return CREATE_MAN;
    }

    public void setCREATE_MAN(String CREATE_MAN) {
        this.CREATE_MAN = CREATE_MAN;
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