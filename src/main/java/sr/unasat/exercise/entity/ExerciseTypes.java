package sr.unasat.exercise.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity(name = "exercise_types")
public class ExerciseTypes {

    @GeneratedValue
    @Id
    private int id;
    private String name;

    public ExerciseTypes(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ExerciseTypes() {
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

    @Override
    public String toString() {
        return "ExerciseTypes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
