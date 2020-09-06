package test.app.teacher;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class TeacherService {

    @Inject
    private TeacherRepository teacherRepository;

    public Iterable<Teacher> findAll() {
        return teacherRepository.findAll();
    }

    public Teacher add(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
