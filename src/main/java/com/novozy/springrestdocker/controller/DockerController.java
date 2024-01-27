package com.novozy.springrestdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping(value = "get/{name}")
    public String getName(@PathVariable("name") String name){
        return "Welcome to Novozy : " + name;
    }
}
