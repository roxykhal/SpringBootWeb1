package com.khalilifar.springBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    //responsible to call index.jsp
    //maps the request
    @RequestMapping("/")
    public String home() {
        return "index";
    }

    //Accept the request when adding the two numbers
    @RequestMapping("add")

    public String add(int num1, int num2, Model model) {

        int result = num1 + num2;

        //The result is added to the Model object, which is passed to the view (result.jsp in this case).
        model.addAttribute("result", result);

        return "result";


    }


}
