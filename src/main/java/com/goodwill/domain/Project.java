package com.goodwill.domain;

import java.io.Serializable;
import java.sql.*;

/**
 * Created by GeneratorJavaBean 
 */
public class Project implements Serializable {

    /**
     *  
     */
    private Integer ID ;

    /**
     *  
     */
    private String NAME ;

    /**
     *  
     */
    private String CREATE_TIME ;

    /**
     *  
     */
    private String CREATE_PEPOLEID ;

    /**
     *  
     */
    private String DISEASE_MANAGER ;

    /**
     *  
     */
    private Integer DEL_FLAG ;

    /**
     *  
     */
    private String TIMESTAMP ;

    /**
     *  
     */
    private Integer HOSPITAL_ID ;

    /**
     *  
     */
    private String HOSPITAL_NAME ;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getCREATE_TIME() {
        return CREATE_TIME;
    }

    public void setCREATE_TIME(String CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }

    public String getCREATE_PEPOLEID() {
        return CREATE_PEPOLEID;
    }

    public void setCREATE_PEPOLEID(String CREATE_PEPOLEID) {
        this.CREATE_PEPOLEID = CREATE_PEPOLEID;
    }

    public String getDISEASE_MANAGER() {
        return DISEASE_MANAGER;
    }

    public void setDISEASE_MANAGER(String DISEASE_MANAGER) {
        this.DISEASE_MANAGER = DISEASE_MANAGER;
    }

    public Integer getDEL_FLAG() {
        return DEL_FLAG;
    }

    public void setDEL_FLAG(Integer DEL_FLAG) {
        this.DEL_FLAG = DEL_FLAG;
    }

    public String getTIMESTAMP() {
        return TIMESTAMP;
    }

    public void setTIMESTAMP(String TIMESTAMP) {
        this.TIMESTAMP = TIMESTAMP;
    }

    public Integer getHOSPITAL_ID() {
        return HOSPITAL_ID;
    }

    public void setHOSPITAL_ID(Integer HOSPITAL_ID) {
        this.HOSPITAL_ID = HOSPITAL_ID;
    }

    public String getHOSPITAL_NAME() {
        return HOSPITAL_NAME;
    }

    public void setHOSPITAL_NAME(String HOSPITAL_NAME) {
        this.HOSPITAL_NAME = HOSPITAL_NAME;
    }

}