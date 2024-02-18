package com.tatolee.projectC.controller;

import com.tatolee.projectC.dto.BoardDTO;
import com.tatolee.projectC.repository.BoardRepository;
import com.tatolee.projectC.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/free-board")
public class FreeBoardController {

    private final BoardService boardService;
    @GetMapping("/")
    public String freeBoardList(Model model) {
        log.info("free-board");
        List<BoardDTO> boardDTOList = new ArrayList<>();

        return "board/free-board";
    }

    @GetMapping("/write")
    public String writeForm() {
        return "board/write-form";
    }

    @PostMapping("/write")
    public String write(@ModelAttribute BoardDTO boardDTO, Model model) {
        boardService.save(boardDTO);
        boardDTO= boardService.findById(boardDTO.getId());
        model.addAttribute(boardDTO);
        return "board/free-board";
    }
}
