package com.goodwill.util;

/**
 * Created by liweiming on 2017/3/30.
 */
/*
执行一个获取操作，返回结果的抽象
 */
public class DataResult extends ExecuteResult {
    public Object Rows;
    public long Total;

    public Object getRows() {
        return Rows;
    }

    public void setRows(Object rows) {
        Rows = rows;
    }

    public long getTotal() {
        return Total;
    }

    public void setTotal(long total) {
        Total = total;
    }
}
