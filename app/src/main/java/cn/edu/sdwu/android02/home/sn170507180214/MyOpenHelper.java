package cn.edu.sdwu.android02.home.sn170507180214;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class MyOpenHelper extends SQLiteOpenHelper {
    private String STUDENT1_TB_SQL="create table student1(id integer primary key autoincrement,name text,age text,height text)";
    public MyOpenHelper(Context context){
        super(context,"stud1.db",null,1);//创建数据库
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(STUDENT1_TB_SQL);
        Log.i(MyOpenHelper.class.toString(),"onCreate");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
