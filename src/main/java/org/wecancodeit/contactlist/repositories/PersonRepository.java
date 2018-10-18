package org.wecancodeit.contactlist.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.contactlist.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
