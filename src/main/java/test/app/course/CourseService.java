package test.app.course;


import javax.inject.Inject;
import javax.inject.Singleton;
import javax.transaction.Transactional;

@Singleton
public class CourseService {

    @Inject
    private CourseRepository courseRepository;

    @Transactional
    public Iterable<Course> findAll() {
        return courseRepository.findAll();
    }

    @Transactional
    public Course add(Course course) {
        return courseRepository.save(course);
    }
}
