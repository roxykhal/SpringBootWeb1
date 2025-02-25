package com.khalilifar.springBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
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

    //Accept the request when adding the two numbers
    @RequestMapping("add")
    public String add(HttpServletRequest req, HttpSession session) {

        //to get value from request object
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2;

        //parse the name and the data
        session.setAttribute("result", result);

        return "result.jsp";


    }


}
