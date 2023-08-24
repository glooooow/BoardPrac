package com.example.demo.service;

import com.example.demo.dto.AllBoardResponseDto;
import com.example.demo.dto.BoardRequestDto;
import com.example.demo.dto.BoardResponseDto;
import com.example.demo.model.Board;
import com.example.demo.repository.BoardRepository;
import com.example.demo.utils.ErrorCode;
import com.example.demo.utils.ResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public ResponseDto<List<AllBoardResponseDto>> getAllBoard() {
        List<Board> boardList = boardRepository.findAllByOrderByCreatedAtDesc();
        List<AllBoardResponseDto> allBoardlist = new ArrayList<>();
        for (Board board : boardList) {
            AllBoardResponseDto allBoardResponseDto = new AllBoardResponseDto(board);
            allBoardlist.add(allBoardResponseDto);
        }
        return ResponseDto.sucess(allBoardlist);
    }

    public ResponseDto<BoardResponseDto> createBoard(BoardRequestDto boardRequestDto) {
        Board board = new Board(boardRequestDto);
        boardRepository.save(board);
        BoardResponseDto boardResponseDto = new BoardResponseDto(board);
        return ResponseDto.sucess(boardResponseDto);
    }

    public ResponseDto<BoardResponseDto> getBoardById(Long id) {
        Board board = isPresentBoard(id);
        if(board == null) {
            return  ResponseDto.fail(ErrorCode.Not_Exist_Board);
        } else {
            BoardResponseDto boardResponseDto = new BoardResponseDto(board);
            return ResponseDto.sucess(boardResponseDto);
        }
    }

    private Board isPresentBoard(Long id) {
        Optional<Board> optionalBoard = boardRepository.findById(id);
        return optionalBoard.orElse(null);
    }
}
