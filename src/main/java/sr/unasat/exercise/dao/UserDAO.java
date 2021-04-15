package sr.unasat.exercise.dao;

import sr.unasat.exercise.entity.Exercise;
import sr.unasat.exercise.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private EntityManager entityManager;

    public UserDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public List<User> findAll(){
        List<User> exercises = new ArrayList<>();
        EntityTransaction transaction =  entityManager.getTransaction();
        try {
            transaction.begin();
            String jpql = "SELECT c FROM users c";
            TypedQuery<User> result = entityManager.createQuery(jpql, User.class);

            exercises = result.getResultList();
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
        }
        return exercises;
    }

    public User findUserByLogin(String username, String password){
        User user;
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        String jpql = "select u from users u where u.username = :username and u.password = :password";
        TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
        query.setParameter("username", username);
        query.setParameter("password", password);

        System.out.println(username);
        System.out.println(password);

        try {
            user = query.getSingleResult();
            transaction.commit();
            return user;
        }catch (Exception e){
            transaction.rollback();
            return null;
        }


    }


    public void createUser(User user){
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }


}
