package com.trevorism.model.response;

import com.trevorism.model.TestError;

public class TestErrorResponse extends TestError {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
