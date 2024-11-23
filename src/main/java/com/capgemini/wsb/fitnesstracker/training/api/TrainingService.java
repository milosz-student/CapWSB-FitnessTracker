package com.capgemini.wsb.fitnesstracker.training.api;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface TrainingService {

    List<Training> findAllTrainings();

    List<Training> findTrainingsByUserId(Long userId);

    List<Training> findTrainingsAfterTime(Date date);

}
