package com.javaweb.repository.entity;

public class BuildingEntity {
    private int numberOfBasement;
    private String name;
    private String ward;
    private String street;

    public int getNumberOfBasement() {
        return numberOfBasement;
    }
    public void setNumberOfBasement(int numberOfBasement) {
        this.numberOfBasement = numberOfBasement;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getWard() {
        return ward;
    }
    public void setWard(String ward) {
        this.ward = ward;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
}
