package com.dgsw.springbootdeveloper;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/")
    public String index(Model model) {
        Test test = new Test(5);
        model.addAttribute("value", test.getValue());
        return "index";
    }
}
