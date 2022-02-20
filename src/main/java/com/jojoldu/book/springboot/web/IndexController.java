package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("posts", postsService.findAllDesc());
        /* 머스테치 스타터 덕분에 문자열 반환해도 앞의 경로와 뒤의 파일 확장자는 자동으로 지정됨.
        즉, src/main/resources/templates/index.mustache로 전환되어 View Resolver가 처리하게 됨. */
        return "index";
    }

    // /posts/save를 호출하면 posts-save.mustache를 호출하는 메소드
    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }
}