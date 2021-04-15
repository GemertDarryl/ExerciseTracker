package sr.unasat.exercise.dao;

import sr.unasat.exercise.entity.Exercise;
import sr.unasat.exercise.entity.Workout;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.List;

public class WorkoutDAO {
    private EntityManager entityManager;

    public WorkoutDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Workout> findAll(){
        List<Workout> workouts = new ArrayList<>();
        EntityTransaction transaction =  entityManager.getTransaction();
        try {
            transaction.begin();
            workouts = entityManager.createQuery("SELECT c FROM workouts c").getResultList();
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
        }
        return workouts;
    }
}
