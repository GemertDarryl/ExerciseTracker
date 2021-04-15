package sr.unasat.exercise.controller;

import sr.unasat.exercise.entity.User;
import sr.unasat.exercise.entity.Workout;
import sr.unasat.exercise.service.WorkoutService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("workouts")
public class WorkoutController {
    private WorkoutService workoutService = new WorkoutService();

    @Path("/")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Workout> findAll() {
        return workoutService.findAll();
    }
}
