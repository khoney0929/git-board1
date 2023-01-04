package com.study.board1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BoardController {

    @GetMapping("/boardWrite")
    public String boardWrite(){

        return "boardWrite";
    }
}
