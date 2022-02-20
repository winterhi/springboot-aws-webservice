package com.jojoldu.book.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        /* 머스테치 스타터 덕분에 문자열 반환해도 앞의 경로와 뒤의 파일 확장자는 자동으로 지정됨.
        즉, src/main/resources/templates/index.mustache로 전환되어 View Resolver가 처리하게 됨. */
        return "index";
    }
}
