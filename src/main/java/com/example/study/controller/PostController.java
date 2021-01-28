package com.example.study.controller;


import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
// class 단에서는 이름 겹쳐도 무관, method는 겹치면 안 됨
public class PostController {

    // HTML <Form>
    // ajax 검색
    // http post body -> data
    //  json, xml, multipart-form / text-plain

    @PostMapping(value = "/postMethod") // procedure 인자로 타입 변경 가능 (json이 default)
    public SearchParam postMethod(@RequestBody SearchParam searchParam) {
        return searchParam;
    }

    @PutMapping
    public void put() {

    }

    @PatchMapping
    public void patch() {

    }
}
