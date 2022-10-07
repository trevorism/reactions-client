package com.trevorism

import com.trevorism.https.SecureHttpClient
import com.trevorism.model.Email
import org.junit.Test

class EmailClientTest {

    @Test
    void testEmail() {
        //EmailClient client = new EmailClient([post: { x, y, z -> "true" }] as SecureHttpClient)
        EmailClient client = new EmailClient()
        assert client.sendEmail(new Email([subject: "unit test", body: "test4", recipients: ["trevorism@gmail.com"]]))
    }
}
