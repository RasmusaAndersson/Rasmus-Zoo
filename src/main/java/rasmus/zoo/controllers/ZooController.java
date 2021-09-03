package rasmus.zoo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import rasmus.zoo.services.AnimalService;
import rasmus.zoo.services.EmployeeService;
import rasmus.zoo.services.VisitorService;
import rasmus.zoo.services.FeedService;
@Controller
public class ZooController {

    @Autowired
    AnimalService animalService;

    @Autowired
    EmployeeService employeeService;

    @Autowired
    VisitorService visitorService;

    @Autowired
    FeedService feedService;

    @RequestMapping("/index")
    public String start() {
        return "index";
    }

    @RequestMapping("animals")
    public String showAnimals(Model model) {
        model.addAttribute("animals", animalService.getAllAnimals());
        return "animals";
    }

    @RequestMapping("employees")
    public String showEmployees(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employees";
    }

    @RequestMapping("feed")
    public String showFeed(Model model) {
        model.addAttribute("feedlist", feedService.getFeed());
        return "feed";
    }

    @RequestMapping("visitors")
    public String showVisitors(Model model) {
        model.addAttribute("visitors", visitorService.getAllVisitors());
        return "visitors";
    }
}
