package com.app.todo.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.util.List;

/**
 * Created by mohitesh on 03/11/16.
 */

@JsonObject
public class TaskResponse {

    @JsonField(name = "data")
    public List<Data> data;

    @JsonObject
    public static class Data {
        @JsonField(name = "id")
        public int id;
        @JsonField(name = "name")
        public String name;
        @JsonField(name = "state")
        public int state;
    }
}
