package com.example.jungip;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
//DB�� ������ �� �ִ� Ŭ����.�ϸ� DAO(Data Access Object Class)
public class DBHelper extends SQLiteOpenHelper{//sqlite db�� �����Ϸ��� SqliteOpenHelperŬ������ ��ӹ޾ƾ�
//��ӹ����� 2���� �޼ҵ带 �������̵� �ؾ�. SqliteOpenHelperŬ������ �̿��� �ȵ���̵� ���� ������ �� �ֱ⿡.
	public DBHelper(Context context){
		super(context,"FoodInfo.db",null,1);
		
	}//sqlite�� ����ϱ� ���ؼ�

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO �ڵ� ������ �޼ҵ� ����
		db.execSQL("CREATE TABLE food ( _id INTEGER PRIMARY KEY AUTOINCREMENT, " + "whereuare TEXT, foodtype TEXT, foodname TEXT, foodplace TEXT);");
		
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO �ڵ� ������ �޼ҵ� ����
		db.execSQL("DROP TABLE IF EXISTS food");
		onCreate(db);
	}

}























