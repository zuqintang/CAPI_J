package com.goodwill.domain;

import java.io.Serializable;
import java.sql.*;

/**
 * Created by GeneratorJavaBean 
 */
public class Unit implements Serializable {

    /**
     *  
     */
    private String FEATURE_IDENTITY ;

    /**
     *  
     */
    private String FEATURE_NAME ;

    /**
     *  
     */
    private String FEATURE_DESCRIBE ;

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
    private String DEL_FLAG ;

    /**
     *  
     */
    private String INPUT_CODE ;

    /**
     *  
     */
    private String CRF_GROUP ;

    /**
     *  
     */
    private String CRF_GROUP_NAME ;

    /**
     *  
     */
    private String DATA_UNIT ;

    /**
     *  
     */
    private String STATUS ;

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
    private String VERSION ;

    /**
     *  
     */
    private String VERSION_DATE ;

    public String getFEATURE_IDENTITY() {
        return FEATURE_IDENTITY;
    }

    public void setFEATURE_IDENTITY(String FEATURE_IDENTITY) {
        this.FEATURE_IDENTITY = FEATURE_IDENTITY;
    }

    public String getFEATURE_NAME() {
        return FEATURE_NAME;
    }

    public void setFEATURE_NAME(String FEATURE_NAME) {
        this.FEATURE_NAME = FEATURE_NAME;
    }

    public String getFEATURE_DESCRIBE() {
        return FEATURE_DESCRIBE;
    }

    public void setFEATURE_DESCRIBE(String FEATURE_DESCRIBE) {
        this.FEATURE_DESCRIBE = FEATURE_DESCRIBE;
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

    public String getDEL_FLAG() {
        return DEL_FLAG;
    }

    public void setDEL_FLAG(String DEL_FLAG) {
        this.DEL_FLAG = DEL_FLAG;
    }

    public String getINPUT_CODE() {
        return INPUT_CODE;
    }

    public void setINPUT_CODE(String INPUT_CODE) {
        this.INPUT_CODE = INPUT_CODE;
    }

    public String getCRF_GROUP() {
        return CRF_GROUP;
    }

    public void setCRF_GROUP(String CRF_GROUP) {
        this.CRF_GROUP = CRF_GROUP;
    }

    public String getCRF_GROUP_NAME() {
        return CRF_GROUP_NAME;
    }

    public void setCRF_GROUP_NAME(String CRF_GROUP_NAME) {
        this.CRF_GROUP_NAME = CRF_GROUP_NAME;
    }

    public String getDATA_UNIT() {
        return DATA_UNIT;
    }

    public void setDATA_UNIT(String DATA_UNIT) {
        this.DATA_UNIT = DATA_UNIT;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
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

    public String getVERSION() {
        return VERSION;
    }

    public void setVERSION(String VERSION) {
        this.VERSION = VERSION;
    }

    public String getVERSION_DATE() {
        return VERSION_DATE;
    }

    public void setVERSION_DATE(String VERSION_DATE) {
        this.VERSION_DATE = VERSION_DATE;
    }

}