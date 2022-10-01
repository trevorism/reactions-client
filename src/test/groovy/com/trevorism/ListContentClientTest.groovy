package com.trevorism

import com.trevorism.https.SecureHttpClient
import com.trevorism.model.ListContent
import org.junit.Test

class ListContentClientTest {

    @Test
    void testListClient(){
        ListContentClient client = new ListContentClient([post: { x, y -> "{}" }, delete: { x -> "{}"}] as SecureHttpClient)

        assert client.addToList(new ListContent([id: 6248968090550272, item: "test2"]))
        assert client.addToList(new ListContent([id: 6248968090550272, item: "test3"]))
        assert client.deleteFromList(new ListContent([id: 6248968090550272, item: "test1"]))

    }

}
