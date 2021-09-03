package rasmus.zoo.api;

import org.springframework.web.bind.annotation.*;
import rasmus.zoo.models.Visitor;
import rasmus.zoo.services.VisitorService;

import java.util.List;

@RestController
@RequestMapping("/api/visitors/")
public class VisitorController {

    private VisitorService visitorService;

    public VisitorController(VisitorService visitorService) {
        this.visitorService = visitorService;
    }

    @GetMapping
    public List<Visitor> getAllVisitors() {
        return visitorService.getAllVisitors();
    }

    @GetMapping("{id}")
    public Visitor getVisitorById(@PathVariable("id") Integer id) {
        return visitorService.getVisitorById(id);
    }

    @PostMapping
    public Visitor addVisitor(@RequestBody Visitor newVisitor) {
        return visitorService.addVisitor(newVisitor);
    }

    @DeleteMapping("{id}")
    public void deleteVisitor(@PathVariable("id") Integer id) {
        visitorService.deleteVisitor(id);
    }
}
