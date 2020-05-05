package org.homelab.mvc.controlers.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AdviceControler {

    @ExceptionHandler(NullPointerException.class)
    public String NullPointerException(NullPointerException e){
        return "handlerNullException";
    }
}
