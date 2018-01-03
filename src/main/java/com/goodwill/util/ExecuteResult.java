package com.goodwill.util;

/**
 * Created by liweiming on 2017/3/30.
 */
/*
执行一个动作操作，返回结果的抽象
 */
public class ExecuteResult {
    public String Code;
    public String Message;

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
