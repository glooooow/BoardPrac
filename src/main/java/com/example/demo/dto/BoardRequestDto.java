package com.example.demo.dto;

import com.example.demo.utils.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BoardRequestDto extends Timestamp {
    private String nickname;
    private String title;
    private String content;
}