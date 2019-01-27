package com.mono.cassandra.person.repo;


import com.mono.model.PersonalInfo;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import reactor.core.publisher.Flux;

import java.util.UUID;

public interface PersonalInfoRepo extends ReactiveCassandraRepository<PersonalInfo, UUID> {

    Flux<PersonalInfo>findByName(final String name);
    Flux<PersonalInfo>findByNameStartingWith(final String startsWith);

}
