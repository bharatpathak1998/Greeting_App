package com.example.greetingapp.service;

import com.example.greetingapp.model.GreetingModel;
import com.example.greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    @Autowired
    GreetingRepository greetingRepository;

    // Here we are get the Hello World message :-
    public String getGreetMessage() {
        return "Hello World";
    }

    // Here we are create a addGreet method to save the data in the database :-
    public GreetingModel addGreet(GreetingModel greetingModel) {
        return greetingRepository.save(greetingModel);
    }

    // Here we are create a getGreetById method to get the data by id from the database :-
    public GreetingModel getGreetById(long id) {
        return greetingRepository.findById(id).orElse(null);
    }

    // Here we are create a getGreets method to get all the data from the database :-
    public List<GreetingModel> getGreets() {
        return greetingRepository.findAll();
    }

    // Here we are create a updateGreet method to update the data in the database :-
    public GreetingModel updateGreet(long id, GreetingModel greetingModel) {
        greetingModel.setId(id);
        return greetingRepository.save(greetingModel);
    }

    // Here we are create a deleteGreet method to delete data by id in the database :-
    public void deleteGreet(long id) {
        greetingRepository.deleteById(id);
    }
}