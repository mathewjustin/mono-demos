package com.mono.controllers;

import com.mono.cassandra.person.repo.PersonalInfoRepo;
import com.mono.model.PersonalInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@Slf4j
public class PersonInfoController {

    @Autowired
    PersonalInfoRepo repository;


    @GetMapping("autocomplete/person/{startsWith}")
    Flux<PersonalInfo> findByNameStartingWith(@PathVariable String startsWith) {
        log.info("Searching for {}",startsWith);
        return this.repository.findByNameStartingWith(startsWith);
    }
}
