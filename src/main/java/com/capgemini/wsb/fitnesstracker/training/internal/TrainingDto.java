package com.capgemini.wsb.fitnesstracker.training.internal;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.annotation.Nullable;
import lombok.Getter;

import java.util.Date;

@Getter
class TrainingDto {
    @Nullable
    Long id;
    TrainingUser user;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS+00:00")
    Date startTime;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS+00:00")
    Date endTime;
    double distance;
    double averageSpeed;

    public TrainingDto(Long id, TrainingUser trainingUser, Date startTime, Date endTime, double distance, double averageSpeed) {
        this.id = id;
        this.user = trainingUser;
        this.startTime = startTime;
        this.endTime = endTime;
        this.distance = distance;
        this.averageSpeed = averageSpeed;
    }
}


