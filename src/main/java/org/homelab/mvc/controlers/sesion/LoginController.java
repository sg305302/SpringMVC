package org.homelab.mvc.controlers.sesion;

import org.homelab.mvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("loggedUser")
public class LoginController {


    @PostMapping(value = "/login")
    public String postLogin(Model model, @ModelAttribute("user") User user) {

        model.addAttribute("loggedUser", user);
        return "redirect:user_page"; //redirect po to aby wywołał się kontroler
    }

    @GetMapping(value = "/login")
    public String login(Model model) {

        model.addAttribute("user", new User());
        return "login";
    }

}
