package com.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @GetMapping(value = "/login") // localhost/login
    public String login() {
        return "member/login";
    }

    @GetMapping(value = "/regist")
    public String regist() {
        return "member/regist";
    }
}
