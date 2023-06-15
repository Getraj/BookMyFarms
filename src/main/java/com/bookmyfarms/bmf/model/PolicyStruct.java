
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
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "paragraphs",
    "title"
})
@Entity
public class PolicyStruct {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @JsonProperty("paragraphs")
    private List<String> paragraphs;
    @JsonProperty("title")
    private String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("paragraphs")
    public List<String> getParagraphs() {
        return paragraphs;
    }

    @JsonProperty("paragraphs")
    public void setParagraphs(List<String> paragraphs) {
        this.paragraphs = paragraphs;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

}
