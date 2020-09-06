package test.app.course;


import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class CourseService {

    @Inject
    private CourseRepository courseRepository;

    public Iterable<Course> findAll() {
        return courseRepository.findAll();
    }

    public Course add(Course teacher) {
        return courseRepository.save(teacher);
    }
}
