package com.javaweb.api;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import com.javaweb.Beans.BuildingDTO;
import java.io.IOException;
import java.sql.*;

@RestController
//@Controller
@RequestMapping("/api")
public class BuildingAPI {
    static final String url = "jdbc:mysql://localhost:3306/estatebasic?useSSL=false&autoReconnect=true";
    static final String user = "root";
    static final String password = "080704";

//    @GetMapping("/test") // localhost:8080/test , default method = GET
    @RequestMapping( value = "/test" , method = RequestMethod.GET)
    @ResponseBody
    public String testAPI() {
        return "success";
    }

    @GetMapping("/building")
    @ResponseBody
    public List<BuildingDTO> getBuildings(){
        String sql = "select * from building";
        List<BuildingDTO> list = new ArrayList<>();

        try(Connection con = DriverManager.getConnection(url, user, password)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                BuildingDTO buiding = new BuildingDTO();
                buiding.setNumberOfBasement(rs.getInt("numberOfBasement"));
                buiding.setName(rs.getString("name"));
                buiding.setWard(rs.getString("ward"));
                buiding.setStreet(rs.getString("street"));
                list.add(buiding);
            }
        } catch (Exception e) {
            System.out.println("Connected Fail!");

        }

        return list;
    }
}

