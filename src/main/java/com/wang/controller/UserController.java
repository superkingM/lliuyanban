package com.wang.controller;

import com.wang.pojo.User;
import com.wang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public void loginUser(User user, HttpServletResponse response, HttpSession session, HttpServletRequest request) throws IOException {
        User user1 = userService.queryUserByNameAndPassword(user);
        if (user1 != null) {
            session.setAttribute(user1.getUsername(), user1);
            Cookie cookie_username = new Cookie("cookie_username", user1.getUsername());
            cookie_username.setMaxAge(60*60);
            cookie_username.setPath(request.getContextPath());
            response.addCookie(cookie_username);
        }
        response.sendRedirect("/");
    }

}
