package yasunin.krirk.ac.th.recordweight.utility;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLData;

/**
 * Created by Tipa on 1/30/2018.
 */

public class MyManager {


    private Context context;
    private  MyOpenHelperLite myOpenHelperLSQLite;
    private SQLiteDatabase sqLiteDatabase;


    public MyManager(Context context) {
        this.context = context;

        myOpenHelperLSQLite = new MyOpenHelperLite(context);
        sqLiteDatabase = myOpenHelperLSQLite.getWritableDatabase();

    }
}   ///Main Class
