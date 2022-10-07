package com.trevorism;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.trevorism.https.DefaultSecureHttpClient;
import com.trevorism.https.SecureHttpClient;
import com.trevorism.model.Alert;
import com.trevorism.model.Email;

public class AlertClient {

    public static final String ALERT_BASE_URL = "https://alert.action.trevorism.com/";
    private final SecureHttpClient client;
    private final Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").create();

    public AlertClient() {
        this(new DefaultSecureHttpClient());
    }

    public AlertClient(SecureHttpClient client) {
        this.client = client;
    }

    public Email sendAlert(Alert alert) {
        return sendAlert(alert, null);
    }

    public Email sendAlert(Alert alert, String correlationId) {
        String json = gson.toJson(alert);
        String response = client.post(ALERT_BASE_URL + "alert", json, correlationId);
        return gson.fromJson(response, Email.class);
    }
}
