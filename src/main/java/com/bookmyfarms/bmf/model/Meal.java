
package com.bookmyfarms.bmf.model;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "currency",
    "inclusion",
    "meal_type",
    "price"
})
@Entity
public class Meal {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @JsonProperty("currency")
    private String currency;
    @JsonProperty("inclusion")
    private String inclusion;
    @JsonProperty("meal_type")
    private String mealType;
    @JsonProperty("price")
    private String price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("inclusion")
    public String getInclusion() {
        return inclusion;
    }

    @JsonProperty("inclusion")
    public void setInclusion(String inclusion) {
        this.inclusion = inclusion;
    }

    @JsonProperty("meal_type")
    public String getMealType() {
        return mealType;
    }

    @JsonProperty("meal_type")
    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }
}
