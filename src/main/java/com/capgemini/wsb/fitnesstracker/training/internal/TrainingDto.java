package com.capgemini.wsb.fitnesstracker.training.internal;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.annotation.Nullable;
import lombok.Getter;

import java.util.Date;

@Getter
class TrainingDto {
    @Nullable
    private Long id;
    private TrainingUser user;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS+00:00")
    private Date startTime;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS+00:00")
    private Date endTime;
    private ActivityType activityType;
    private double distance;
    private double averageSpeed;

    public TrainingDto(Long id, TrainingUser trainingUser, Date startTime, Date endTime, ActivityType activityType, double distance, double averageSpeed) {
        this.id = id;
        this.user = trainingUser;
        this.startTime = startTime;
        this.endTime = endTime;
        this.activityType = activityType;
        this.distance = distance;
        this.averageSpeed = averageSpeed;
    }
}


