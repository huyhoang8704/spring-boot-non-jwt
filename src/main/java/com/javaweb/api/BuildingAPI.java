package com.javaweb.api;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@RestController
//@Controller
public class BuildingAPI {

//    @GetMapping("/test") // localhost:8080/test , default method = GET
    @RequestMapping( value = "/test" , method = RequestMethod.GET)
    @ResponseBody
    public String testAPI() {
        return "success";
    }
}

