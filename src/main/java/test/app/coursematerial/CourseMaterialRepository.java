package test.app.coursematerial;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface CourseMaterialRepository extends CrudRepository<CourseMaterial, Long> {
}
