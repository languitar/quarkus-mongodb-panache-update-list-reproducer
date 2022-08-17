package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.LinkedList;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        TestEntity entity = new TestEntity();
        entity.name = "test";
        entity.persist();

        LinkedList<String> newListEntries = new LinkedList<>();
        newListEntries.add("first entry");
        newListEntries.add("second entry");

        TestEntity.update("list = ?1", newListEntries).where("_id", entity.id);

        return "Hello from RESTEasy Reactive " + TestEntity.findAll().firstResult();
    }
}
