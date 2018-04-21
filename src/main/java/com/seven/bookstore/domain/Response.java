package com.seven.bookstore.domain;

import javax.persistence.criteria.CriteriaBuilder;

public class Response<T> {

    //错误码
    private Integer code;

    //message
    private String message;

    //data
    private T data;

    public Response(){

    }

    public Response(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Response(StateCode stateCode,T data){
        this.code = stateCode.getCode();
        this.message = stateCode.getMsg();
        this.data =data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
