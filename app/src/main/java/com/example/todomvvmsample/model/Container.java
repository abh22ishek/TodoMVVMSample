package com.example.todomvvmsample.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Container {

    @SerializedName("layout")
    @Expose
    private String layout;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("actions")
    @Expose
    private List<Action> actions = null;
    @SerializedName("items")
    @Expose
    private List<Item> items = null;
    @SerializedName("totalDepth")
    @Expose
    private Integer totalDepth;

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Integer getTotalDepth() {
        return totalDepth;
    }

    public void setTotalDepth(Integer totalDepth) {
        this.totalDepth = totalDepth;
    }

}