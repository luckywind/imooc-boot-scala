package com.imooc.utils;

import java.io.Serializable;

public class ResultVO<T> implements Serializable {
    /**返回码*/
    private Integer code;
    /**返回信息*/
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**返回数据*/
    private T data;
}
