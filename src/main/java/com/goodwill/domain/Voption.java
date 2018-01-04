package com.goodwill.domain;

import java.io.Serializable;
import java.sql.*;

/**
 * Created by GeneratorJavaBean 
 */
public class Voption implements Serializable {

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
    private String FIELDCODE_VALUE ;

    /**
     *  
     */
    private String FIELDCODE_VALUE_CN_NAME ;

    /**
     *  
     */
    private String FIELDCODE_VALUE_EG_NAME ;

    /**
     *  
     */
    private String FIELDCODE_VALUE_DESCRIBE ;

    /**
     *  
     */
    private String FIELD_COMPUTE ;

    /**
     *  
     */
    private String INPUT_CODE ;

    /**
     *  
     */
    private String FIELD_FROM ;

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
    private Integer FIELD_NAMEID ;

    /**
     *  
     */
    private Integer FIELDORDER ;

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

    public String getFIELDCODE_TABLECODE() {
        return FIELDCODE_TABLECODE;
    }

    public void setFIELDCODE_TABLECODE(String FIELDCODE_TABLECODE) {
        this.FIELDCODE_TABLECODE = FIELDCODE_TABLECODE;
    }

    public String getFIELDCODE_VALUE() {
        return FIELDCODE_VALUE;
    }

    public void setFIELDCODE_VALUE(String FIELDCODE_VALUE) {
        this.FIELDCODE_VALUE = FIELDCODE_VALUE;
    }

    public String getFIELDCODE_VALUE_CN_NAME() {
        return FIELDCODE_VALUE_CN_NAME;
    }

    public void setFIELDCODE_VALUE_CN_NAME(String FIELDCODE_VALUE_CN_NAME) {
        this.FIELDCODE_VALUE_CN_NAME = FIELDCODE_VALUE_CN_NAME;
    }

    public String getFIELDCODE_VALUE_EG_NAME() {
        return FIELDCODE_VALUE_EG_NAME;
    }

    public void setFIELDCODE_VALUE_EG_NAME(String FIELDCODE_VALUE_EG_NAME) {
        this.FIELDCODE_VALUE_EG_NAME = FIELDCODE_VALUE_EG_NAME;
    }

    public String getFIELDCODE_VALUE_DESCRIBE() {
        return FIELDCODE_VALUE_DESCRIBE;
    }

    public void setFIELDCODE_VALUE_DESCRIBE(String FIELDCODE_VALUE_DESCRIBE) {
        this.FIELDCODE_VALUE_DESCRIBE = FIELDCODE_VALUE_DESCRIBE;
    }

    public String getFIELD_COMPUTE() {
        return FIELD_COMPUTE;
    }

    public void setFIELD_COMPUTE(String FIELD_COMPUTE) {
        this.FIELD_COMPUTE = FIELD_COMPUTE;
    }

    public String getINPUT_CODE() {
        return INPUT_CODE;
    }

    public void setINPUT_CODE(String INPUT_CODE) {
        this.INPUT_CODE = INPUT_CODE;
    }

    public String getFIELD_FROM() {
        return FIELD_FROM;
    }

    public void setFIELD_FROM(String FIELD_FROM) {
        this.FIELD_FROM = FIELD_FROM;
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

    public Integer getFIELD_NAMEID() {
        return FIELD_NAMEID;
    }

    public void setFIELD_NAMEID(Integer FIELD_NAMEID) {
        this.FIELD_NAMEID = FIELD_NAMEID;
    }

    public Integer getFIELDORDER() {
        return FIELDORDER;
    }

    public void setFIELDORDER(Integer FIELDORDER) {
        this.FIELDORDER = FIELDORDER;
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