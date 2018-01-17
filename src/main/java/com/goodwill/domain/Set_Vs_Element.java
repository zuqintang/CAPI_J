package com.goodwill.domain;

import java.io.Serializable;
import java.sql.*;

/**
 * Created by GeneratorJavaBean 
 */
public class Set_Vs_Element implements Serializable {

    /**
     *  
     */
    private Integer ID ;

    /**
     *  
     */
    private String DS_INTERNAL_CODE ;

    /**
     *  
     */
    private String DS_CODE ;

    /**
     *  
     */
    private String DS_VS_CODE ;

    /**
     *  
     */
    private Integer DS_VS_TYPE ;

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

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getDS_INTERNAL_CODE() {
        return DS_INTERNAL_CODE;
    }

    public void setDS_INTERNAL_CODE(String DS_INTERNAL_CODE) {
        this.DS_INTERNAL_CODE = DS_INTERNAL_CODE;
    }

    public String getDS_CODE() {
        return DS_CODE;
    }

    public void setDS_CODE(String DS_CODE) {
        this.DS_CODE = DS_CODE;
    }

    public String getDS_VS_CODE() {
        return DS_VS_CODE;
    }

    public void setDS_VS_CODE(String DS_VS_CODE) {
        this.DS_VS_CODE = DS_VS_CODE;
    }

    public Integer getDS_VS_TYPE() {
        return DS_VS_TYPE;
    }

    public void setDS_VS_TYPE(Integer DS_VS_TYPE) {
        this.DS_VS_TYPE = DS_VS_TYPE;
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

}