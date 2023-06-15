
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
import jakarta.persistence.*;

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
@Entity
public class MetapolicyStruct {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private String id;
    @JsonProperty("add_fee")
    private List<String> addFee;
    @JsonProperty("children")
    private List<String> children;
    @JsonProperty("children_meal")
    @OneToMany
    private List<ChildMeal> childrenMeal;
    @JsonProperty("deposit")
    @OneToMany
    private List<Deposit> deposit;
    @JsonProperty("extra_bed")
    @OneToMany
    private List<ExtraBed> extraBed;
    @JsonProperty("internet")
    private List<String> internet;
    @JsonProperty("meal")
    @OneToMany
    private List<Meal> meal;
    @JsonProperty("no_show")
    @OneToOne
    private NoShow noShow;
    @JsonProperty("parking")
    @OneToMany
    private List<Parking> parking;
    @JsonProperty("pets")
    @OneToMany
    private List<Pet> pets;
    @JsonProperty("shuttle")
    private List<String> shuttle;
    @JsonProperty("visa")
    @OneToOne
    private Visa visa;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    @JsonProperty("add_fee")
    public List<String> getAddFee() {
        return addFee;
    }

    @JsonProperty("add_fee")
    public void setAddFee(List<String> addFee) {
        this.addFee = addFee;
    }

    @JsonProperty("children")
    public List<String> getChildren() {
        return children;
    }

    @JsonProperty("children")
    public void setChildren(List<String> children) {
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
    public List<String> getInternet() {
        return internet;
    }

    @JsonProperty("internet")
    public void setInternet(List<String> internet) {
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
    public List<String> getShuttle() {
        return shuttle;
    }

    @JsonProperty("shuttle")
    public void setShuttle(List<String> shuttle) {
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

}
