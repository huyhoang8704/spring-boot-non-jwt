package com.javaweb.repository;

import com.javaweb.model.BuildingResponse;
import com.javaweb.repository.entity.BuildingEntity;

import java.util.ArrayList;
import java.util.List;

public interface BuildingRepository {
    List<BuildingEntity> findAll(String name);
    List<BuildingEntity> find(String req);
}
