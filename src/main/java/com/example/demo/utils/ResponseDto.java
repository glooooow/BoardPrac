package com.example.demo.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto<T> {

    private boolean success;
    private T data;
    private ErrorCode error;
    public static <T> ResponseDto<T> sucess(T data) {
        return  new ResponseDto<>(true, data, null);
    }

    public static <T> ResponseDto<T> fail(ErrorCode code) {
        return new ResponseDto<>(false, null, code);
    }

}