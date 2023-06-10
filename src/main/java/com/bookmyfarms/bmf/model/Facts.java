
package com.bookmyfarms.bmf.model;

import java.util.LinkedHashMap;
import java.util.Map;

import com.bookmyfarms.bmf.model.Electricity;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "electricity",
    "floors_number",
    "rooms_number",
    "year_built",
    "year_renovated"
})
public class Facts {

    @JsonProperty("electricity")
    private Electricity electricity;
    @JsonProperty("floors_number")
    private Integer floorsNumber;
    @JsonProperty("rooms_number")
    private Integer roomsNumber;
    @JsonProperty("year_built")
    private Integer yearBuilt;
    @JsonProperty("year_renovated")
    private Integer yearRenovated;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("electricity")
    public Electricity getElectricity() {
        return electricity;
    }

    @JsonProperty("electricity")
    public void setElectricity(Electricity electricity) {
        this.electricity = electricity;
    }

    @JsonProperty("floors_number")
    public Integer getFloorsNumber() {
        return floorsNumber;
    }

    @JsonProperty("floors_number")
    public void setFloorsNumber(Integer floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    @JsonProperty("rooms_number")
    public Integer getRoomsNumber() {
        return roomsNumber;
    }

    @JsonProperty("rooms_number")
    public void setRoomsNumber(Integer roomsNumber) {
        this.roomsNumber = roomsNumber;
    }

    @JsonProperty("year_built")
    public Integer getYearBuilt() {
        return yearBuilt;
    }

    @JsonProperty("year_built")
    public void setYearBuilt(Integer yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    @JsonProperty("year_renovated")
    public Integer getYearRenovated() {
        return yearRenovated;
    }

    @JsonProperty("year_renovated")
    public void setYearRenovated(Integer yearRenovated) {
        this.yearRenovated = yearRenovated;
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
