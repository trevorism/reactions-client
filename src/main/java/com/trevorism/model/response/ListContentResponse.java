package com.trevorism.model.response;

import java.util.List;

public class ListContentResponse {

    private String id;
    private String trevorismListId;
    private List<String> data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTrevorismListId() {
        return trevorismListId;
    }

    public void setTrevorismListId(String trevorismListId) {
        this.trevorismListId = trevorismListId;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}
