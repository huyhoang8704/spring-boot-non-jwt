package com.javaweb.model;

public class BuildingResponse {
    private String name;
    private String address;
    private int numberOfBasement;
    private int managername;
    private String managerphonenumber;
    private int floorarea;
    private int rentprice;
    private  int rentpricedescription;


    public int getRentprice() {
        return rentprice;
    }
    public void setRentprice(int rentprice) {
        this.rentprice = rentprice;
    }
    public int getRentpricedescription() {
        return rentpricedescription;
    }
    public void setRentpricedescription(int rentpricedescription) {
        this.rentpricedescription = rentpricedescription;
    }

    public int getFloorarea() {
        return floorarea;
    }
    public void setFloorarea(int floorarea) {
        this.floorarea = floorarea;
    }

    public String getManagerphonenumber() {
        return managerphonenumber;
    }
    public void setManagerphonenumber(String managerphonenumber) {
        this.managerphonenumber = managerphonenumber;
    }

    public int managername() {
        return managername;
    }
    public void managername(int staffid) {
        this.managername = staffid;
    }

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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

}
