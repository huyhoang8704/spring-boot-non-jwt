package com.javaweb.api;

import com.javaweb.Service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.javaweb.model.BuildingDTO;

@RestController
//@Controller
@RequestMapping("/api")
public class BuildingAPI {
    @Autowired
    private BuildingService buildingService;
    @GetMapping("/building")
    @ResponseBody
    public List<BuildingDTO> getBuildings(@RequestParam(value = "name" , required = false) String name,
                                          @RequestParam(value = "typeCode" , required = false) List<String> typeCode) {

        List<BuildingDTO> list = buildingService.findAll(name);
        return list;
    }
}

