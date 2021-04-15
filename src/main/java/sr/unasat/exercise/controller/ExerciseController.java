package sr.unasat.exercise.controller;

import sr.unasat.exercise.entity.Exercise;
import sr.unasat.exercise.service.ExerciseService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("exercise")
public class ExerciseController {
    private ExerciseService exerciseService = new ExerciseService();

    @Path("/list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Exercise> findAll() {
        return exerciseService.findAll();
    }
}
