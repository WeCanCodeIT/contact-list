package org.wecancodeit.contactlist;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.contactlist.model.Contact;
import org.wecancodeit.contactlist.model.Person;
import org.wecancodeit.contactlist.repositories.ContactRepository;
import org.wecancodeit.contactlist.repositories.PersonRepository;

@Service
public class ContactPopulator implements CommandLineRunner {
	
	@Resource
	ContactRepository contactRepo;
	
	@Resource
	PersonRepository personRepo;

	@Override
	public void run(String... args) throws Exception {
		Contact contactOne = new Contact("123 Fake St.");
		Contact contactTwo = new Contact("56 NotMyAddress St.");
		Contact contactThree = new Contact("345 Somewhere Ave.");
		Contact contactFour = new Contact("456 Unreal Way");
		Contact contactFive = new Contact("1 idk rd.");
		
		contactOne = contactRepo.save(contactOne);
		contactTwo = contactRepo.save(contactTwo);
		contactRepo.save(contactThree);
		contactRepo.save(contactFour);
		contactRepo.save(contactFive);
		
		Person personOne = new Person("Donny", "Hamilton", "6145555555", contactOne);
		Person personTwo = new Person("Alan", "Kostrick", "6145555555", contactTwo);
		Person personThree = new Person("Baby", "Kostrick", "6145555555", contactTwo);
		
		personRepo.save(personOne);
		personRepo.save(personTwo);
		personRepo.save(personThree);
	}

}