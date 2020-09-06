package test.app.course;

import com.fasterxml.jackson.annotation.JsonIgnore;
import test.app.coursematerial.CourseMaterial;

import javax.persistence.*;

@Entity(name = "courses")
@Table(schema = "mn_oracle")
public class Course {

    @Id
    private Long id;

    private String title;

    @JsonIgnore
    @OneToOne(mappedBy = "course", fetch = FetchType.LAZY)
    private CourseMaterial material;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CourseMaterial getMaterial() {
        return material;
    }

    public void setMaterial(CourseMaterial material) {
        this.material = material;
    }
}
