package com.michalstepien.module.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @RequestMapping({"/", "/index", "/index.html", "/index.html"})
    public String getHome(Model model) {

        // str
        model.addAttribute("name", "Michał");

        // obj
        PersonDto person = new PersonDto(
                "Michał",
                "Stępień",
                33
        );
        model.addAttribute("person", person);

        // list obj
        List<PersonDto> persons = List.of (
                new PersonDto("Wilhelm", "Conrad", 18),
                new PersonDto("Marie", "Skłodowska-Curie", 19),
                new PersonDto("Chandrasekhar", "Venkata Raman", 20)
        );
        model.addAttribute("persons", persons);

        return "home.html";
    }
}
