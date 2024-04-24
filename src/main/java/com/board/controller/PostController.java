package com.board.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping(value = "/") // localhost로 접속
    public String index() {
        return "index";
    }

    @GetMapping(value = "/view") // localhost/view
    public String view(HttpServletRequest request, Model model) {
        return "post/view";
    }

    @GetMapping(value = "/list")
    public String list() {
        return "post/list";
    }

    @GetMapping(value = "/write") // localhost/write
    public String write() {
        return "post/write";
    }

    @GetMapping(value = "/rewrite") // localhost/rewrite
    public String rewrite(HttpServletRequest request, Model model) {
        return "post/rewrite";
    }
}
