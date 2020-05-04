package org.homelab.mvc.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionControler {

    @RequestMapping(value = "/nullException")
    public String IOException() {
        throw new NullPointerException();
    }


    @RequestMapping(value = "/argumentException")
    public String runtimeException() {
        throw new IllegalArgumentException();
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String handlerException(IllegalArgumentException e) {
        //e.getLocalizedMessage() itd...
        return "handlerArgumentException";
    }

}
