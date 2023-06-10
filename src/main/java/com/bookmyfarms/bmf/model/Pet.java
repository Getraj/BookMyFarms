
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
    "currency",
    "inclusion",
    "pets_type",
    "price",
    "price_unit"
})
public class Pet {

    @JsonProperty("currency")
    private String currency;
    @JsonProperty("inclusion")
    private String inclusion;
    @JsonProperty("pets_type")
    private String petsType;
    @JsonProperty("price")
    private String price;
    @JsonProperty("price_unit")
    private String priceUnit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

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

    @JsonProperty("pets_type")
    public String getPetsType() {
        return petsType;
    }

    @JsonProperty("pets_type")
    public void setPetsType(String petsType) {
        this.petsType = petsType;
    }

    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    @JsonProperty("price_unit")
    public String getPriceUnit() {
        return priceUnit;
    }

    @JsonProperty("price_unit")
    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
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
