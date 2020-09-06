package test.app.coursematerial;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;

import javax.inject.Inject;

@Controller("/api/course-materials")
public class CourseMaterialController {

    @Inject
    private CourseMaterialService courseMaterialService;

    @Get("/")
    public HttpResponse findAll() {
        return HttpResponse.ok(courseMaterialService.findAll());
    }

    @Post("/")
    public HttpResponse add(@Body CourseMaterial courseMaterial) {
        return HttpResponse.ok(courseMaterialService.add(courseMaterial));
    }
}
