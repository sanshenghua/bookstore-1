package com.seven.bookstore.domain;

public enum StateCode {
    UNKNOWN_ERROR(-1,"system error"),
    SUCCESS(0,"success"),
    NoUserFindById(1000,"can not find user by this id"),

    HTTP500ERROR(500,"请求参数不对"),
    HTTP200OK(200,"success")
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
