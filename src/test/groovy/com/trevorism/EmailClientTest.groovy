package com.trevorism

import com.trevorism.https.SecureHttpClient
import com.trevorism.model.Email
import org.junit.Test

class EmailClientTest {

    @Test
    void testEmail() {
        EmailClient client = new EmailClient([post: { x, y, z -> "{}" }] as SecureHttpClient)
        assert client.sendEmail(new Email([subject: "unit test", body: "test4", recipients: ["trevorism@gmail.com"]]))
    }
}
