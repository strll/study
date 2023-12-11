package com.htu.ssm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Test {
    @RequestMapping("/test")
    public Map test1(){
        Map map = new HashMap<String,String>();
        map.put("test","你好");
        return map;
    }
}
