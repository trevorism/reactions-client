package com.trevorism

import com.trevorism.https.SecureHttpClient
import com.trevorism.model.TestError
import org.junit.Test

class TestErrorClientTest {

    @Test
    void testErrorClient(){
        TestErrorClient testErrorClient = new TestErrorClient([post: { x, y -> "{}" }] as SecureHttpClient)
        assert testErrorClient.addTestError(new TestError([source: "reactions-client", message: "message one", details: ["x":"y"]]))
    }


}
