package com.example.appsale.data.remote.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CartDTO {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("products")
    @Expose
    private List<ProductDTO> productDTOS;
    @SerializedName("id_user")
    @Expose
    private String idUser;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("date_created")
    @Expose
    private String dateCreated;

    public CartDTO() {}

    public CartDTO(String id, List<ProductDTO> productDTOS, String idUser, Integer price, String dateCreated) {
        this.id = id;
        this.productDTOS = productDTOS;
        this.idUser = idUser;
        this.price = price;
        this.dateCreated = dateCreated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ProductDTO> getProductDTOS() {
        return productDTOS;
    }

    public void setProductDTOS(List<ProductDTO> productDTOS) {
        this.productDTOS = productDTOS;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "CartDTO{" +
                "id='" + id + '\'' +
                ", productDTOS=" + productDTOS +
                ", idUser='" + idUser + '\'' +
                ", price=" + price +
                ", dateCreated='" + dateCreated + '\'' +
                '}';
    }
}