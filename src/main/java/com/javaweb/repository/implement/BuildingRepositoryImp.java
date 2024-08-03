package com.javaweb.repository.implement;

import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


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
        StringBuilder sql = new StringBuilder("select * from building b where b.name like '%" + req + "%'");
        return List.of();
    }

}
