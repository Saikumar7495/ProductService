package com.example.product.models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Setter
@Getter
@JsonSerialize
public class Product extends BaseModel implements Serializable {

    private String name;
    private String description;
    private int price;
    private String image;

    @ManyToOne
    private Category category;
}
