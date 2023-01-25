package com.definex.model;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Getter
@Setter

public class Summerhouse extends Architecture {
    @Override
    public String toString() {
        return Summerhouse.class.getSimpleName()+super.toString();
    }
}
