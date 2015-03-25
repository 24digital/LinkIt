package repository;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import Entities.Contact;

/**
 * Created by Marion on 3/25/2015.
 */
public class ContactsDAO implements ContactDAO {
    private EmailContactDTO contactDTO;
    private ContactDB contactDB;
    public ContactsDAO(EmailContactDTO contactDTO) {
        this.contactDTO = contactDTO;
        contactDTO = new EmailContactDTO();
        contactDB   = new ContactDB();
    }


    @Override
    public Contact getContactDAO(String firstName, String lastName) {
        return null;
    }

    @Override
    public List<Contact> getAllContacts() {
        List<Contact> contactList = new ArrayList<>();
   SQLiteDatabase database = contactDB.getReadableDatabase();
  Cursor cursor = database.rawQuery("Select firstName, lastName from CONTACTS", null);
        cursor.moveToFirst();
        Contact contact = null;
        while(!cursor.isAfterLast())
        {
            contact = new Contact();
            contact.setFirstName(cursor.getString(1));
            contact.setLastName(cursor.getString(2));
           contactList.add(contact);
            cursor.moveToNext();
        }
        return contactList;
    }

    public void setDATA()
    {
      Contact temp =  contactDTO.getContact();
        SQLiteDatabase database = contactDB.getWritableDatabase();
        database.insert()
    }

}
