package com.mono.cassandra.person.service;

import com.mono.cassandra.person.repo.PersonalInfoRepo;
import com.mono.model.PersonalInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.Disposable;
import reactor.core.publisher.Mono;

import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {

    @Autowired
    PersonalInfoRepo repo;

    /*Mono manipulation to take out Email*/

    public Mono<PersonalInfo>getEmail(UUID uuid)
    {
      Mono<Mono<PersonalInfo>> just = Mono.just(repo.findById(uuid));
      return just.flatMap(pmono -> {
           PersonalInfo Address=new PersonalInfo();
            return pmono.map(e->{
                return new PersonalInfo().builder().email(e.getEmail()).build();
            });
       });

    }

}
