package com.seven.bookstore.utils;

import com.seven.bookstore.domain.Response;

public class ResponseWrapper {
    public static Response success(Object object) {
        Response response = new Response();
        response.setCode(0);
        response.setMessage("success");
        response.setData(object);
        return  response;
    }

    public static Response success() {
        return success(null);
    }

    public static Response error(Integer code, String msg) {
        Response result = new Response();
        result.setCode(code);
        result.setMessage(msg);
        return  result;
    }


}
