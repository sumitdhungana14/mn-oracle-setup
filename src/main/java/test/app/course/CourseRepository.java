package test.app.course;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
}
