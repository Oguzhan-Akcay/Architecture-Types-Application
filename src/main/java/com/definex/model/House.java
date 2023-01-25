package com.definex.model;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Getter
@Setter

public class House extends Architecture {

    @Override
    public String toString() {
        return House.class.getSimpleName()+super.toString();
    }
}
