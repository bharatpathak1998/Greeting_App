package com.example.greetingapp.controller;

import com.example.greetingapp.model.GreetingModel;
import com.example.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    @GetMapping("/get")
    public String getGreetMessage() {
        return greetingService.getGreetMessage();
    }

    @PostMapping("/addGreet")
    public GreetingModel addGreet(@RequestBody GreetingModel greetingModel) {
        return greetingService.addGreet(greetingModel);
    }

    @GetMapping("/getGreet/{id}")
    public GreetingModel getGreetById(@PathVariable long id) {
        return greetingService.getGreetById(id);
    }

    @GetMapping("/getGreets")
    public List<GreetingModel> getGreet() {
        return greetingService.getGreets();
    }

    @PutMapping("/putGreet/{id}")
    public GreetingModel updateGreetById(@PathVariable long id, @RequestBody GreetingModel greetingModel) {
        return greetingService.updateGreet(id, greetingModel);
    }

    @DeleteMapping("/deleteGreet/{id}")
    public void deleteGreetById(@PathVariable long id) {
        greetingService.deleteGreet(id);
    }
}