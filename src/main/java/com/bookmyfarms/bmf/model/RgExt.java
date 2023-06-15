
package com.bookmyfarms.bmf.model;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bathroom",
    "bedding",
    "capacity",
    "class",
    "club",
    "family",
    "quality",
    "sex"
})
@Entity
public class RgExt {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private String id;

    @JsonProperty("bathroom")
    private Integer bathroom;
    @JsonProperty("bedding")
    private Integer bedding;
    @JsonProperty("capacity")
    private Integer capacity;
    @JsonProperty("class")
    private Integer _class;
    @JsonProperty("club")
    private Integer club;
    @JsonProperty("family")
    private Integer family;
    @JsonProperty("quality")
    private Integer quality;
    @JsonProperty("sex")
    private Integer sex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("bathroom")
    public Integer getBathroom() {
        return bathroom;
    }

    @JsonProperty("bathroom")
    public void setBathroom(Integer bathroom) {
        this.bathroom = bathroom;
    }

    @JsonProperty("bedding")
    public Integer getBedding() {
        return bedding;
    }

    @JsonProperty("bedding")
    public void setBedding(Integer bedding) {
        this.bedding = bedding;
    }

    @JsonProperty("capacity")
    public Integer getCapacity() {
        return capacity;
    }

    @JsonProperty("capacity")
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @JsonProperty("class")
    public Integer getClass_() {
        return _class;
    }

    @JsonProperty("class")
    public void setClass_(Integer _class) {
        this._class = _class;
    }

    @JsonProperty("club")
    public Integer getClub() {
        return club;
    }

    @JsonProperty("club")
    public void setClub(Integer club) {
        this.club = club;
    }

    @JsonProperty("family")
    public Integer getFamily() {
        return family;
    }

    @JsonProperty("family")
    public void setFamily(Integer family) {
        this.family = family;
    }

    @JsonProperty("quality")
    public Integer getQuality() {
        return quality;
    }

    @JsonProperty("quality")
    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    @JsonProperty("sex")
    public Integer getSex() {
        return sex;
    }

    @JsonProperty("sex")
    public void setSex(Integer sex) {
        this.sex = sex;
    }

}
