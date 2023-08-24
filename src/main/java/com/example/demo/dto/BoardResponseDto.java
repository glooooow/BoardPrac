package com.example.demo.dto;

import com.example.demo.model.Board;
import com.example.demo.utils.Timestamp;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor
public class BoardResponseDto extends Timestamp {
    private Long id;
    private String nickname;
    private String title;
    private String content;

    public BoardResponseDto(Board board) {
        this.id = board.getId();
        this.nickname = board.getNickname();
        this.title = board.getTitle();
        this.content = board.getContent();
        super.createdAt = board.getCreatedAt();
    }
}
