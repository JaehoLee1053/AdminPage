package com.example.study.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderStatus {

    COMPLETE(0, "배송 완료", "배송 완료"),
    PROCEEDING(1,"배송 중", "배송 중"),
    WAITING(2,"배송 대기", "배송 대기");

    private Integer id;
    private String title;
    private String description;

}
