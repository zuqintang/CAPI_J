package com.goodwill.domain;

import java.io.Serializable;
import java.sql.*;

/**
 * Created by GeneratorJavaBean 
 */
public class Sets implements Serializable {

    /**
     *  
     */
    private Integer ID ;

    /**
     *  
     */
    private String DS_CODE ;

    /**
     *  
     */
    private String DS_NAME ;

    /**
     *  
     */
    private String PYM ;

    /**
     *  
     */
    private String WBM ;

    /**
     *  
     */
    private String CREATOR ;

    /**
     *  
     */
    private String CREATED_AT ;

    /**
     *  
     */
    private String UPDATED_AT ;

    /**
     *  
     */
    private Integer DS_GROUP ;

    /**
     *  
     */
    private Integer YEAR_VERSION ;

    /**
     *  
     */
    private Integer DIS_GROUP ;

    /**
     *  0为数据集,1为数据组
     */
    private Integer DATA_SET_TYPE ;

    /**
     *  学科类别
     */
    private Integer STUDY_TYPE ;

    /**
     *  0为企标 1为国标
     */
    private Integer STANDARD ;

    /**
     *  0为未审核，1为审核
     */
    private null STATUS ;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getDS_CODE() {
        return DS_CODE;
    }

    public void setDS_CODE(String DS_CODE) {
        this.DS_CODE = DS_CODE;
    }

    public String getDS_NAME() {
        return DS_NAME;
    }

    public void setDS_NAME(String DS_NAME) {
        this.DS_NAME = DS_NAME;
    }

    public String getPYM() {
        return PYM;
    }

    public void setPYM(String PYM) {
        this.PYM = PYM;
    }

    public String getWBM() {
        return WBM;
    }

    public void setWBM(String WBM) {
        this.WBM = WBM;
    }

    public String getCREATOR() {
        return CREATOR;
    }

    public void setCREATOR(String CREATOR) {
        this.CREATOR = CREATOR;
    }

    public String getCREATED_AT() {
        return CREATED_AT;
    }

    public void setCREATED_AT(String CREATED_AT) {
        this.CREATED_AT = CREATED_AT;
    }

    public String getUPDATED_AT() {
        return UPDATED_AT;
    }

    public void setUPDATED_AT(String UPDATED_AT) {
        this.UPDATED_AT = UPDATED_AT;
    }

    public Integer getDS_GROUP() {
        return DS_GROUP;
    }

    public void setDS_GROUP(Integer DS_GROUP) {
        this.DS_GROUP = DS_GROUP;
    }

    public Integer getYEAR_VERSION() {
        return YEAR_VERSION;
    }

    public void setYEAR_VERSION(Integer YEAR_VERSION) {
        this.YEAR_VERSION = YEAR_VERSION;
    }

    public Integer getDIS_GROUP() {
        return DIS_GROUP;
    }

    public void setDIS_GROUP(Integer DIS_GROUP) {
        this.DIS_GROUP = DIS_GROUP;
    }

    public Integer getDATA_SET_TYPE() {
        return DATA_SET_TYPE;
    }

    public void setDATA_SET_TYPE(Integer DATA_SET_TYPE) {
        this.DATA_SET_TYPE = DATA_SET_TYPE;
    }

    public Integer getSTUDY_TYPE() {
        return STUDY_TYPE;
    }

    public void setSTUDY_TYPE(Integer STUDY_TYPE) {
        this.STUDY_TYPE = STUDY_TYPE;
    }

    public Integer getSTANDARD() {
        return STANDARD;
    }

    public void setSTANDARD(Integer STANDARD) {
        this.STANDARD = STANDARD;
    }

    public null getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(null STATUS) {
        this.STATUS = STATUS;
    }

}