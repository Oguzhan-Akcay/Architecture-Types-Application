package com.definex.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
@SuperBuilder
@Data

public abstract class Architecture {
    @Override
    public String toString() {
        return
                "{" + "name=" + name +
                        ", price=" + price +
                        ", area=" + area +
                        ", room='" + room + '\'' +
                        '}';
    }

    private String name;
    private double price;
    private int area;
    private String room;
}