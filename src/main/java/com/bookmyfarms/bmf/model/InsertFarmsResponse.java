package com.bookmyfarms.bmf.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InsertFarmsResponse {

    @JsonProperty("data")
    private Data data;

    @JsonProperty("error")
    private Object error;

    @JsonProperty("status")
    private String status;

    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

    @JsonProperty("error")
    public Object getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(Object error) {
        this.error = error;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }
}
