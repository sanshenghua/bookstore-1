package com.seven.bookstore.utils;

import com.seven.bookstore.domain.Response;
import com.seven.bookstore.domain.StateCode;
import com.seven.bookstore.exception.UserException;

import java.util.HashMap;

public class ResponseWrapper {
    public static HashMap<String,Object> success(Object object) {
        Response response = new Response();
        response.setCode(StateCode.SUCCESS.getCode());
        response.setMessage(StateCode.SUCCESS.getMsg());
        response.setData(object);

        HashMap<String, Object> header = new HashMap<>();
        header.put("ret",StateCode.HTTP200OK.getCode());
        header.put("message",StateCode.HTTP200OK.getMsg());
        header.put("data",response);

        return  header;
    }

    public static HashMap<String,Object> success() {
        return success(null);
    }

    public static HashMap<String,Object> HttpError500(Integer code, String msg) {
        Response response = new Response();
        response.setCode(code);
        response.setMessage(msg);
        HashMap<String, Object> header = new HashMap<>();
        header.put("ret",StateCode.HTTP500ERROR.getCode());
        header.put("message",StateCode.HTTP500ERROR.getMsg());
        header.put("data",response);
        return header;
    }

    public static HashMap<String,Object> HttpError500(StateCode stateCode) {
        Response response = new Response();
        response.setCode(stateCode.getCode());
        response.setMessage(stateCode.getMsg());
        HashMap<String, Object> header = new HashMap<>();
        header.put("ret",StateCode.HTTP500ERROR.getCode());
        header.put("message",StateCode.HTTP500ERROR.getMsg());
        header.put("data",response);
        return header;
    }

    public static HashMap<String,Object> HttpError500(UserException e) {
        Response response = new Response();
        response.setCode(e.getCode());
        response.setMessage(e.getMessage());
        HashMap<String, Object> header = new HashMap<>();
        header.put("ret",StateCode.HTTP500ERROR.getCode());
        header.put("message",StateCode.HTTP500ERROR.getMsg());
        header.put("data",response);
        return header;
    }
}
