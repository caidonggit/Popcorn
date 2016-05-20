package com.newer.mysqlite3;

import com.newer.mysqlite3.data.dao.BaseDao;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BaseDao dao=new BaseDao(MainActivity.this);
        SQLiteDatabase db= BaseDao.openDatebase();
        BaseDao.closeDatabase(db);
    }
}
