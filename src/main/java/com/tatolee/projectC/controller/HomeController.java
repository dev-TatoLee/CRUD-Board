package com.tatolee.projectC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //기본페이지로 들어오면 메인페이지로 이동
    @GetMapping("/")
    public String mainPage() {
        System.out.println("mainpage");
        return "redirect:/board/main";
    }


    //메인페이지
    @GetMapping("/board/main")
    public String homePage() {
        return "board/home";
    }
}
