package com.seven.bookstore.domain;

public enum StateCode {
    UNKNOWN_ERROR(-1,"system error"),
    SUCCESS(0,"success"),
    NoObject(400,"no object")
    ;

    private Integer code;
    private String msg;

    StateCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

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
}
