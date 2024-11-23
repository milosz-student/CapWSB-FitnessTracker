package com.capgemini.wsb.fitnesstracker.training.internal;

import jakarta.annotation.Nullable;
import lombok.Getter;

@Getter
public class TrainingUser {
    @Nullable
    Long id;
    String firstName;
    String lastName;
    String email;

    public TrainingUser(Long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
