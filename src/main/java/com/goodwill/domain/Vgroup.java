package com.goodwill.domain;

import java.io.Serializable;
import java.sql.*;

/**
 * Created by GeneratorJavaBean 
 */
public class Vgroup implements Serializable {

    /**
     *  
     */
    private Integer ID ;

    /**
     *  
     */
    private String FIELDCODE_TABLECODE ;

    /**
     *  
     */
    private String GROUP_IDENTIFY ;

    /**
     *  
     */
    private String FIELDCODE_VALUE_EG_NAME ;

    /**
     *  
     */
    private String CLEAR_DENTIFY ;

    /**
     *  
     */
    private String SYNONYM_VALUE ;

    /**
     *  
     */
    private String INPUT_CODE ;

    /**
     *  
     */
    private String WUBI_CODE ;

    /**
     *  
     */
    private String CREATE_DATE ;

    /**
     *  
     */
    private String CREATE_MAN ;

    /**
     *  
     */
    private Integer STATUS ;

    /**
     *  
     */
    private Integer DEL_FLAG ;

    /**
     *  
     */
    private String PROJECT_ID ;

    /**
     *  
     */
    private String TIMESTAMP ;

    /**
     *  
     */
    private String FIELD_FROM ;

    /**
     *  
     */
    private String FIELD_CONCEPTUALDOMAIN ;

    /**
     *  
     */
    private String FIELDTYPE ;

    /**
     *  
     */
    private String FIELDCODE_NAME ;

    /**
     *  
     */
    private Integer FIELD_CONCEPTUALDOMAIN_ID ;

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

    /**
     *  
     */
    private Integer FIELDORDER ;

    public Integer get﻿ID() {
        return ID;
    }

    public void set﻿ID(Integer ID) {
    	this.ID = ID;
    }

    public String getFIELDCODE_TABLECODE() {
        return FIELDCODE_TABLECODE;
    }

    public void setFIELDCODE_TABLECODE(String FIELDCODE_TABLECODE) {
        this.FIELDCODE_TABLECODE = FIELDCODE_TABLECODE;
    }

    public String getGROUP_IDENTIFY() {
        return GROUP_IDENTIFY;
    }

    public void setGROUP_IDENTIFY(String GROUP_IDENTIFY) {
        this.GROUP_IDENTIFY = GROUP_IDENTIFY;
    }

    public String getFIELDCODE_VALUE_EG_NAME() {
        return FIELDCODE_VALUE_EG_NAME;
    }

    public void setFIELDCODE_VALUE_EG_NAME(String FIELDCODE_VALUE_EG_NAME) {
        this.FIELDCODE_VALUE_EG_NAME = FIELDCODE_VALUE_EG_NAME;
    }

    public String getCLEAR_DENTIFY() {
        return CLEAR_DENTIFY;
    }

    public void setCLEAR_DENTIFY(String CLEAR_DENTIFY) {
        this.CLEAR_DENTIFY = CLEAR_DENTIFY;
    }

    public String getSYNONYM_VALUE() {
        return SYNONYM_VALUE;
    }

    public void setSYNONYM_VALUE(String SYNONYM_VALUE) {
        this.SYNONYM_VALUE = SYNONYM_VALUE;
    }

    public String getINPUT_CODE() {
        return INPUT_CODE;
    }

    public void setINPUT_CODE(String INPUT_CODE) {
        this.INPUT_CODE = INPUT_CODE;
    }

    public String getWUBI_CODE() {
        return WUBI_CODE;
    }

    public void setWUBI_CODE(String WUBI_CODE) {
        this.WUBI_CODE = WUBI_CODE;
    }

    public String getCREATE_DATE() {
        return CREATE_DATE;
    }

    public void setCREATE_DATE(String CREATE_DATE) {
        this.CREATE_DATE = CREATE_DATE;
    }

    public String getCREATE_MAN() {
        return CREATE_MAN;
    }

    public void setCREATE_MAN(String CREATE_MAN) {
        this.CREATE_MAN = CREATE_MAN;
    }

    public Integer getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Integer STATUS) {
        this.STATUS = STATUS;
    }

    public Integer getDEL_FLAG() {
        return DEL_FLAG;
    }

    public void setDEL_FLAG(Integer DEL_FLAG) {
        this.DEL_FLAG = DEL_FLAG;
    }

    public String getPROJECT_ID() {
        return PROJECT_ID;
    }

    public void setPROJECT_ID(String PROJECT_ID) {
        this.PROJECT_ID = PROJECT_ID;
    }

    public String getTIMESTAMP() {
        return TIMESTAMP;
    }

    public void setTIMESTAMP(String TIMESTAMP) {
        this.TIMESTAMP = TIMESTAMP;
    }

    public String getFIELD_FROM() {
        return FIELD_FROM;
    }

    public void setFIELD_FROM(String FIELD_FROM) {
        this.FIELD_FROM = FIELD_FROM;
    }

    public String getFIELD_CONCEPTUALDOMAIN() {
        return FIELD_CONCEPTUALDOMAIN;
    }

    public void setFIELD_CONCEPTUALDOMAIN(String FIELD_CONCEPTUALDOMAIN) {
        this.FIELD_CONCEPTUALDOMAIN = FIELD_CONCEPTUALDOMAIN;
    }

    public String getFIELDTYPE() {
        return FIELDTYPE;
    }

    public void setFIELDTYPE(String FIELDTYPE) {
        this.FIELDTYPE = FIELDTYPE;
    }

    public String getFIELDCODE_NAME() {
        return FIELDCODE_NAME;
    }

    public void setFIELDCODE_NAME(String FIELDCODE_NAME) {
        this.FIELDCODE_NAME = FIELDCODE_NAME;
    }

    public Integer getFIELD_CONCEPTUALDOMAIN_ID() {
        return FIELD_CONCEPTUALDOMAIN_ID;
    }

    public void setFIELD_CONCEPTUALDOMAIN_ID(Integer FIELD_CONCEPTUALDOMAIN_ID) {
        this.FIELD_CONCEPTUALDOMAIN_ID = FIELD_CONCEPTUALDOMAIN_ID;
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

    public Integer getFIELDORDER() {
        return FIELDORDER;
    }

    public void setFIELDORDER(Integer FIELDORDER) {
        this.FIELDORDER = FIELDORDER;
    }

}