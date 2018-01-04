package com.goodwill.domain;

import java.io.Serializable;
import java.sql.*;

/**
 * Created by GeneratorJavaBean 
 */
public class Hospital implements Serializable {

    /**
     *  
     */
    private Integer ID ;

    /**
     *  
     */
    private String NAME ;

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

}