package test.app.student;

import com.fasterxml.jackson.annotation.JsonIgnore;
import test.app.course.Course;

import javax.persistence.*;
import java.util.List;

@Entity(name = "students")
@Table(schema = "mn_oracle")
public class Student {

   @Id
   @Column(name = "ID")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String firstName;

   private String lastName;

   @JsonIgnore
   @ManyToMany(mappedBy = "students", fetch = FetchType.LAZY)
   private List<Course> courses;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public List<Course> getCourses() {
      return courses;
   }

   public void setCourses(List<Course> courses) {
      this.courses = courses;
   }
}
