package com.example.finalproj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

    @GetMapping("/")
    public String serveLoginPage() {
        return "Login.html";
    }

    @GetMapping("/Signup")
    public String serveSignupPage() {
        return "Signup.html";
    }

    @GetMapping("/index")
    public String serveIndexPage() {
        return "index.html";
    }

    @GetMapping("/Groups")
    public String serveGroupPage() {
        return "Groups.html";
    }

    @GetMapping("/Students")
    public String serveStudentsPage() {
        return "Students.html";
    }

    @GetMapping("/Events")
    public String serveEventsPage() {
        return "Events.html";
    }

    @GetMapping("/Chat")
    public String serveChatPage() {
        return "Chat.html";
    }

    @GetMapping("/Dashboard")
    public String serveDashboardPage() {
        return "Dashboard.html";
    }

    @GetMapping("/StudentGroup")
    public String serveSGPage() {
        return "StudentGroup.html";
    }

    @GetMapping("/StudentEvents")
    public String serveSEPage() {
        return "StudentEvents.html";
    }

    @GetMapping("/StudentPoints")
    public String serveSPPage() {
        return "StudentPoints.html";
    }

    @GetMapping("/StudentChat")
    public String serveSCPage() {
        return "StudentChat.html";
    }

}