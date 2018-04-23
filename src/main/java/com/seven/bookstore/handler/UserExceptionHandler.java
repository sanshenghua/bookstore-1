package com.seven.bookstore.handler;

import com.seven.bookstore.domain.Response;
import com.seven.bookstore.domain.StateCode;
import com.seven.bookstore.domain.User;
import com.seven.bookstore.exception.UserException;
import com.seven.bookstore.utils.ResponseWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@ControllerAdvice
public class UserExceptionHandler {
    private final Logger log = LoggerFactory.getLogger(UserException.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public HashMap<String,Object> handler(Exception e ){
        if (e instanceof UserException) {
            UserException userException = (UserException) e;
            return ResponseWrapper.HttpError500(userException.getCode(), userException.getMessage());
        } else {
            log.error("System error : {}", e);
            return ResponseWrapper.HttpError500(StateCode.UNKNOWN_ERROR);
        }
    }
}

