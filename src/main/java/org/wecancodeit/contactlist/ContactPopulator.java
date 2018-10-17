package org.wecancodeit.contactlist;

import java.util.Random;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.contactlist.model.Contact;
import org.wecancodeit.contactlist.repositories.ContactRepository;

@Service
public class ContactPopulator implements CommandLineRunner {
	
	@Resource
	ContactRepository contactRepo;

	@Override
	public void run(String... args) throws Exception {
		Random rng = new Random(3);
		String[] names = {"Donny", "Aaron", "Alan"};
		
		for (int i = 0; i < 6; i++) {
			contactRepo.save(new Contact(names[rng.nextInt() - 1], "", ""));
		}
		
//		contactRepo.save(new Contact("Not Real", "123 Fake St.", "4105555555"));
//		contactRepo.save(new Contact("Donny", "56 NotMyAddress St.", "6145555555"));
//		contactRepo.save(new Contact("Tre", "345 Somewhere Ave.", "2165555555"));
//		contactRepo.save(new Contact("Riley", "456 Unreal Way", "7405555555"));
//		contactRepo.save(new Contact("Justin", "1 idk rd.", "4195555555"));
	}

}
