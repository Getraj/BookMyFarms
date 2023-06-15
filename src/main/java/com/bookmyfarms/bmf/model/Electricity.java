
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
import jakarta.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "frequency",
    "sockets",
    "voltage"
})
@Entity
public class Electricity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private String id;

    @JsonProperty("frequency")
    private List<Integer> frequency;
    @JsonProperty("sockets")
    private List<String> sockets;
    @JsonProperty("voltage")
    private List<Integer> voltage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

}
