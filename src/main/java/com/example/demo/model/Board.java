package com.example.demo.model;

import com.example.demo.dto.BoardRequestDto;
import com.example.demo.utils.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Board extends Timestamp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    public Board(BoardRequestDto boardRequestDto) {
        this.nickname = boardRequestDto.getNickname();
        this.title = boardRequestDto.getTitle();
        this.content = boardRequestDto.getContent();
    }
}
