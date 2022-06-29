package com.padrao.padrao.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/teste")
public class TestController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public void test(){
        System.out.println("Docker Up!");
    }

}