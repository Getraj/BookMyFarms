
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
    "visa_support"
})
@Entity
public class Visa {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @JsonProperty("visa_support")
    private String visaSupport;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("visa_support")
    public String getVisaSupport() {
        return visaSupport;
    }

    @JsonProperty("visa_support")
    public void setVisaSupport(String visaSupport) {
        this.visaSupport = visaSupport;
    }

}
