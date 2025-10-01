package com.example.finalproj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {

    @GetMapping("/")
    public String serveLoginPage() {
        return "Login/Signup/Login";
    }

    @PostMapping("/login")
    public String handleLogin(
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam String role) {

        // TODO: Add validation / database check here
        System.out.println("Email: " + email + ", Role: " + role);

        // Redirect to teacher or student dashboard
        if ("teacher".equals(role)) {
            return "redirect:/index";   // teacher UI
        } else {
            return "redirect:/Dashboard";  // student UI
        }
    }


    @GetMapping("/Signup")
    public String serveSignupPage() {

        return "Login/Signup/signup";
    }

    @GetMapping("/index")
    public String serveIndexPage() {
        return "Teacher UI/index";
    }

    @GetMapping("/Groups")
    public String serveGroupPage() {
        return "Teacher UI/Groups";
    }

    @GetMapping("/Students")
    public String serveStudentsPage() {
        return "Teacher UI/Students";
    }

    @GetMapping("/Events")
    public String serveEventsPage() {
        return "Teacher UI/Events";
    }

    @GetMapping("/Chat")
    public String serveChatPage() {
        return "Teacher UI/Chat";
    }

    @GetMapping("/Dashboard")
    public String serveDashboardPage() {
        return "StudentUI/Dashboard";
    }

    @GetMapping("/StudentGroup")
    public String serveSGPage() {
        return "StudentUI/StudentGroup";
    }

    @GetMapping("/StudentEvents")
    public String serveSEPage() {
        return "StudentUI/StudentEvents";
    }

    @GetMapping("/StudentPoints")
    public String serveSPPage() {
        return "StudentUI/StudentPoints";
    }

    @GetMapping("/StudentChat")
    public String serveSCPage() {
        return "StudentUI/StudentChat";
    }

}