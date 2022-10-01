package com.trevorism;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;
import com.trevorism.https.DefaultSecureHttpClient;
import com.trevorism.https.SecureHttpClient;
import com.trevorism.model.Alert;
import com.trevorism.model.response.AlertResponse;

import java.util.Date;

public class AlertClient {

    public static final String ALERT_BASE_URL = "https://alert.datastore.trevorism.com/";
    private final SecureHttpClient client;
    private final Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").create();

    public AlertClient() {
        this(new DefaultSecureHttpClient());
    }

    public AlertClient(SecureHttpClient client) {
        this.client = client;
    }

    public AlertResponse sendAlert(Alert alert) {
        return sendAlert(alert, null);
    }

    public AlertResponse sendAlert(Alert alert, String correlationId) {
        String json = gson.toJson(alert);
        String response = client.post(ALERT_BASE_URL + "alert", json, correlationId);
        return gson.fromJson(response, AlertResponse.class);
    }
}
