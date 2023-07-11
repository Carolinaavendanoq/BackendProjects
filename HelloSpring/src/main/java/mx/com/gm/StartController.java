package mx.com.gm;

import mx.com.gm.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

// @RestController
@Controller
public class StartController {
    /*
    @GetMapping("/")
    public String Start(){
        return "Hello World with Spring";
    }
     */

    @GetMapping("/")
    public String Start(Model model){
        var message = "Hello World with Thymeleaf";
        var person = new Person();
        person.setFirstName("Juan");
        person.setLastName("Perez");
        person.setEmail("jperez@mail.co");
        person.setPhone("345634634");

        var person1 = new Person();
        person1.setFirstName("Carla");
        person1.setLastName("Gomez");
        person1.setEmail("cgomez@mail.co");
        person1.setPhone("34634");

        var people = new ArrayList();
        // people.add(person);
        // people.add(person1);

        // var personas = Arrays.asList(person, person1);

        model.addAttribute("message", message);
        // model.addAttribute("person", person);
        model.addAttribute("people", people);
        return "index";
    }
}
