package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

public class SendMessageController {

    @Resource
    private IMessageProvider messageProvider;
    @GetMapping(value = "/senMessage")
    public String sendMessage(){

       return messageProvider.send();
    }
}
