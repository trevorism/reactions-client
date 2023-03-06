package com.trevorism;

import com.trevorism.https.DefaultSecureHttpClient;
import com.trevorism.https.SecureHttpClient;

public class SecureHttpClientProvider {

    private static SecureHttpClient DEFAULT_SECURE_HTTP_CLIENT;

    private SecureHttpClientProvider() {
    }

    public static SecureHttpClient get() {
        if (DEFAULT_SECURE_HTTP_CLIENT == null)
            DEFAULT_SECURE_HTTP_CLIENT = new DefaultSecureHttpClient();
        return DEFAULT_SECURE_HTTP_CLIENT;
    }
}
