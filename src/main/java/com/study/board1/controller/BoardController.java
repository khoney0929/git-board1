package com.study.board1.controller;

import com.study.board1.entity.Board;
import com.study.board1.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/boardwrite")
    public String boardWrite(){

        return "boardwrite";
    }
    @PostMapping("/boardwritepro")
    public String boardWritePro(Board board){

        boardService.write(board);
        return "";
    }

    @GetMapping("/boardlist")
    public String boardList(Model model){

        model.addAttribute("list", boardService.boardList());

        return "boardlist";
    }

    @GetMapping("/boardview") //localhost:8080/boardview?id=1
    public String boardView(Model model, Integer id){

        model.addAttribute("board", boardService.boardView(id));


        return "boardview";
    }

    @GetMapping("/boarddelete")
    public String boardDelete(Integer id){

        boardService.boardDelete(id);

        return "redirect:/boardlist";

    }



}
