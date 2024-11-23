package com.capgemini.wsb.fitnesstracker.training.api;

import com.capgemini.wsb.fitnesstracker.training.internal.ActivityType;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface TrainingService {

    List<Training> findAllTrainings();

    List<Training> findTrainingsByUserId(Long userId);

    List<Training> findTrainingsAfterTime(Date date);

    List<Training> findTrainingsByActivityType(ActivityType activityType);

}
