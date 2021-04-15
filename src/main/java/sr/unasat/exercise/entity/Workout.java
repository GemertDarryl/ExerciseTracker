package sr.unasat.exercise.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity(name = "workouts")
public class Workout {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToMany(mappedBy = "workout")
    List<WorkoutExercise> workoutExercises;


    public Workout(int id, String name, List<Exercise> exercises) {
        this.id = id;
        this.name = name;
    }

    public List<WorkoutExercise> getWorkoutExercises() {
        return workoutExercises;
    }

    public void setWorkoutExercises(List<WorkoutExercise> workoutExercises) {
        this.workoutExercises = workoutExercises;
    }

    public Workout() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
