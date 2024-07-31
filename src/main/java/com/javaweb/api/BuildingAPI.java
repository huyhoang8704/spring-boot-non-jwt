package com.javaweb.api;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;
import com.javaweb.Beans.BuildingDTO;

@RestController
//@Controller
@RequestMapping("/api")
public class BuildingAPI {

//    @GetMapping("/test") // localhost:8080/test , default method = GET
    @RequestMapping( value = "/test" , method = RequestMethod.GET)
    @ResponseBody
    public String testAPI() {
        return "success";
    }

    @GetMapping("/building")
    @ResponseBody
    public List<BuildingDTO> getBuildings(){
        private String url = "jdbc:mysql://localhost:3306/javaweb";
        private String username = "root";
        private String password = "123456";

        return null;
    }
}

