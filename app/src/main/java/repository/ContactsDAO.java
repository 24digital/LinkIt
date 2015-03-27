package repository;

import android.content.ContentValues;
import android.content.Context;
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

    public ContactsDAO(EmailContactDTO contactDTO, Context context) {
        this.contactDTO = contactDTO;
        contactDTO = new EmailContactDTO();
        contactDB = new ContactDB(context);
    }

    /**
     * Receive a specefic contact stored in the database
     *
     * @param firstName
     * @param lastName
     * @return
     */
    @Override
    public Contact getContactDAO(String firstName, String lastName) {

        SQLiteDatabase database = contactDB.getReadableDatabase();
        Cursor cursor = null;
        //   Cursor cursor =    database.query("(Select "+ContactContract.FIRST_NAME_COLUMN+" ,"+ContactContract.LAST_NAME_COLUMN+" "+"from"+" "+ContactContract.DATABASE_TABLE+
        //     "where "+firstName+"="+ContactContract.DATABASE_TABLE+"."+ContactContract.FIRST_NAME_COLUMN +" )",null,null );
        Contact contact = null;
        if (cursor != null) {
            contact = new Contact();
            contact.setFirstName(cursor.getString(1));
            contact.setLastName(cursor.getString(2));
        }
        return contact;
    }

    @Override
    public List<Contact> getAllContacts() {
        List<Contact> contactList = new ArrayList<>();
        SQLiteDatabase database = contactDB.getReadableDatabase();
        Cursor cursor = database.rawQuery("Select firstName, lastName from CONTACTS", null);
        cursor.moveToFirst();
        Contact contact = null;
        while (!cursor.isAfterLast()) {
            contact = new Contact();
            contact.setFirstName(cursor.getString(1));
            contact.setLastName(cursor.getString(2));
            contactList.add(contact);
            cursor.moveToNext();
        }
        return contactList;
    }

    public void setDATA() {
        Contact temp = contactDTO.getContact();
        ContentValues values = new ContentValues();
        values.put(ContactContract.FIRST_NAME_COLUMN, temp.getFirstName());
        values.put(ContactContract.LAST_NAME_COLUMN, temp.getLastName());
        SQLiteDatabase database = contactDB.getWritableDatabase();
        database.insert(ContactContract.DATABASE_TABLE, null, values);
        database.close();
    }

}
