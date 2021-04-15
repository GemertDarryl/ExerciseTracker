package sr.unasat.exercise.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "workout_log")
public class WorkoutLog {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "started_at")
    private Date startedAt;

    @Column(name = "ended_at")
    private Date endedAt;

    @ManyToOne
    @JoinColumn(name = "workout_id", nullable = false)
    @JsonIgnoreProperties
    private Workout workout;

    private int set;
    private double weight;

    public WorkoutLog(int id, Date startedAt, Date endedAt, Workout workout) {
        this.id = id;
        this.startedAt = startedAt;
        this.endedAt = endedAt;
        this.workout = workout;
    }

    public WorkoutLog() {
    }

    public int getSet() {
        return set;
    }

    public void setSet(int set) {
        this.set = set;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    public Date getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(Date endedAt) {
        this.endedAt = endedAt;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }
}
