
package com.bookmyfarms.bmf.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.bookmyfarms.bmf.model.NameStruct;
import com.bookmyfarms.bmf.model.RgExt;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "images",
    "name",
    "name_struct",
    "rg_ext",
    "room_amenities",
    "room_group_id"
})
@Entity
public class RoomGroup {

    @JsonProperty("images")
    private List<String> images;
    @JsonProperty("name")
    private String name;
    @JsonProperty("name_struct")
    @OneToOne
    private NameStruct nameStruct;
    @JsonProperty("rg_ext")
    @OneToOne
    private RgExt rgExt;
    @JsonProperty("room_amenities")
    private List<String> roomAmenities;
    @JsonProperty("room_group_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer roomGroupId;

    @JsonProperty("images")
    public List<String> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<String> images) {
        this.images = images;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("name_struct")
    public NameStruct getNameStruct() {
        return nameStruct;
    }

    @JsonProperty("name_struct")
    public void setNameStruct(NameStruct nameStruct) {
        this.nameStruct = nameStruct;
    }

    @JsonProperty("rg_ext")
    public RgExt getRgExt() {
        return rgExt;
    }

    @JsonProperty("rg_ext")
    public void setRgExt(RgExt rgExt) {
        this.rgExt = rgExt;
    }

    @JsonProperty("room_amenities")
    public List<String> getRoomAmenities() {
        return roomAmenities;
    }

    @JsonProperty("room_amenities")
    public void setRoomAmenities(List<String> roomAmenities) {
        this.roomAmenities = roomAmenities;
    }

    @JsonProperty("room_group_id")
    public Integer getRoomGroupId() {
        return roomGroupId;
    }

    @JsonProperty("room_group_id")
    public void setRoomGroupId(Integer roomGroupId) {
        this.roomGroupId = roomGroupId;
    }

}
