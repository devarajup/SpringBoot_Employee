package com.cjss.deva.Employee.rest;

import com.cjss.deva.Employee.model.MessageModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class rest {
    @GetMapping("/get")
    public String getMsg() {
        return "get_requesting";
    }
    @PostMapping("/post")
    public static MessageModel postMsg(@RequestBody MessageModel message){

        return  message;
    }
}
