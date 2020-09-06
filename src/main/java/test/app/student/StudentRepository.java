package test.app.student;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}
