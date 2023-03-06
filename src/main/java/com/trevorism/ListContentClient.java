package com.trevorism;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.trevorism.http.HttpClient;
import com.trevorism.https.SecureHttpClient;
import com.trevorism.model.ListContent;
import com.trevorism.model.response.ListContentResponse;

public class ListContentClient {

    public static final String BASE_URL = "https://list.data.trevorism.com/api/";
    private final SecureHttpClient client;
    private final Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").create();

    public ListContentClient() {
        this(SecureHttpClientProvider.get());
    }

    public ListContentClient(SecureHttpClient client) {
        this.client = client;
    }

    public ListContentResponse addToList(ListContent listContent) {
        String response = client.post(BASE_URL + listContent.getId() + "/content", listContent.getItem());
        return gson.fromJson(response, ListContentResponse.class);
    }

    public ListContentResponse deleteFromList(ListContent listContent) {
        String response = client.delete(BASE_URL + listContent.getId() + "/content/" + listContent.getItem());
        return gson.fromJson(response, ListContentResponse.class);
    }

}
