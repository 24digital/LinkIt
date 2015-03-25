package com.application.linkit;

import Entities.Contact;
import repository.ContactDAO;

/**
 * Created by Marion on 3/25/2015.
 */
public class MailClient {
    private ContactDAO dao;

    public MailClient(ContactDAO dao) {
        this.dao = dao;

    }

    public Contact getContact(String firstName, String lastName)
    {
      return   dao.getContactDAO(firstName, lastName);
    }

}
