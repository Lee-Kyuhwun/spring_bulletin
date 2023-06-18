package com.example.bulletin.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/sbb")
    @ResponseBody
    public String index(){
        return "index";
    }
}
/*
* ResposeBody는 URL요청에 대한 응답으로 문자열을 리턴하라는
* 뜻이다.
* */
