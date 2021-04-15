package sr.unasat.exercise.service;

import config.JPAConfig;
import sr.unasat.exercise.dao.WorkoutDAO;
import sr.unasat.exercise.entity.User;
import sr.unasat.exercise.entity.Workout;

import java.util.List;

public class WorkoutService {

    private WorkoutDAO workoutDAO = new WorkoutDAO(JPAConfig.getEntityManager());

    public List<Workout> findAll() {
        return workoutDAO.findAll();
    }

}
