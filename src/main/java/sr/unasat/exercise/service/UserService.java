package sr.unasat.exercise.service;

import config.JPAConfig;
import sr.unasat.exercise.dao.UserDAO;
import sr.unasat.exercise.dto.UserDTO;
import sr.unasat.exercise.entity.User;

import java.util.List;

public class UserService {

    private UserDAO userDAO = new UserDAO(JPAConfig.getEntityManager());


    public List<User> findAll() {
        return userDAO.findAll();
    }

    public User authenticate(UserDTO userDTO){
        User user =   userDAO.findUserByLogin(userDTO.getUsername(), userDTO.getPassword());

        return user;
    }


}
