
package com.bookmyfarms.bmf.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "amenities",
    "group_name"
})
@Entity
public class AmenityGroup {

    @JsonProperty("amenities")
    private List<String> amenities;
    @JsonProperty("group_name")
    private String groupName;

    @Id
    @JsonProperty("group_Id")
    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @JsonProperty("amenities")
    public List<String> getAmenities() {
        return amenities;
    }

    @JsonProperty("amenities")
    public void setAmenities(List<String> amenities) {
        this.amenities = amenities;
    }

    @JsonProperty("group_name")
    public String getGroupName() {
        return groupName;
    }

    @JsonProperty("group_name")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

}
