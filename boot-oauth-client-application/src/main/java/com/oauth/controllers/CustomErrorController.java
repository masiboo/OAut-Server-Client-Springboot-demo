package com.oauth.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@ControllerAdvice
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError(Model model, @RequestParam(name = "error", required = false) String error, @RequestParam(name = "error_description", required = false) String errorDescription) {
        // Check if error and error_description parameters are present
        if (error != null && errorDescription != null) {
            // Add them as model attributes
            model.addAttribute("error", error);
            model.addAttribute("errorDescription", errorDescription);
        }

        // Your other logic here

        return "error"; // Replace "your-view" with the name of your Thymeleaf view
    }

    //  @Override
    public String getErrorPath() {
        return "/error";
    }
}

