package com.example.greetingapp.repository;

import com.example.greetingapp.model.GreetingModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<GreetingModel, Long> {

}