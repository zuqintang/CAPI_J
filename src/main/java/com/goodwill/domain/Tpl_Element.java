package com.goodwill.domain;

import java.io.Serializable;
import java.sql.*;

/**
 * Created by GeneratorJavaBean 
 */
public class Tpl_Element implements Serializable {

    /**
     *  主键
     */
    private Integer INT_ID ;

    /**
     *  
     */
    private String ID ;

    /**
     *  0默认1后绑定
     */
    private Integer ISBIND ;

    /**
     *  
     */
    private Integer SORTER ;

    /**
     *  导出名
     */
    private String EXPORT_NAME ;

    /**
     *  0非隐私，1隐私
     */
    private Integer IS_PRIVACY ;

    /**
     *  0共享 1不共享
     */
    private Integer IS_SHARE ;

    /**
     *  0导出 1不导出
     */
    private Integer IS_EXPORT ;

    /**
     *  逻辑数据元
     */
    private String HELE ;

    /**
     *  逻辑值域
     */
    private Integer HVAL ;

    /**
     *  
     */
    private Integer TEMPLATE_ID ;

    /**
     *  
     */
    private String ELEMENT_ID ;

    /**
     *  
     */
    private Integer PROJECT_ID ;

    /**
     *  
     */
    private Integer ZID ;

    /**
     *  
     */
    private String ALIAS ;

    /**
     *  数据类型
     */
    private String DATATYPE ;

    /**
     *  1:不允许导出
     */
    private Integer EXPORT ;

    /**
     *  1:导入值
     */
    private Integer IMPORT ;

    /**
     *  自增标记
     */
    private Integer TINC ;

    /**
     *  
     */
    private String TIMEI ;

    /**
     *  
     */
    private String TIMEU ;

    public Integer getINT_ID() {
        return INT_ID;
    }

    public void setINT_ID(Integer INT_ID) {
        this.INT_ID = INT_ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Integer getISBIND() {
        return ISBIND;
    }

    public void setISBIND(Integer ISBIND) {
        this.ISBIND = ISBIND;
    }

    public Integer getSORTER() {
        return SORTER;
    }

    public void setSORTER(Integer SORTER) {
        this.SORTER = SORTER;
    }

    public String getEXPORT_NAME() {
        return EXPORT_NAME;
    }

    public void setEXPORT_NAME(String EXPORT_NAME) {
        this.EXPORT_NAME = EXPORT_NAME;
    }

    public Integer getIS_PRIVACY() {
        return IS_PRIVACY;
    }

    public void setIS_PRIVACY(Integer IS_PRIVACY) {
        this.IS_PRIVACY = IS_PRIVACY;
    }

    public Integer getIS_SHARE() {
        return IS_SHARE;
    }

    public void setIS_SHARE(Integer IS_SHARE) {
        this.IS_SHARE = IS_SHARE;
    }

    public Integer getIS_EXPORT() {
        return IS_EXPORT;
    }

    public void setIS_EXPORT(Integer IS_EXPORT) {
        this.IS_EXPORT = IS_EXPORT;
    }

    public String getHELE() {
        return HELE;
    }

    public void setHELE(String HELE) {
        this.HELE = HELE;
    }

    public Integer getHVAL() {
        return HVAL;
    }

    public void setHVAL(Integer HVAL) {
        this.HVAL = HVAL;
    }

    public Integer getTEMPLATE_ID() {
        return TEMPLATE_ID;
    }

    public void setTEMPLATE_ID(Integer TEMPLATE_ID) {
        this.TEMPLATE_ID = TEMPLATE_ID;
    }

    public String getELEMENT_ID() {
        return ELEMENT_ID;
    }

    public void setELEMENT_ID(String ELEMENT_ID) {
        this.ELEMENT_ID = ELEMENT_ID;
    }

    public Integer getPROJECT_ID() {
        return PROJECT_ID;
    }

    public void setPROJECT_ID(Integer PROJECT_ID) {
        this.PROJECT_ID = PROJECT_ID;
    }

    public Integer getZID() {
        return ZID;
    }

    public void setZID(Integer ZID) {
        this.ZID = ZID;
    }

    public String getALIAS() {
        return ALIAS;
    }

    public void setALIAS(String ALIAS) {
        this.ALIAS = ALIAS;
    }

    public String getDATATYPE() {
        return DATATYPE;
    }

    public void setDATATYPE(String DATATYPE) {
        this.DATATYPE = DATATYPE;
    }

    public Integer getEXPORT() {
        return EXPORT;
    }

    public void setEXPORT(Integer EXPORT) {
        this.EXPORT = EXPORT;
    }

    public Integer getIMPORT() {
        return IMPORT;
    }

    public void setIMPORT(Integer IMPORT) {
        this.IMPORT = IMPORT;
    }

    public Integer getTINC() {
        return TINC;
    }

    public void setTINC(Integer TINC) {
        this.TINC = TINC;
    }

    public String getTIMEI() {
        return TIMEI;
    }

    public void setTIMEI(String TIMEI) {
        this.TIMEI = TIMEI;
    }

    public String getTIMEU() {
        return TIMEU;
    }

    public void setTIMEU(String TIMEU) {
        this.TIMEU = TIMEU;
    }

}