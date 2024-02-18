package com.tatolee.projectC.service;

import com.tatolee.projectC.dto.BoardDTO;
import com.tatolee.projectC.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO) {

    }

    public BoardDTO findById(Long id) {
        return null;
    }
}
