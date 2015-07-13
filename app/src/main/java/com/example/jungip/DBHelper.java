package com.example.jungip;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
//DB만 접속할 수 있는 클래스.일명 DAO(Data Access Object Class)
public class DBHelper extends SQLiteOpenHelper{//sqlite db에 접근하려면 SqliteOpenHelper클래스를 상속받아야
//상속받으면 2개의 메소드를 오버라이딩 해야. SqliteOpenHelper클래스를 이용해 안드로이드 폰에 접근할 수 있기에.
	public DBHelper(Context context){
		super(context,"FoodInfo.db",null,1);
		
	}//sqlite를 사용하기 위해서

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO 자동 생성된 메소드 스텁
		db.execSQL("CREATE TABLE food ( _id INTEGER PRIMARY KEY AUTOINCREMENT, " + "whereuare TEXT, foodtype TEXT, foodname TEXT, foodplace TEXT);");
		
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO 자동 생성된 메소드 스텁
		db.execSQL("DROP TABLE IF EXISTS food");
		onCreate(db);
	}

}























