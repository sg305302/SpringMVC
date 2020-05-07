package org.homelab.mvc.controlers;

import org.homelab.mvc.pojo.User;
import org.homelab.mvc.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    UserValidator userValidator;

    @InitBinder
    protected  void initBinder(WebDataBinder binder){
        binder.addValidators(userValidator);
    }

    @PostMapping(value = "/register")
    public String postRegister(@ModelAttribute("user") @Validated User user, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return "register";
        }
        return "home";
    }

    @GetMapping(value = "/register")
    public String register(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }
}
