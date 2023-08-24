package com.example.demo.utils;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

@Getter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ErrorCode {
    Can_not_Write("Can_not_Write", "예기치 못한 오류로 작성에 실패했습니다."),
    Invalid_Error("Invalid_Error", "알 수 없는 에러"),
    Feature_Not_Exist("Feature_not_exist", "해당 기능은 준비 중 입니다."),
    No_Authority("No_Authority", "삭제 기능은 관리자만 수행 가능합니다."),
    Not_Exist_Board("Not_Exist_Board", "존재하지 않는 게시물 입니다.");

    private final String code;
    private final String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
