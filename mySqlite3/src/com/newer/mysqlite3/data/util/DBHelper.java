package com.newer.mysqlite3.data.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

	public DBHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
       db.execSQL("create table tb_person" +
       		"(_id integer primary key autoincrement," +
       		"name text not null" +
       		"age integer not null" +
       		"height real not null)");
       db.execSQL("insert into tb_person(name,age,height)" +
       		"values('张三',20,1.80)");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVision, int newVision) {
		// TODO Auto-generated method stub
       db.execSQL("drop table tb_person");
       db.execSQL("create table tb_person" +
          		"(_id integer primary key autoincrement," +
          		"name text not null" +
          		"age integer not null" +
          		"height real not null)");
	}

}
