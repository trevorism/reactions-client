package com.trevorism;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.trevorism.http.HttpClient;
import com.trevorism.https.SecureHttpClient;
import com.trevorism.model.Email;

public class EmailClient {

    public static final String EMAIL_BASE_URL = "https://email.action.trevorism.com/";
    private final SecureHttpClient client;
    private final Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").create();

    public EmailClient() {
        this(SecureHttpClientProvider.get());
    }

    public EmailClient(SecureHttpClient client) {
        this.client = client;
    }

    public Email sendEmail(Email email) {
        return sendEmail(email, null);
    }

    public Email sendEmail(Email email, String correlationId) {
        String json = gson.toJson(email);
        String response = client.post(EMAIL_BASE_URL + "mail", json, correlationId);
        return gson.fromJson(response, Email.class);
    }
}
