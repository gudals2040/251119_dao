package kr.java.dao.controller;

import kr.java.dao.model.dto.UserAccountDTO;
import kr.java.dao.service.UserAccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping // login, signup...
public class AuthController {
    private final UserAccountService service;

    public AuthController(UserAccountService service) {
        this.service = service;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute UserAccountDTO dto) {
        service.signup(dto);
        return "redirect:/";
    }

    // TODO : logout, withdraw, edit...
}
