package repository;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Marion on 3/25/2015.
 */
public class ContactDB extends SQLiteOpenHelper {

  private  String CREATE_DATABASE= "create table "+ContactContract.DATABASE_TABLE+" ("+ContactContract.COLUMN_ID+" integer primary key autoincrement"+
          " , "+ContactContract.FIRST_NAME_COLUMN+" text"+" ,"+ContactContract.LAST_NAME_COLUMN+" text)";

    public ContactDB(Context context) {
        super(context, ContactContract.DATABASE_NAME, null, ContactContract.DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_DATABASE);
        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
