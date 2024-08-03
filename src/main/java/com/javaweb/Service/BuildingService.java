package com.javaweb.Service;

import com.javaweb.model.BuildingDTO;
import com.javaweb.model.BuildingResponse;
import com.javaweb.repository.entity.BuildingEntity;

import java.util.List;

public interface BuildingService {
    List<BuildingDTO> findAll(String name);
    List<BuildingResponse> find(String req);
}
