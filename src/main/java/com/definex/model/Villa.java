package com.definex.model;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Getter
@Setter

public class Villa extends Architecture {

    @Override
    public String toString() {
        return Villa.class.getSimpleName()+super.toString();
    }
}
