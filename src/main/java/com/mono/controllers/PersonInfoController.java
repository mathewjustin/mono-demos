package com.mono.controllers;

import com.mono.cassandra.person.repo.PersonalInfoRepo;
import com.mono.cassandra.person.service.PersonService;
import com.mono.model.PersonalInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@Slf4j
public class PersonInfoController {

    @Autowired
    PersonalInfoRepo repository;

    @Autowired
    PersonService personService;

    @GetMapping("/person/autocomplete/{startsWith}")
    Flux<PersonalInfo> findByNameStartingWith(@PathVariable String startsWith) {
        log.info("Searching for {}",startsWith);
        return this.repository.findByNameStartingWith(startsWith);
    }
    @GetMapping("/person/byid/{uuid}")
    Mono<PersonalInfo> findById(@PathVariable UUID uuid) {
        log.info("Looking upfor {}",uuid);
        return this.repository.findById(uuid);
    }
    @GetMapping("/person/email/{uuid}")
    Mono<PersonalInfo>getEmail(@PathVariable UUID uuid)
    {
        return personService.getEmail(uuid);
    }
}
