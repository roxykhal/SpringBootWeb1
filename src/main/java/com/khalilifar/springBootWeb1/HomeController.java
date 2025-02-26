package com.khalilifar.springBootWeb1;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//Controller class contains methods responsible for handling requests
//@Controller defines spring MVC controller - will handle HTTP requests and return views

@Controller
public class HomeController {

//Maps HTTP request to the root url, when user navigates to homepage, this method is triggered
    @RequestMapping("/")
    public String home() {
        //indicates view name to be returned is index, it will look for a view named index.jsp to render home page
        return "index";
    }

    //Maps the request for the add URL
    @RequestMapping("add")

    //method accepts two parameters, which are auto populated from query parameters in request
    public ModelAndView add(int num1, int num2, ModelAndView mv) {

        int result = num1 + num2;

        //model object, used to pass data from controller to the view, in this case result.jsp view. Add attribute
        // adds calculated result to the model which can be accessed in JSP
        mv.addObject("result", result);
        mv.setViewName("result");

        //controller will forward the user to a view named result.jsp and result is displayed to user

        return mv;


    }


}
