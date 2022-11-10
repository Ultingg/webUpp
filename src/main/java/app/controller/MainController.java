package app.controller;

import app.dao.Person;
import app.dao.PersonRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    private final PersonRepository personRepository;

    public MainController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/opa")
    public String getIndex() {
        return "opa";
    }

    @GetMapping("persons")
    public ResponseEntity<List<Person>> getList(){
       List<Person> list = personRepository.getList();
       return ResponseEntity.ok(list);
    }
}
