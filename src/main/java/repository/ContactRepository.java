package repository;

import model.Contact;

import java.util.HashMap;
import java.util.Map;

public class ContactRepository {

    final static Map<Integer, Contact> repo = new HashMap<Integer, Contact>();

    public Contact getContact(final int id) {
        repo.put(1, new Contact("Jean", "Louis", 22));
        repo.put(2, new Contact("Harri", "Covaire", 35));


        return repo.get(id);
    }
}
