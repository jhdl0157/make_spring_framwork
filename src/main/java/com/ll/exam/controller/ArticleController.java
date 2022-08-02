package com.ll.exam.controller;


import com.ll.exam.annotation.Controller;
import com.ll.exam.annotation.GetMapping;

@Controller //  Article 컨트롤러가 컨트롤러 이다.
public class ArticleController {
    @GetMapping("/usr/article/list")
    public void showList(){

    }
}
