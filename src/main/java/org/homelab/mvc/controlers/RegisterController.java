package org.homelab.mvc.controlers;

import org.homelab.mvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @PostMapping(value = "/register")
    public String postRegister(@ModelAttribute("user") User user, BindingResult bindingResult) {
        return "home";
    }

    @GetMapping(value = "/register")
    public String register(Model model) {

        model.addAttribute("user", new User());
        return "register";
    }
}
