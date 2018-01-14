package com.zmc.controller;

import com.zmc.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by asus on 18/01/14.
 */

@RequestMapping("/")
@RestController
public class IndexController {


    @Autowired
    private Book book;

    @RequestMapping("index")
    public  String index(){
        return "hello Spring boot";

    }

    @RequestMapping("book")
    public String book(){
        return "Hello Spring Boot is "+book.getName()+"作者是 "+book.getAuthor()+"价格为 "+book.getPrice();
    }
}
