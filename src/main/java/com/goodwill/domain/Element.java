package com.goodwill.domain;

import java.io.Serializable;
import java.sql.*;

/**
 * Created by GeneratorJavaBean 
 */
public class Element implements Serializable {

    /**
     *  
     */
    private Integer ID ;

    /**
     *  
     */
    private String METADATA_IDENTIFY ;

    /**
     *  
     */
    private String METADATA_INNER_IDENTIFY ;

    /**
     *  
     */
    private String METADATA_NAME ;

    /**
     *  
     */
    private String METADATATYPE_CODE ;

    /**
     *  
     */
    private String METADATAFIELD_TYPE ;

    /**
     *  
     */
    private String FIELDCODE_TABLECODE ;

    /**
     *  
     */
    private String FILED_DESCRIBE ;

    /**
     *  
     */
    private String METADATA_INTRO ;

    /**
     *  
     */
    private String METADATA_EGNAME ;

    /**
     *  
     */
    private String SAS_CODE ;

    /**
     *  
     */
    private String SHOW_ORDER ;

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
    private String INPUT_CODE ;

    /**
     *  
     */
    private String WUBI_CODE ;

    /**
     *  
     */
    private Integer DEL_FLAG ;

    /**
     *  
     */
    private String INPUT_TYPE ;

    /**
     *  
     */
    private String COMPLETENAME ;

    /**
     *  
     */
    private String RELASIONSHIP_CODE ;

    /**
     *  
     */
    private String PREFIX ;

    /**
     *  
     */
    private String METAITEM ;

    /**
     *  
     */
    private Integer PID ;

    /**
     *  
     */
    private String TIMESTAMP ;

    /**
     *  
     */
    private Integer MAST_FLAG ;

    /**
     *  
     */
    private String FATHER_FLAG ;

    /**
     *  
     */
    private String EFFECT_DATAMETA ;

    /**
     *  
     */
    private String EFFECT_FLAG ;

    /**
     *  
     */
    private String MAX_VALUE ;

    /**
     *  
     */
    private String MIN_VALUE ;

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
    private String DATA_META_TYPE ;

    /**
     *  
     */
    private String DATA_META_REGULAR ;

    /**
     *  
     */
    private String DATA_META_DATATYPE ;

    /**
     *  
     */
    private String DATA_META_DISPLAY ;

    /**
     *  
     */
    private String DATA_META_VALUE ;

    /**
     *  
     */
    private String DATAMETA_FROM ;

    /**
     *  
     */
    private String DATA_UNIT ;

    /**
     *  
     */
    private Integer DATA_OBJECT_ID ;

    /**
     *  
     */
    private Integer DATA_FEATURE_ID ;

    /**
     *  
     */
    private Integer DATA_DISPLAY_ID ;

    /**
     *  
     */
    private String DATA_META_PREFIX ;

    /**
     *  
     */
    private String DATA_OBJECT_NAME ;

    /**
     *  
     */
    private String DATA_DISPLAY ;

    /**
     *  
     */
    private String METADATAFIELD_NAME ;

    /**
     *  
     */
    private String DATA_FEATURE_NAME ;

    /**
     *  
     */
    private String DATASET_ID ;

    /**
     *  
     */
    private String DATASET_NAME ;

    /**
     *  
     */
    private String SHOR_ORDER ;

    /**
     *  
     */
    private Integer METAID ;

    /**
     *  
     */
    private String MAXLENGTH ;

    /**
     *  
     */
    private String MINLENGTH ;

    /**
     *  
     */
    private String INT_NUM ;

    /**
     *  
     */
    private String DECIMAL_NUM ;

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
    private String DISEASE_ID ;

    /**
     *  0为企标，1为国标
     */
    private Integer STANDARD ;

    /**
     *  
     */
    private String METADATA_EN_INTRO ;

    /**
     *  0为主数据元，大于0为对照，null为未对照
     */
    private Integer MAIN_METADATA_ID ;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getMETADATA_IDENTIFY() {
        return METADATA_IDENTIFY;
    }

    public void setMETADATA_IDENTIFY(String METADATA_IDENTIFY) {
        this.METADATA_IDENTIFY = METADATA_IDENTIFY;
    }

    public String getMETADATA_INNER_IDENTIFY() {
        return METADATA_INNER_IDENTIFY;
    }

    public void setMETADATA_INNER_IDENTIFY(String METADATA_INNER_IDENTIFY) {
        this.METADATA_INNER_IDENTIFY = METADATA_INNER_IDENTIFY;
    }

    public String getMETADATA_NAME() {
        return METADATA_NAME;
    }

    public void setMETADATA_NAME(String METADATA_NAME) {
        this.METADATA_NAME = METADATA_NAME;
    }

    public String getMETADATATYPE_CODE() {
        return METADATATYPE_CODE;
    }

    public void setMETADATATYPE_CODE(String METADATATYPE_CODE) {
        this.METADATATYPE_CODE = METADATATYPE_CODE;
    }

    public String getMETADATAFIELD_TYPE() {
        return METADATAFIELD_TYPE;
    }

    public void setMETADATAFIELD_TYPE(String METADATAFIELD_TYPE) {
        this.METADATAFIELD_TYPE = METADATAFIELD_TYPE;
    }

    public String getFIELDCODE_TABLECODE() {
        return FIELDCODE_TABLECODE;
    }

    public void setFIELDCODE_TABLECODE(String FIELDCODE_TABLECODE) {
        this.FIELDCODE_TABLECODE = FIELDCODE_TABLECODE;
    }

    public String getFILED_DESCRIBE() {
        return FILED_DESCRIBE;
    }

    public void setFILED_DESCRIBE(String FILED_DESCRIBE) {
        this.FILED_DESCRIBE = FILED_DESCRIBE;
    }

    public String getMETADATA_INTRO() {
        return METADATA_INTRO;
    }

    public void setMETADATA_INTRO(String METADATA_INTRO) {
        this.METADATA_INTRO = METADATA_INTRO;
    }

    public String getMETADATA_EGNAME() {
        return METADATA_EGNAME;
    }

    public void setMETADATA_EGNAME(String METADATA_EGNAME) {
        this.METADATA_EGNAME = METADATA_EGNAME;
    }

    public String getSAS_CODE() {
        return SAS_CODE;
    }

    public void setSAS_CODE(String SAS_CODE) {
        this.SAS_CODE = SAS_CODE;
    }

    public String getSHOW_ORDER() {
        return SHOW_ORDER;
    }

    public void setSHOW_ORDER(String SHOW_ORDER) {
        this.SHOW_ORDER = SHOW_ORDER;
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

    public Integer getDEL_FLAG() {
        return DEL_FLAG;
    }

    public void setDEL_FLAG(Integer DEL_FLAG) {
        this.DEL_FLAG = DEL_FLAG;
    }

    public String getINPUT_TYPE() {
        return INPUT_TYPE;
    }

    public void setINPUT_TYPE(String INPUT_TYPE) {
        this.INPUT_TYPE = INPUT_TYPE;
    }

    public String getCOMPLETENAME() {
        return COMPLETENAME;
    }

    public void setCOMPLETENAME(String COMPLETENAME) {
        this.COMPLETENAME = COMPLETENAME;
    }

    public String getRELASIONSHIP_CODE() {
        return RELASIONSHIP_CODE;
    }

    public void setRELASIONSHIP_CODE(String RELASIONSHIP_CODE) {
        this.RELASIONSHIP_CODE = RELASIONSHIP_CODE;
    }

    public String getPREFIX() {
        return PREFIX;
    }

    public void setPREFIX(String PREFIX) {
        this.PREFIX = PREFIX;
    }

    public String getMETAITEM() {
        return METAITEM;
    }

    public void setMETAITEM(String METAITEM) {
        this.METAITEM = METAITEM;
    }

    public Integer getPID() {
        return PID;
    }

    public void setPID(Integer PID) {
        this.PID = PID;
    }

    public String getTIMESTAMP() {
        return TIMESTAMP;
    }

    public void setTIMESTAMP(String TIMESTAMP) {
        this.TIMESTAMP = TIMESTAMP;
    }

    public Integer getMAST_FLAG() {
        return MAST_FLAG;
    }

    public void setMAST_FLAG(Integer MAST_FLAG) {
        this.MAST_FLAG = MAST_FLAG;
    }

    public String getFATHER_FLAG() {
        return FATHER_FLAG;
    }

    public void setFATHER_FLAG(String FATHER_FLAG) {
        this.FATHER_FLAG = FATHER_FLAG;
    }

    public String getEFFECT_DATAMETA() {
        return EFFECT_DATAMETA;
    }

    public void setEFFECT_DATAMETA(String EFFECT_DATAMETA) {
        this.EFFECT_DATAMETA = EFFECT_DATAMETA;
    }

    public String getEFFECT_FLAG() {
        return EFFECT_FLAG;
    }

    public void setEFFECT_FLAG(String EFFECT_FLAG) {
        this.EFFECT_FLAG = EFFECT_FLAG;
    }

    public String getMAX_VALUE() {
        return MAX_VALUE;
    }

    public void setMAX_VALUE(String MAX_VALUE) {
        this.MAX_VALUE = MAX_VALUE;
    }

    public String getMIN_VALUE() {
        return MIN_VALUE;
    }

    public void setMIN_VALUE(String MIN_VALUE) {
        this.MIN_VALUE = MIN_VALUE;
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

    public String getDATA_META_TYPE() {
        return DATA_META_TYPE;
    }

    public void setDATA_META_TYPE(String DATA_META_TYPE) {
        this.DATA_META_TYPE = DATA_META_TYPE;
    }

    public String getDATA_META_REGULAR() {
        return DATA_META_REGULAR;
    }

    public void setDATA_META_REGULAR(String DATA_META_REGULAR) {
        this.DATA_META_REGULAR = DATA_META_REGULAR;
    }

    public String getDATA_META_DATATYPE() {
        return DATA_META_DATATYPE;
    }

    public void setDATA_META_DATATYPE(String DATA_META_DATATYPE) {
        this.DATA_META_DATATYPE = DATA_META_DATATYPE;
    }

    public String getDATA_META_DISPLAY() {
        return DATA_META_DISPLAY;
    }

    public void setDATA_META_DISPLAY(String DATA_META_DISPLAY) {
        this.DATA_META_DISPLAY = DATA_META_DISPLAY;
    }

    public String getDATA_META_VALUE() {
        return DATA_META_VALUE;
    }

    public void setDATA_META_VALUE(String DATA_META_VALUE) {
        this.DATA_META_VALUE = DATA_META_VALUE;
    }

    public String getDATAMETA_FROM() {
        return DATAMETA_FROM;
    }

    public void setDATAMETA_FROM(String DATAMETA_FROM) {
        this.DATAMETA_FROM = DATAMETA_FROM;
    }

    public String getDATA_UNIT() {
        return DATA_UNIT;
    }

    public void setDATA_UNIT(String DATA_UNIT) {
        this.DATA_UNIT = DATA_UNIT;
    }

    public Integer getDATA_OBJECT_ID() {
        return DATA_OBJECT_ID;
    }

    public void setDATA_OBJECT_ID(Integer DATA_OBJECT_ID) {
        this.DATA_OBJECT_ID = DATA_OBJECT_ID;
    }

    public Integer getDATA_FEATURE_ID() {
        return DATA_FEATURE_ID;
    }

    public void setDATA_FEATURE_ID(Integer DATA_FEATURE_ID) {
        this.DATA_FEATURE_ID = DATA_FEATURE_ID;
    }

    public Integer getDATA_DISPLAY_ID() {
        return DATA_DISPLAY_ID;
    }

    public void setDATA_DISPLAY_ID(Integer DATA_DISPLAY_ID) {
        this.DATA_DISPLAY_ID = DATA_DISPLAY_ID;
    }

    public String getDATA_META_PREFIX() {
        return DATA_META_PREFIX;
    }

    public void setDATA_META_PREFIX(String DATA_META_PREFIX) {
        this.DATA_META_PREFIX = DATA_META_PREFIX;
    }

    public String getDATA_OBJECT_NAME() {
        return DATA_OBJECT_NAME;
    }

    public void setDATA_OBJECT_NAME(String DATA_OBJECT_NAME) {
        this.DATA_OBJECT_NAME = DATA_OBJECT_NAME;
    }

    public String getDATA_DISPLAY() {
        return DATA_DISPLAY;
    }

    public void setDATA_DISPLAY(String DATA_DISPLAY) {
        this.DATA_DISPLAY = DATA_DISPLAY;
    }

    public String getMETADATAFIELD_NAME() {
        return METADATAFIELD_NAME;
    }

    public void setMETADATAFIELD_NAME(String METADATAFIELD_NAME) {
        this.METADATAFIELD_NAME = METADATAFIELD_NAME;
    }

    public String getDATA_FEATURE_NAME() {
        return DATA_FEATURE_NAME;
    }

    public void setDATA_FEATURE_NAME(String DATA_FEATURE_NAME) {
        this.DATA_FEATURE_NAME = DATA_FEATURE_NAME;
    }

    public String getDATASET_ID() {
        return DATASET_ID;
    }

    public void setDATASET_ID(String DATASET_ID) {
        this.DATASET_ID = DATASET_ID;
    }

    public String getDATASET_NAME() {
        return DATASET_NAME;
    }

    public void setDATASET_NAME(String DATASET_NAME) {
        this.DATASET_NAME = DATASET_NAME;
    }

    public String getSHOR_ORDER() {
        return SHOR_ORDER;
    }

    public void setSHOR_ORDER(String SHOR_ORDER) {
        this.SHOR_ORDER = SHOR_ORDER;
    }

    public Integer getMETAID() {
        return METAID;
    }

    public void setMETAID(Integer METAID) {
        this.METAID = METAID;
    }

    public String getMAXLENGTH() {
        return MAXLENGTH;
    }

    public void setMAXLENGTH(String MAXLENGTH) {
        this.MAXLENGTH = MAXLENGTH;
    }

    public String getMINLENGTH() {
        return MINLENGTH;
    }

    public void setMINLENGTH(String MINLENGTH) {
        this.MINLENGTH = MINLENGTH;
    }

    public String getINT_NUM() {
        return INT_NUM;
    }

    public void setINT_NUM(String INT_NUM) {
        this.INT_NUM = INT_NUM;
    }

    public String getDECIMAL_NUM() {
        return DECIMAL_NUM;
    }

    public void setDECIMAL_NUM(String DECIMAL_NUM) {
        this.DECIMAL_NUM = DECIMAL_NUM;
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

    public String getDISEASE_ID() {
        return DISEASE_ID;
    }

    public void setDISEASE_ID(String DISEASE_ID) {
        this.DISEASE_ID = DISEASE_ID;
    }

    public Integer getSTANDARD() {
        return STANDARD;
    }

    public void setSTANDARD(Integer STANDARD) {
        this.STANDARD = STANDARD;
    }

    public String getMETADATA_EN_INTRO() {
        return METADATA_EN_INTRO;
    }

    public void setMETADATA_EN_INTRO(String METADATA_EN_INTRO) {
        this.METADATA_EN_INTRO = METADATA_EN_INTRO;
    }

    public Integer getMAIN_METADATA_ID() {
        return MAIN_METADATA_ID;
    }

    public void setMAIN_METADATA_ID(Integer MAIN_METADATA_ID) {
        this.MAIN_METADATA_ID = MAIN_METADATA_ID;
    }

}