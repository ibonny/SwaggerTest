package com.example.demo;

import io.swagger.annotations.ApiModelProperty;

public class ResponseClass {
    @ApiModelProperty(notes = "The response to return", name = "response", required = true, value = "test response")
    private String response;

    public ResponseClass() {

    }

    public ResponseClass(String r) {
        this.response = r;
    }

    public String getResponse() {
        return this.response;
    }

    public void setResponse(String r) {
        this.response = r;
    }
}