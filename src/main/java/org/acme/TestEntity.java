package org.acme;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

import java.util.List;

@MongoEntity(collection="entity")
public class TestEntity extends PanacheMongoEntity {
    public String name;
    public List<String> list;

    @Override
    public String toString() {
        return "TestEntity{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
