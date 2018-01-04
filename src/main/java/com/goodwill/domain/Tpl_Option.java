package com.goodwill.domain;

import java.io.Serializable;
import java.sql.*;

/**
 * Created by GeneratorJavaBean 
 */
public class Tpl_Option implements Serializable {

    /**
     *  
     */
    private Integer ID ;

    /**
     *  0默认1后绑定
     */
    private Integer ISBIND ;

    /**
     *  别元ID
     */
    private String EALIAS_ID ;

    /**
     *  值的多对多表的ID
     */
    private Integer VOPTION_ID ;

    /**
     *  
     */
    private Integer TEMPLATE_ID ;

    /**
     *  
     */
    private String ALIAS ;

    /**
     *  
     */
    private String AVALUE ;

    /**
     *  
     */
    private String CVALUE ;

    /**
     *  
     */
    private Integer SORTER ;

    /**
     *  -1:删除0:显示1:隐藏2:新值
     */
    private Integer STATUS ;

    /**
     *  
     */
    private String TIMEI ;

    /**
     *  
     */
    private String TIMEU ;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getISBIND() {
        return ISBIND;
    }

    public void setISBIND(Integer ISBIND) {
        this.ISBIND = ISBIND;
    }

    public String getEALIAS_ID() {
        return EALIAS_ID;
    }

    public void setEALIAS_ID(String EALIAS_ID) {
        this.EALIAS_ID = EALIAS_ID;
    }

    public Integer getVOPTION_ID() {
        return VOPTION_ID;
    }

    public void setVOPTION_ID(Integer VOPTION_ID) {
        this.VOPTION_ID = VOPTION_ID;
    }

    public Integer getTEMPLATE_ID() {
        return TEMPLATE_ID;
    }

    public void setTEMPLATE_ID(Integer TEMPLATE_ID) {
        this.TEMPLATE_ID = TEMPLATE_ID;
    }

    public String getALIAS() {
        return ALIAS;
    }

    public void setALIAS(String ALIAS) {
        this.ALIAS = ALIAS;
    }

    public String getAVALUE() {
        return AVALUE;
    }

    public void setAVALUE(String AVALUE) {
        this.AVALUE = AVALUE;
    }

    public String getCVALUE() {
        return CVALUE;
    }

    public void setCVALUE(String CVALUE) {
        this.CVALUE = CVALUE;
    }

    public Integer getSORTER() {
        return SORTER;
    }

    public void setSORTER(Integer SORTER) {
        this.SORTER = SORTER;
    }

    public Integer getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Integer STATUS) {
        this.STATUS = STATUS;
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