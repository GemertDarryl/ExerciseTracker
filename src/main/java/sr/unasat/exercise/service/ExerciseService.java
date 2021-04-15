package sr.unasat.exercise.service;

import config.JPAConfig;
import sr.unasat.exercise.dao.ExerciseDAO;
import sr.unasat.exercise.entity.Book;
import sr.unasat.exercise.entity.Exercise;

import java.util.ArrayList;
import java.util.List;

public class ExerciseService {

    private ExerciseDAO exerciseDAO = new ExerciseDAO(JPAConfig.getEntityManager());


    public List<Exercise> findAll() {
        return exerciseDAO.findAll();
    }


}

