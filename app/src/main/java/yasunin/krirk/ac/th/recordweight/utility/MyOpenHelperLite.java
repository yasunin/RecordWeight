package yasunin.krirk.ac.th.recordweight.utility;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.security.Key;

/**
 * Created by Tipa on 1/30/2018.
 */

public class MyOpenHelperLite extends SQLiteOpenHelper{
    //    Explicit
    private Context context;
    public static final String databaseName = "Weight.db";
    private static final int databaseVersion = 1;
    private static final String databaseDetailuserTABLE = "create table userTABLE(" +
            "id integer primary Key, " +
            "NickName text," +
            "StartApp text," +
            "Weight text," +
            "Height text, " +
            "Gender text," +
            "Age text);";


    private static final String DatabaseDetaildailyTABLE = "create table dailyTABLE(" +
            "id integer primary key," +
            "DateCheck text," +
            "Weight text);";




    public MyOpenHelperLite(Context context) {
        super(context, databaseName, null,databaseVersion);
        this.context = context;
    }  //constructor

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(databaseDetailuserTABLE);
        sqLiteDatabase.execSQL(DatabaseDetaildailyTABLE);




    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}   ///Main class
