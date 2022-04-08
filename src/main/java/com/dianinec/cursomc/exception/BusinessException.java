package com.dianinec.cursomc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.PRECONDITION_FAILED)
public class BusinessException extends RuntimeException{
    //    public BusinessException(){
//        super(String.valueOf(PRECONDITION_FAILED));
//    }

    public BusinessException(String exception){
        super(exception);
    }
}
