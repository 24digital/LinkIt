package repository;

import java.util.List;

import Entities.Contact;

/**
 * Created by Marion on 3/25/2015.
 */
public interface ContactDAO {
    Contact getContactDAO(String firstName, String lastName);

    List<Contact> getAllContacts();
}
