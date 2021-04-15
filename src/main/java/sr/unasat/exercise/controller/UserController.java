package sr.unasat.exercise.controller;

import sr.unasat.exercise.dto.UserDTO;
import sr.unasat.exercise.entity.Exercise;
import sr.unasat.exercise.entity.User;
import sr.unasat.exercise.service.UserService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("users")

public class UserController {
    private UserService userService =  new UserService();

    @Path("")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> findAll() {
        return userService.findAll();
    }

    @Path("auth")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User login(UserDTO user){
      return  userService.authenticate(user);
    }


}
