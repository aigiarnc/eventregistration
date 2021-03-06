package ca.mcgill.ecse321.eventregistration.dao;

import org.springframework.data.repository.CrudRepository;

import ca.mcgill.ecse321.eventregistration.model.Person;

//@RepositoryRestResource(collectionResourceRel = "person_data", path = "person_data")
public interface PersonRepository extends CrudRepository<Person, String>{

	Person findPersonByName(String name);
	
}