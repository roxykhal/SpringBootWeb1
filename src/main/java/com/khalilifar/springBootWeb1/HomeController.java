package com.khalilifar.springBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    //responsible to call index.jsp
    //maps the request
    @RequestMapping("/")
    public String home() {
        return "index.jsp";
    }


}
