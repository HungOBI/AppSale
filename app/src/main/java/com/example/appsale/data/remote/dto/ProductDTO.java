package com.example.appsale.data.remote.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProductDTO {

    @SerializedName("_id")
    @Expose
    private String id;
    private String name;
    private String address;
    private Integer price;
    private String img;
    private Integer quantity;
    private List<String> gallery;
    @SerializedName("date_created")
    @Expose
    private String dateCreated;
    @SerializedName("date_updated")
    @Expose
    private String dateUpdated;

    public ProductDTO() {}

    public ProductDTO(String id, String name, String address, Integer price, String img, Integer quantity, List<String> gallery, String dateCreated, String dateUpdated) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.price = price;
        this.img = img;
        this.quantity = quantity;
        this.gallery = gallery;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public List<String> getGallery() {
        return gallery;
    }

    public void setGallery(List<String> gallery) {
        this.gallery = gallery;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Override
    public String toString() {
        return "FoodDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", img='" + img + '\'' +
                ", quantity=" + quantity +
                ", gallery=" + gallery +
                ", dateCreated='" + dateCreated + '\'' +
                ", dateUpdated=" + dateUpdated +
                '}';
    }
}