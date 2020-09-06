package test.app.student;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;

import javax.inject.Inject;

@Controller("/api/students")
public class StudentController {

    @Inject
    private StudentService studentService;

    @Get("/")
    public HttpResponse findAll() {
        return HttpResponse.ok(studentService.findAll());
    }

    @Post("/")
    public HttpResponse add(@Body Student student) {
        return HttpResponse.ok(studentService.add(student));
    }
}
