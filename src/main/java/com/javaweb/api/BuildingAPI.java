package com.javaweb.api;

import com.javaweb.Service.BuildingService;
import com.javaweb.model.BuildingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.javaweb.model.BuildingDTO;
import org.json.*;

@RestController
//@Controller
@RequestMapping("/api")
public class BuildingAPI {
    @Autowired
    private BuildingService buildingService;
    @GetMapping("/building")
    @ResponseBody
    public List<BuildingDTO> getBuildings(@RequestBody String req) {
//        JSONObject jsonObject = new JSONObject(req);
//        String name = jsonObject.getString("name");
//        System.out.println(name);
        List<BuildingResponse> list = buildingService.find(req);
        return null;
    }
}

