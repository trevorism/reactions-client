package com.trevorism.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TestError {

    private String source;
    private String message;
    private Date date = new Date();
    private Map<String,String> details = new HashMap<>();

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<String, String> getDetails() {
        return details;
    }

    public void setDetails(Map<String, String> details) {
        this.details = details;
    }
}
