package repository;

import Entities.Contact;

/**
 * Created by Marion on 3/25/2015.
 */
public class EmailContactDTO {
    private Contact contact;

    public void setContactFullName(String firstName, String lastName) {
        contact = new Contact();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);

    }

    protected Contact getContact() {
        return this.contact;
    }

}
