package com.studenttracker.studenttracker.controller;

import com.studenttracker.studenttracker.model.User;
import com.studenttracker.studenttracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit(@ModelAttribute("user") User user, Model model) {
        // ✅ Trim inputs to remove accidental spaces
        String username = user.getUsername().trim();
        String password = user.getPassword().trim();

        // ✅ Print inputs for debugging
        System.out.println("Entered Username: " + username);
        System.out.println("Entered Password: " + password);

        // ✅ Query DB
        User existingUser = userRepository.findByUsernameAndPassword(username, password);

        System.out.println("User Found: " + (existingUser != null ? "YES" : "NO"));

        if (existingUser != null) {
            return "welcome";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
}
