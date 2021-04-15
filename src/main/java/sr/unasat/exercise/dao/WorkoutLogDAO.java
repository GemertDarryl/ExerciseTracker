package sr.unasat.exercise.dao;

import javax.persistence.EntityManager;
import java.util.List;

public class WorkoutLogDAO {

    EntityManager entityManager;

    public WorkoutLogDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


}
