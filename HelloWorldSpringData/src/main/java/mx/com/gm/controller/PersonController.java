package mx.com.gm.controller;

import mx.com.gm.services.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    @Autowired
    private IPersonService iPersonService;

    @GetMapping("/")
    public String start(Model model){
        var people = iPersonService.peopleList();
        model.addAttribute("people", people);
        return "index";
    }
}
