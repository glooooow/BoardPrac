package com.example.demo.controller;

import com.example.demo.dto.AllBoardResponseDto;
import com.example.demo.dto.BoardRequestDto;
import com.example.demo.dto.BoardResponseDto;
import com.example.demo.service.BoardService;
import com.example.demo.utils.ResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/board") @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ResponseDto<List<AllBoardResponseDto>> getAllBoard() {
        return boardService.getAllBoard();
    }

    @PostMapping(value = "/board") @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ResponseDto<BoardResponseDto> createBoard(@RequestBody BoardRequestDto boardRequestDto) {
        return boardService.createBoard(boardRequestDto);
    }

    @GetMapping("/board/{id}") @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ResponseDto<BoardResponseDto> getBoardById(@PathVariable Long id) {
        return boardService.getBoardById(id);
    }
}
