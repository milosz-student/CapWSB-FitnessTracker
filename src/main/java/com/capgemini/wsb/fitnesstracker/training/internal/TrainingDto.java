package com.capgemini.wsb.fitnesstracker.training.internal;

import com.capgemini.wsb.fitnesstracker.user.api.UserDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.annotation.Nullable;

import java.time.LocalDate;
import java.util.Date;

public record TrainingDto(@Nullable Long id,
                          TrainingUser user,
                          @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS+00:00") Date startTime,
                          @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS+00:00") Date endTime,
                          double distance,
                          double averageSpeed) {
public record TrainingUser(@Nullable Long id,
                           String firstName,
                           String lastName,
                           String email){}
}
