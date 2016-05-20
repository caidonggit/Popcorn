package com.newer.mysqlite3.data.dao;

import com.newer.mysqlite3.data.util.DBHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class BaseDao {
	static Context ctxt;
	
	public  BaseDao(Context context){
		this.ctxt=context;
	}
  public static SQLiteDatabase openDatebase(){
	  SQLiteDatabase db=null;
	  DBHelper help=null;
	  try{
		  help=new DBHelper(ctxt, "tbpersons.db", null, 1);
	      db=help.getWritableDatabase();
	  }catch(Exception e){
		  e.printStackTrace();
		  db=help.getReadableDatabase();
	  }  
	  return db; 
  }
  
  public static void closeDatabase(SQLiteDatabase db){
	  try{
		  if(db!=null){
			  db.close();
		  }
	  }catch(Exception e){
		  e.printStackTrace();
	  }
	  
  }
}
