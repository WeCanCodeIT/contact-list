package org.wecancodeit.contactlist.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.contactlist.model.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long> {
}
