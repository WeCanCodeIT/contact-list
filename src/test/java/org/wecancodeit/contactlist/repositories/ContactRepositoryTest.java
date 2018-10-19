package org.wecancodeit.contactlist.repositories;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.wecancodeit.contactlist.model.Contact;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ContactRepositoryTest {
	
	@Resource
	ContactRepository repo;
	
	@Test
	public void shouldReturnAllContacts() {
		//Arrange
		Contact contact = repo.save(new Contact("", ""));
		Contact contact2 = repo.save(new Contact("", ""));
		
		//Act
		Iterable<Contact> result = repo.findAll();
		
		//Assert
		assertThat(result, hasItems(contact));
	}

}
