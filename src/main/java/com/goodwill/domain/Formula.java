package com.goodwill.domain;

import java.io.Serializable;
import java.sql.*;

/**
 * Created by GeneratorJavaBean 
 */
public class Formula implements Serializable {

    /**
     *  
     */
    private Integer ID ;

    /**
     *  
     */
    private String NAME ;

    /**
     *  所属的模板ID
     */
    private Integer TID ;

    /**
     *  
     */
    private Integer PID ;

    /**
     *  
     */
    private String SYMBOLS ;

    /**
     *  
     */
    private String EXP ;

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

    public Integer getTID() {
        return TID;
    }

    public void setTID(Integer TID) {
        this.TID = TID;
    }

    public Integer getPID() {
        return PID;
    }

    public void setPID(Integer PID) {
        this.PID = PID;
    }

    public String getSYMBOLS() {
        return SYMBOLS;
    }

    public void setSYMBOLS(String SYMBOLS) {
        this.SYMBOLS = SYMBOLS;
    }

    public String getEXP() {
        return EXP;
    }

    public void setEXP(String EXP) {
        this.EXP = EXP;
    }

}