package com.inn.cafe.cafe_management.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

// this class objective to store general method which can be used in any service
public class CafeUtils {

    private CafeUtils(){

    }

    public static ResponseEntity<String> getResponseEntity(String responseMessage,
                                                           HttpStatus httpStatus){
        return new ResponseEntity<String>("{\"message\":\""+responseMessage+"\"}", httpStatus );
    }

}
