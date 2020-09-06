package test.app.coursematerial;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class CourseMaterialService {

    @Inject
    private CourseMaterialRepository courseMaterialRepository;

    public Iterable<CourseMaterial> findAll() {
        return courseMaterialRepository.findAll();
    }

    public CourseMaterial add(CourseMaterial courseMaterial) {
        return courseMaterialRepository.save(courseMaterial);
    }
}
