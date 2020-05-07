package org.homelab.mvc.controlers;

import org.homelab.mvc.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeControler {

    //RequestMapping(value = "/user")
    @RequestMapping(value = "/")
    public String home(Model model){
        List<Product> productList = Arrays.asList(new Product("kat1", "Koszula"),new Product("kat2", "czapka"),
                new Product("kat1", "spodnie"));
        model.addAttribute("poductList", productList);
        model.addAttribute("nick", "jan");
            return "home";
    }
}
