package com.example.study.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
// lombok이 getter setter등 추가해줌
@AllArgsConstructor // 모든 매개변수 갖는 생성자 추
public class SearchParam {

    private String account;
    private String email;
    private int page;


    // {"account" : "", "email" : "", "page" : 0}
    // jackson lib가 json 형태로 바꿔줌


}
