package com.capgemini.wsb.fitnesstracker.training.api;

import java.time.LocalDate;
import java.util.List;

public interface TrainingService {
    List<Training> findAllTrainings();
}
