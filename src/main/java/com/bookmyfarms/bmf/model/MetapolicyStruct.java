
package com.bookmyfarms.bmf.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.bookmyfarms.bmf.model.ChildMeal;
import com.bookmyfarms.bmf.model.Deposit;
import com.bookmyfarms.bmf.model.ExtraBed;
import com.bookmyfarms.bmf.model.Meal;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "add_fee",
    "children",
    "children_meal",
    "deposit",
    "extra_bed",
    "internet",
    "meal",
    "no_show",
    "parking",
    "pets",
    "shuttle",
    "visa"
})
public class MetapolicyStruct {

    @JsonProperty("add_fee")
    private List<Object> addFee;
    @JsonProperty("children")
    private List<Object> children;
    @JsonProperty("children_meal")
    private List<ChildMeal> childrenMeal;
    @JsonProperty("deposit")
    private List<Deposit> deposit;
    @JsonProperty("extra_bed")
    private List<ExtraBed> extraBed;
    @JsonProperty("internet")
    private List<Object> internet;
    @JsonProperty("meal")
    private List<Meal> meal;
    @JsonProperty("no_show")
    private NoShow noShow;
    @JsonProperty("parking")
    private List<Parking> parking;
    @JsonProperty("pets")
    private List<Pet> pets;
    @JsonProperty("shuttle")
    private List<Object> shuttle;
    @JsonProperty("visa")
    private Visa visa;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("add_fee")
    public List<Object> getAddFee() {
        return addFee;
    }

    @JsonProperty("add_fee")
    public void setAddFee(List<Object> addFee) {
        this.addFee = addFee;
    }

    @JsonProperty("children")
    public List<Object> getChildren() {
        return children;
    }

    @JsonProperty("children")
    public void setChildren(List<Object> children) {
        this.children = children;
    }

    @JsonProperty("children_meal")
    public List<ChildMeal> getChildrenMeal() {
        return childrenMeal;
    }

    @JsonProperty("children_meal")
    public void setChildrenMeal(List<ChildMeal> childrenMeal) {
        this.childrenMeal = childrenMeal;
    }

    @JsonProperty("deposit")
    public List<Deposit> getDeposit() {
        return deposit;
    }

    @JsonProperty("deposit")
    public void setDeposit(List<Deposit> deposit) {
        this.deposit = deposit;
    }

    @JsonProperty("extra_bed")
    public List<ExtraBed> getExtraBed() {
        return extraBed;
    }

    @JsonProperty("extra_bed")
    public void setExtraBed(List<ExtraBed> extraBed) {
        this.extraBed = extraBed;
    }

    @JsonProperty("internet")
    public List<Object> getInternet() {
        return internet;
    }

    @JsonProperty("internet")
    public void setInternet(List<Object> internet) {
        this.internet = internet;
    }

    @JsonProperty("meal")
    public List<Meal> getMeal() {
        return meal;
    }

    @JsonProperty("meal")
    public void setMeal(List<Meal> meal) {
        this.meal = meal;
    }

    @JsonProperty("no_show")
    public NoShow getNoShow() {
        return noShow;
    }

    @JsonProperty("no_show")
    public void setNoShow(NoShow noShow) {
        this.noShow = noShow;
    }

    @JsonProperty("parking")
    public List<Parking> getParking() {
        return parking;
    }

    @JsonProperty("parking")
    public void setParking(List<Parking> parking) {
        this.parking = parking;
    }

    @JsonProperty("pets")
    public List<Pet> getPets() {
        return pets;
    }

    @JsonProperty("pets")
    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    @JsonProperty("shuttle")
    public List<Object> getShuttle() {
        return shuttle;
    }

    @JsonProperty("shuttle")
    public void setShuttle(List<Object> shuttle) {
        this.shuttle = shuttle;
    }

    @JsonProperty("visa")
    public Visa getVisa() {
        return visa;
    }

    @JsonProperty("visa")
    public void setVisa(Visa visa) {
        this.visa = visa;
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
