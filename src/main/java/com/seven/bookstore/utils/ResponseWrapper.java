package com.seven.bookstore.utils;

import com.seven.bookstore.domain.Response;
import com.seven.bookstore.domain.StateCode;

import java.util.HashMap;

public class ResponseWrapper {
    public static HashMap<String,Object> success(Object object) {
        Response response = new Response();
        response.setCode(0);
        response.setMessage("success");
        response.setData(object);

        HashMap<String, Object> header = new HashMap<>();
        header.put("ret",new Integer(200));
        header.put("message","连接正常");
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
        header.put("ret",new Integer(500));
        header.put("message","请求参数不对，找不到url");
        header.put("data",response);
        return header;
    }

    public static HashMap<String,Object> HttpError500(StateCode stateCode) {
        Response response = new Response();
        response.setCode(stateCode.getCode());
        response.setMessage(stateCode.getMsg());
        HashMap<String, Object> header = new HashMap<>();
        header.put("ret",new Integer(500));
        header.put("message","请求参数不对，找不到url");
        header.put("data",response);
        return header;
    }

}
