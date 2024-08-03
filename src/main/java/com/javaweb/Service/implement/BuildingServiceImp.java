package com.javaweb.Service.implement;

import com.javaweb.Service.BuildingService;
import com.javaweb.model.BuildingDTO;
import com.javaweb.model.BuildingResponse;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BuildingServiceImp implements BuildingService {
    @Autowired
    private BuildingRepository buildingRepository;
    @Override
    public List<BuildingDTO> findAll(String name) {
        List<BuildingEntity> list = buildingRepository.findAll(name);
        List<BuildingDTO> result = new ArrayList<BuildingDTO>();
        for(BuildingEntity item : list){
            BuildingDTO buildingDTO = new BuildingDTO();
            buildingDTO.setNumberOfBasement(item.getNumberOfBasement());
            buildingDTO.setName(item.getName());
            buildingDTO.setAddress(item.getStreet() + " " + item.getWard());
            result.add(buildingDTO);
        }
        return result ;
    }

    @Override
    public List<BuildingResponse> find(String req) {
        return List.of();
    }

}
