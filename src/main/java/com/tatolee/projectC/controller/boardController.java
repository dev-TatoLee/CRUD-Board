package com.tatolee.projectC.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class boardController {

    @GetMapping("/")
    public String mainPage() {
        return "redirect:/board/main";
    }

    @GetMapping("/board/main")
    public String homePage() {
        return "board/home";
    }

    @GetMapping("/board/freeboard")
    public String freeView() {
        log.info("free-board");
        return "board/freeboard";
    }
}
