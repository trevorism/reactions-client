package com.trevorism


import com.trevorism.https.SecureHttpClient
import com.trevorism.model.Alert
import org.junit.Test

class AlertClientTest {

    @Test
    void testAlert() {
        AlertClient client = new AlertClient([post: { x, y -> "{}" }] as SecureHttpClient)
        assert client.sendAlert(new Alert([subject: "unit test", body: "test2"]))
    }

}
