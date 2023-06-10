
package com.bookmyfarms.bmf.model;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "age_end",
    "age_start",
    "currency",
    "inclusion",
    "meal_type",
    "price"
})
public class ChildMeal {

    @JsonProperty("age_end")
    private Integer ageEnd;
    @JsonProperty("age_start")
    private Integer ageStart;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("inclusion")
    private String inclusion;
    @JsonProperty("meal_type")
    private String mealType;
    @JsonProperty("price")
    private String price;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("age_end")
    public Integer getAgeEnd() {
        return ageEnd;
    }

    @JsonProperty("age_end")
    public void setAgeEnd(Integer ageEnd) {
        this.ageEnd = ageEnd;
    }

    @JsonProperty("age_start")
    public Integer getAgeStart() {
        return ageStart;
    }

    @JsonProperty("age_start")
    public void setAgeStart(Integer ageStart) {
        this.ageStart = ageStart;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
