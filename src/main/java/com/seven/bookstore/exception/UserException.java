package com.seven.bookstore.exception;

import com.seven.bookstore.domain.StateCode;
public class UserException extends RuntimeException {
    private Integer code;
    private String message;


    public UserException(StateCode stateCode) {
        this.code = stateCode.getCode();
        this.message = stateCode.getMsg();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
