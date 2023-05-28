package com.trevorism;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.trevorism.https.SecureHttpClient;
import com.trevorism.model.TestError;
import com.trevorism.model.response.TestErrorResponse;

public class TestErrorClient {

    public static final String TESTING_BASE_URL = "https://testing.trevorism.com/api/";
    private final SecureHttpClient client;
    private final Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").create();

    public TestErrorClient(SecureHttpClient client) {
        this.client = client;
    }

    public TestErrorResponse addTestError(TestError testError) {
        String json = gson.toJson(testError);
        String response = client.post(TESTING_BASE_URL + "error", json);
        return gson.fromJson(response, TestErrorResponse.class);
    }

}
