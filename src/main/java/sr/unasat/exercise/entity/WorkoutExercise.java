package sr.unasat.exercise.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name = "exercise_workout")
public class WorkoutExercise {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;

    @ManyToOne
    @JoinColumn(name = "workout_id")
    @JsonIgnore
    private Workout workout;

    private int sets;

    public WorkoutExercise() {
    }

    public WorkoutExercise(int id, Exercise exercise, Workout workout, int sets) {
        this.id = id;
        this.exercise = exercise;
        this.workout = workout;
        this.sets = sets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "WorkoutExercise{" +
                "id=" + id +
                ", exercise=" + exercise +
                ", workout=" + workout +
                ", sets=" + sets +
                '}';
    }
}
