package com.example.demo.dto;

import com.example.demo.model.Board;
import com.example.demo.utils.Timestamp;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AllBoardResponseDto extends Timestamp {
    private Long id;
    private String nickname;
    private String title;

    public AllBoardResponseDto(Board board) {
        this.id = board.getId();
        this.nickname = board.getNickname();
        this.title = board.getTitle();
        super.createdAt = board.getCreatedAt();
    }
}
