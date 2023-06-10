
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "frequency",
    "sockets",
    "voltage"
})
public class Electricity {

    @JsonProperty("frequency")
    private List<Integer> frequency;
    @JsonProperty("sockets")
    private List<String> sockets;
    @JsonProperty("voltage")
    private List<Integer> voltage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("frequency")
    public List<Integer> getFrequency() {
        return frequency;
    }

    @JsonProperty("frequency")
    public void setFrequency(List<Integer> frequency) {
        this.frequency = frequency;
    }

    @JsonProperty("sockets")
    public List<String> getSockets() {
        return sockets;
    }

    @JsonProperty("sockets")
    public void setSockets(List<String> sockets) {
        this.sockets = sockets;
    }

    @JsonProperty("voltage")
    public List<Integer> getVoltage() {
        return voltage;
    }

    @JsonProperty("voltage")
    public void setVoltage(List<Integer> voltage) {
        this.voltage = voltage;
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
