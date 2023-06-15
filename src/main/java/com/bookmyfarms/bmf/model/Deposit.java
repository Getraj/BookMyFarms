
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
    "availability",
    "currency",
    "deposit_type",
    "payment_type",
    "price",
    "price_unit",
    "pricing_method"
})
@Entity
public class Deposit {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @JsonProperty("availability")
    private String availability;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("deposit_type")
    private String depositType;
    @JsonProperty("payment_type")
    private String paymentType;
    @JsonProperty("price")
    private String price;
    @JsonProperty("price_unit")
    private String priceUnit;
    @JsonProperty("pricing_method")
    private String pricingMethod;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("availability")
    public String getAvailability() {
        return availability;
    }

    @JsonProperty("availability")
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("deposit_type")
    public String getDepositType() {
        return depositType;
    }

    @JsonProperty("deposit_type")
    public void setDepositType(String depositType) {
        this.depositType = depositType;
    }

    @JsonProperty("payment_type")
    public String getPaymentType() {
        return paymentType;
    }

    @JsonProperty("payment_type")
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
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

    @JsonProperty("pricing_method")
    public String getPricingMethod() {
        return pricingMethod;
    }

    @JsonProperty("pricing_method")
    public void setPricingMethod(String pricingMethod) {
        this.pricingMethod = pricingMethod;
    }
}
