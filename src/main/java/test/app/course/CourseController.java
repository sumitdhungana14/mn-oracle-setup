package test.app.course;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import javax.inject.Inject;

@Controller("/api/courses")
public class CourseController {

    @Inject
    private CourseService courseService;

    @Get("/")
    public HttpResponse findAll() {
        return HttpResponse.ok(courseService.findAll());
    }

    @Post("/")
    public HttpResponse add(@Body Course teacher) {
        return HttpResponse.ok(courseService.add(teacher));
    }
}
