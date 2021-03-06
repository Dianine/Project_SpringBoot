package com.dianinec.cursomc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException{
    //public NotFoundException(){
    //        super(String.valueOf(HttpStatus.NOT_FOUND));
    //    }

    public NotFoundException(String exception){
            super("User not found :"+exception);
        }
}
