package repository;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Marion on 3/25/2015.
 */
public class ContactDB extends SQLiteOpenHelper {


    public ContactDB(Context context) {
        super(context, ContactContract.DATABASE_NAME, null, ContactContract.DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
