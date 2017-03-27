package com.example;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by replay on 2017. 3. 27..
 */

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public String aaa(){
        return "index";
    }
}
