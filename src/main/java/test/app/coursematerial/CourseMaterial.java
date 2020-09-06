package test.app.coursematerial;

import test.app.course.Course;

import javax.persistence.*;

@Entity(name = "course_materials")
@Table(schema = "mn_oracle")
public class CourseMaterial {

   @Id
   @GeneratedValue
   private Long id;

   private String url;

   @OneToOne(optional = false)
   @JoinColumn(name = "COURSE_ID", referencedColumnName = "ID")
   private Course course;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getUrl() {
      return url;
   }

   public void setUrl(String url) {
      this.url = url;
   }

   public Course getCourse() {
      return course;
   }

   public void setCourse(Course course) {
      this.course = course;
   }
}
