package com.myproject.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String Test(){

        return "TEST PAGE ACTIVE ...";
    }
}
