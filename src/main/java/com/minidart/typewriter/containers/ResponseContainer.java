package com.minidart.typewriter.containers;

public class ResponseContainer {
    private String status;

    public ResponseContainer(String status) {
        this.status = status;
    }
    public ResponseContainer(){

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
