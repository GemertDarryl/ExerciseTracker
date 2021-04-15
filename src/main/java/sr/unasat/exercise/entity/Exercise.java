package sr.unasat.exercise.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity(name = "exercises")
public class Exercise {
    @Id
    @GeneratedValue
    private Long id;
    private String name;



    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "type")

    private ExerciseTypes type;

    @OneToMany(mappedBy = "exercise")
    @JsonIgnoreProperties
    List<WorkoutExercise> ExerciseSets;

    public Exercise(Long id, String name, ExerciseTypes type) {
        this.id = id;
        this.name = name;
        this.type = type;

    }

    public Exercise() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExerciseTypes getType() {
        return type;
    }

    public void setType(ExerciseTypes type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Excercise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
