package org.grcapp.grcapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {

    @RequestMapping("/login")
    public String showLoginForm() {
        return "login.html";
    }

    @RequestMapping("/home")
    public String home() {
        return "home.html";
    }

    @RequestMapping("/")
    public String rootRedirect() {
        return "redirect:/home";
    }
    @RequestMapping("/dashboard")
    public String dashboard() {
        return "dashboard.html";
    }
}