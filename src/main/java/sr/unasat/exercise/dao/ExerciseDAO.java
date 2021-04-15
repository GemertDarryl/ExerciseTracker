package sr.unasat.exercise.dao;

import sr.unasat.exercise.entity.Exercise;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.List;

public class ExerciseDAO {
    private EntityManager entityManager;

    public ExerciseDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public List<Exercise> findAll(){
        List<Exercise> exercises = new ArrayList<>();
        EntityTransaction transaction =  entityManager.getTransaction();
        try {
            transaction.begin();
            exercises = entityManager.createQuery("SELECT c FROM exercises c").getResultList();
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
        }
        return exercises;
    }


}
