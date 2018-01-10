package com.goodwill.util;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ModelAttribute;

import net.sf.json.JsonConfig;
import net.sf.json.processors.DefaultValueProcessor;

/**
 * 控制器基类.
 */
public class BaseController {
	public static final int DATA_SET_TYPE=0;
	public static final int DATA_GROUP_TYPE=1;
	public static final int DATA_ELEMENT_TYPE=2;
	public static final int DATA_CONCEPT_TYPE=3;
	public static final int DATA_FIELDCODE_TYPE=4;
	public static final int DATA_OPTION_TYPE=5;
	
	protected HttpServletRequest request;  
    protected HttpServletResponse response;  
    protected HttpSession session;  
  
    @ModelAttribute  
    public void setReqAndRes(HttpServletRequest request, HttpServletResponse response){  
        this.request = request;  
        this.response = response;  
        this.session = request.getSession();  
    }  

    //全局设置Integer类型为空的默认值 json-lib默认是0
    protected JsonConfig jsonConfig = new JsonConfig();

    public BaseController() {
        jsonConfig.registerDefaultValueProcessor(Integer.class,
                new DefaultValueProcessor() {
                    public Object getDefaultValue(Class type) {
                        return "";
                    }
                });
    }

    protected ExecuteResult FromBoolean(Boolean result, String message) {
        ExecuteResult er = new ExecuteResult();
        er.setCode(result ? "0" : "1");
        er.setMessage(message);
        return er;
    }

    protected DataResult FromObject(Object result, long total, String code, String message) {
        DataResult dr = new DataResult();
        dr.setCode(code);
        dr.setMessage(message);
        dr.setRows(result);
        dr.setTotal(total);
        return dr;
    }    
}
