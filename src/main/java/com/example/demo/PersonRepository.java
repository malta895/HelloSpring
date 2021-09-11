package com.example.demo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

// collectionResourceRel is needed to give the plural people, the default would have been persons
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long>{

    List<Person> findByLastName(@Param("lastName") String lastName);
    List<Person> findByFirstName(@Param("firstName") String firstName);
    
}
