package com.goodwill.util;


import net.sf.json.JsonConfig;
import net.sf.json.processors.DefaultValueProcessor;

/**
 * 控制器基类.
 */
public class BaseController {


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
