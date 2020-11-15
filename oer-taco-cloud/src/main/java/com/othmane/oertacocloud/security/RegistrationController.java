package com.othmane.oertacocloud.security;

import com.othmane.oertacocloud.repositories.TUserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegistrationController {
    private TUserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public RegistrationController(TUserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping
    public String registerForm() {
        System.out.println("get register");
        return "registration";
    }

    @PostMapping
    public String processRegistration(RegistrationForm form) {
        System.out.println("post register");
        userRepository.save(form.toUser(passwordEncoder));
        System.out.println("user saved : " + form.getUsername());
        return "redirect:/login";
    }
}
