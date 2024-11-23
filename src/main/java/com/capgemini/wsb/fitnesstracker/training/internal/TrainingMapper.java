package com.capgemini.wsb.fitnesstracker.training.internal;

import com.capgemini.wsb.fitnesstracker.training.api.Training;

import org.springframework.stereotype.Component;

@Component
class TrainingMapper {
    TrainingDto toDto(Training training) {
        return new TrainingDto(
                training.getId(),
                new TrainingUser(
                        training.getUser().getId(),
                        training.getUser().getFirstName(),
                        training.getUser().getLastName(),
                        training.getUser().getEmail()
                ),
                training.getStartTime(),
                training.getEndTime(),
                training.getActivityType(),
                training.getDistance(),
                training.getAverageSpeed()
        );
    }
}
