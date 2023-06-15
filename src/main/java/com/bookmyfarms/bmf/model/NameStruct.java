
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
    "bathroom",
    "bedding_type",
    "main_name"
})
@Entity
public class NameStruct {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @JsonProperty("bathroom")
    private String bathroom;
    @JsonProperty("bedding_type")
    private String beddingType;
    @JsonProperty("main_name")
    private String mainName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("bathroom")
    public String getBathroom() {
        return bathroom;
    }

    @JsonProperty("bathroom")
    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }

    @JsonProperty("bedding_type")
    public String getBeddingType() {
        return beddingType;
    }

    @JsonProperty("bedding_type")
    public void setBeddingType(String beddingType) {
        this.beddingType = beddingType;
    }

    @JsonProperty("main_name")
    public String getMainName() {
        return mainName;
    }

    @JsonProperty("main_name")
    public void setMainName(String mainName) {
        this.mainName = mainName;
    }

}
