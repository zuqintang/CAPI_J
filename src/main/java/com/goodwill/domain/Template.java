package com.goodwill.domain;

import java.io.Serializable;
import java.sql.*;

/**
 * Created by GeneratorJavaBean 
 */
public class Template implements Serializable {

    /**
     *  
     */
    private Integer PID ;

    /**
     *  
     */
    private Integer ID ;

    /**
     *  
     */
    private Integer SORTER ;

    /**
     *  
     */
    private String NAME ;

    /**
     *  
     */
    private String HNAME ;

    /**
     *  
     */
    private String PNAME ;

    /**
     *  
     */
    private Integer HID ;

    /**
     *  分类ID
     */
    private Integer ZID ;

    /**
     *  
     */
    private String HTMLSTR ;

    /**
     *  逻辑JSON
     */
    private String LOGICJSON ;

    /**
     *  发布版:小片段
     */
    private Integer PRO_TYPE ;

    /**
     *  松紧程度
     */
    private String STYLE_PADDING ;

    /**
     *  色调
     */
    private String STYLE_COLOR ;

    /**
     *  
     */
    private String CREATE_TIME ;

    /**
     *  
     */
    private String CREATE_MAN ;

    /**
     *  
     */
    private Integer VISION_ID ;

    /**
     *  
     */
    private Integer TEMPLET_STATUS ;

    /**
     *  
     */
    private String TIMESTAMP ;

    /**
     *  
     */
    private Integer DEL_FLAG ;

    /**
     *  
     */
    private String VISIBLED ;

    /**
     *  
     */
    private String SHOW_ORDER ;

    /**
     *  
     */
    private String INPUT_CODE ;

    /**
     *  
     */
    private String REPEAT_FLAG ;

    /**
     *  
     */
    private String CHECK_DEFAULT ;

    /**
     *  
     */
    private String VERSION_DATE ;

    /**
     *  
     */
    private String CRF_CONTENT_ID ;

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
    private Integer SHOWFLAG ;

    /**
     *  
     */
    private String TIP ;

    public Integer getPID() {
        return PID;
    }

    public void setPID(Integer PID) {
        this.PID = PID;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getSORTER() {
        return SORTER;
    }

    public void setSORTER(Integer SORTER) {
        this.SORTER = SORTER;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getHNAME() {
        return HNAME;
    }

    public void setHNAME(String HNAME) {
        this.HNAME = HNAME;
    }

    public String getPNAME() {
        return PNAME;
    }

    public void setPNAME(String PNAME) {
        this.PNAME = PNAME;
    }

    public Integer getHID() {
        return HID;
    }

    public void setHID(Integer HID) {
        this.HID = HID;
    }

    public Integer getZID() {
        return ZID;
    }

    public void setZID(Integer ZID) {
        this.ZID = ZID;
    }

    public String getHTMLSTR() {
        return HTMLSTR;
    }

    public void setHTMLSTR(String HTMLSTR) {
        this.HTMLSTR = HTMLSTR;
    }

    public String getLOGICJSON() {
        return LOGICJSON;
    }

    public void setLOGICJSON(String LOGICJSON) {
        this.LOGICJSON = LOGICJSON;
    }

    public Integer getPRO_TYPE() {
        return PRO_TYPE;
    }

    public void setPRO_TYPE(Integer PRO_TYPE) {
        this.PRO_TYPE = PRO_TYPE;
    }

    public String getSTYLE_PADDING() {
        return STYLE_PADDING;
    }

    public void setSTYLE_PADDING(String STYLE_PADDING) {
        this.STYLE_PADDING = STYLE_PADDING;
    }

    public String getSTYLE_COLOR() {
        return STYLE_COLOR;
    }

    public void setSTYLE_COLOR(String STYLE_COLOR) {
        this.STYLE_COLOR = STYLE_COLOR;
    }

    public String getCREATE_TIME() {
        return CREATE_TIME;
    }

    public void setCREATE_TIME(String CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }

    public String getCREATE_MAN() {
        return CREATE_MAN;
    }

    public void setCREATE_MAN(String CREATE_MAN) {
        this.CREATE_MAN = CREATE_MAN;
    }

    public Integer getVISION_ID() {
        return VISION_ID;
    }

    public void setVISION_ID(Integer VISION_ID) {
        this.VISION_ID = VISION_ID;
    }

    public Integer getTEMPLET_STATUS() {
        return TEMPLET_STATUS;
    }

    public void setTEMPLET_STATUS(Integer TEMPLET_STATUS) {
        this.TEMPLET_STATUS = TEMPLET_STATUS;
    }

    public String getTIMESTAMP() {
        return TIMESTAMP;
    }

    public void setTIMESTAMP(String TIMESTAMP) {
        this.TIMESTAMP = TIMESTAMP;
    }

    public Integer getDEL_FLAG() {
        return DEL_FLAG;
    }

    public void setDEL_FLAG(Integer DEL_FLAG) {
        this.DEL_FLAG = DEL_FLAG;
    }

    public String getVISIBLED() {
        return VISIBLED;
    }

    public void setVISIBLED(String VISIBLED) {
        this.VISIBLED = VISIBLED;
    }

    public String getSHOW_ORDER() {
        return SHOW_ORDER;
    }

    public void setSHOW_ORDER(String SHOW_ORDER) {
        this.SHOW_ORDER = SHOW_ORDER;
    }

    public String getINPUT_CODE() {
        return INPUT_CODE;
    }

    public void setINPUT_CODE(String INPUT_CODE) {
        this.INPUT_CODE = INPUT_CODE;
    }

    public String getREPEAT_FLAG() {
        return REPEAT_FLAG;
    }

    public void setREPEAT_FLAG(String REPEAT_FLAG) {
        this.REPEAT_FLAG = REPEAT_FLAG;
    }

    public String getCHECK_DEFAULT() {
        return CHECK_DEFAULT;
    }

    public void setCHECK_DEFAULT(String CHECK_DEFAULT) {
        this.CHECK_DEFAULT = CHECK_DEFAULT;
    }

    public String getVERSION_DATE() {
        return VERSION_DATE;
    }

    public void setVERSION_DATE(String VERSION_DATE) {
        this.VERSION_DATE = VERSION_DATE;
    }

    public String getCRF_CONTENT_ID() {
        return CRF_CONTENT_ID;
    }

    public void setCRF_CONTENT_ID(String CRF_CONTENT_ID) {
        this.CRF_CONTENT_ID = CRF_CONTENT_ID;
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

    public Integer getSHOWFLAG() {
        return SHOWFLAG;
    }

    public void setSHOWFLAG(Integer SHOWFLAG) {
        this.SHOWFLAG = SHOWFLAG;
    }

    public String getTIP() {
        return TIP;
    }

    public void setTIP(String TIP) {
        this.TIP = TIP;
    }

}