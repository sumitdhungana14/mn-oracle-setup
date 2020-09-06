package test.app.course;

import test.app.coursematerial.CourseMaterial;

import javax.persistence.*;

@Entity(name = "courses")
@Table(schema = "mn_oracle")
public class Course {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @OneToOne(mappedBy = "course")
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
