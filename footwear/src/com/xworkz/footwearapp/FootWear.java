package com.xworkz.footwearapp;

public class FootWear {
    private int footWearId;
    private String brandName;
    private int size;
    private String type;
    private String price;
    private String materialType;

    public void setFootWearId(int footWearId) {
        this.footWearId = footWearId;
    }

    public int getFootWearId() {
        return footWearId;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getMaterialType() {
        return materialType;
    }
}
