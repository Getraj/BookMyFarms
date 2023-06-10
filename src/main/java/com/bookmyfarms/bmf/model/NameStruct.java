
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
    "bathroom",
    "bedding_type",
    "main_name"
})
public class NameStruct {

    @JsonProperty("bathroom")
    private Object bathroom;
    @JsonProperty("bedding_type")
    private Object beddingType;
    @JsonProperty("main_name")
    private String mainName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("bathroom")
    public Object getBathroom() {
        return bathroom;
    }

    @JsonProperty("bathroom")
    public void setBathroom(Object bathroom) {
        this.bathroom = bathroom;
    }

    @JsonProperty("bedding_type")
    public Object getBeddingType() {
        return beddingType;
    }

    @JsonProperty("bedding_type")
    public void setBeddingType(Object beddingType) {
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
