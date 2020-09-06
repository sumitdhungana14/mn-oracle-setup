package test.app.student;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class StudentService {

    @Inject
    private StudentRepository studentRepository;

    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student add(Student student) {
        return studentRepository.save(student);
    }
}
