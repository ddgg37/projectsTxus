package es.paginadetxus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {
	@RequestMapping("/homePage")
    public ModelAndView helloWorld() {
 
        String message = "Hello World, Spring 3.0!";
        return new ModelAndView("homePage", "message", message);
    }
}
