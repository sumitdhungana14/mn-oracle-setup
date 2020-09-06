package test.app.teacher;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;

import javax.inject.Inject;

@Controller("/api/animals")
public class TeacherController {

    @Inject
    private TeacherService teacherService;

    @Get("/")
    public HttpResponse findAll() {
        return HttpResponse.ok(teacherService.findAll());
    }

    @Post("/")
    public HttpResponse add(@Body Teacher teacher) {
        return HttpResponse.ok(teacherService.add(teacher));
    }
}
