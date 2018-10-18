package org.wecancodeit.contactlist.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Contact {

	@Id
	@GeneratedValue
	private Long id;
	private String address;
	
	@OneToMany(mappedBy="contact")
	private Collection<Person> people;

	public Contact() {}

	public Contact(String address) {
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}
	
	public Collection<Person> getPeople() {
		return people;
	}

	@Override
	public String toString() {
		return address;
	}

}