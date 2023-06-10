
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
    "availability",
    "day_period",
    "time"
})
public class NoShow {

    @JsonProperty("availability")
    private String availability;
    @JsonProperty("day_period")
    private String dayPeriod;
    @JsonProperty("time")
    private Object time;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("availability")
    public String getAvailability() {
        return availability;
    }

    @JsonProperty("availability")
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @JsonProperty("day_period")
    public String getDayPeriod() {
        return dayPeriod;
    }

    @JsonProperty("day_period")
    public void setDayPeriod(String dayPeriod) {
        this.dayPeriod = dayPeriod;
    }

    @JsonProperty("time")
    public Object getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(Object time) {
        this.time = time;
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
