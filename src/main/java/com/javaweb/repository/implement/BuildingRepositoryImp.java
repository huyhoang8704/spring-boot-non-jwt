package com.javaweb.repository.implement;

import com.javaweb.model.BuildingResponse;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.json.*;

@Repository
public class BuildingRepositoryImp implements BuildingRepository {
    static final String url = "jdbc:mysql://localhost:3306/estatebasic?useSSL=false&autoReconnect=true";
    static final String user = "root";
    static final String password = "080704";
    @Override
    public List<BuildingEntity> findAll(String name) {
        String sql = "select * from building b where b.name like '%" + name + "%'";
        List<BuildingEntity> list = new ArrayList<>();

        try(Connection con = DriverManager.getConnection(url, user, password)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                BuildingEntity buiding = new BuildingEntity();
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

    @Override
    public List<BuildingEntity> find(String req) {
        JSONObject jsonObject = new JSONObject(req);
        String name = jsonObject.getString("name");
        Integer floorarea = jsonObject.getInt("floorarea");
        Integer numberOfBasement = jsonObject.getInt("numberOfBasement");
        String dictrictId = jsonObject.getString("dictrictId");
        Integer level = jsonObject.getInt("level");
        String street = jsonObject.getString("street");
        String ward = jsonObject.getString("ward");
        int areafrom = jsonObject.getInt("areafrom");
        int areato = jsonObject.getInt("areato");
        int pricefrom = jsonObject.getInt("pricefrom");
        int priceto = jsonObject.getInt("priceto");
        String managername = jsonObject.getString("managername");
        String managerphonenumber = jsonObject.getString("managerphonenumber");
//        int typeid = jsonObject.getInt("typeid"); //!


        StringBuilder sql = new StringBuilder("select * from building b where 1 = 1");


        if (name != null && !name.isEmpty()) sql.append(" and b.name like '%").append(name).append("%'");
        if (street != null && !street.isEmpty()) sql.append(" and b.street like '%").append(street).append("%'");
        if (floorarea > 0) sql.append(" and b.floorarea = ").append(floorarea);
        if (numberOfBasement  > 0) sql.append(" and b.numberOfBasement = ").append(numberOfBasement);
        if (dictrictId != null && !dictrictId.isEmpty())     sql.insert(25, "INNER JOIN district d ON b.districtid = d.id and d.code = '" + dictrictId + "'");
        if (level > 0) sql.append(" and b.level = ").append(level);
        if (ward != null && !ward.isEmpty()) sql.append(" and b.ward like '%").append(ward).append("%'");
        if (areafrom > 0) sql.append(" and b.floorarea >= ").append(areafrom);
        if (areato > 0) sql.append(" and b.floorarea <= ").append(areato);
        if (pricefrom > 0) sql.append(" and b.rentprice >= ").append(pricefrom);
        if (priceto > 0) sql.append(" and b.rentprice <= ").append(priceto);
        if (managername != null && !managername.isEmpty()) sql.append(" and b.managername like '%").append(managername).append("%'");
        if (managerphonenumber != null && !managerphonenumber.isEmpty()) sql.append(" and b.managerphonenumber = ").append(managerphonenumber);

        System.out.println(sql);
        List<BuildingEntity> list = new ArrayList<>();

//        try(Connection con = DriverManager.getConnection(url, user, password)) {
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery(sql.toString());
//            while (rs.next()) {
//                BuildingEntity buiding = new BuildingEntity();
//                buiding.setNumberOfBasement(rs.getInt("numberOfBasement"));
//                buiding.setName(rs.getString("name"));
//
//
//                list.add(buiding);
//            }
//        } catch (Exception e) {
//            System.out.println("Connected Fail!");
//
//        }
//        System.out.println(list);

        return list;
    }

}
