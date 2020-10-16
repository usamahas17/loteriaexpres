package com.example.loteriaexpres;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class Conexiondedatos {
    Context c;
    Numerodeloto n;
    ArrayList<Numerodeloto> lista;
    SQLiteDatabase sql;
    String db = "dbnumeros";
    String table = "create table if not exists numeroloto(id integer primary key autoincrement, numero1 integer,numero2 integer,numero3 integer,numero4 integer,numero5 integer)";
public Conexiondedatos(Context c){
    this.c = c;
    sql = c.openOrCreateDatabase(db,c.MODE_PRIVATE,null);
    sql.execSQL(table);
    n = new Numerodeloto();



}
public  void insertar(Numerodeloto n){

        ContentValues valores = new ContentValues();
        valores.put("numeo1", n.getNum1());
        valores.put("numero2", n.getNum2());
        valores.put("numero3", n.getNum3());
        valores.put("numero4", n.getNum4());
        valores.put("numero5", n.getNum5());
        sql.insert("numeroloto",null,valores);
    }

public  ArrayList<Numerodeloto> selesccion(){
    ArrayList<Numerodeloto> o  = new ArrayList<>();
    o.clear();
    Cursor k = sql.rawQuery("select * from numeroloto",null);
    if (k!=null && k.moveToFirst()){
        do {
            Numerodeloto j = new Numerodeloto();
            j.setId(k.getInt(0));
            j.setNum1(k.getInt(1));
            j.setNum2(k.getInt(2));
            j.setNum3(k.getInt(3));
            j.setNum4(k.getInt(4));
            j.setNum5(k.getInt(5));
            o.add(j);

        }while (k.moveToNext());

    }
    return o;

    }public int  recuperar( int n1, int n2,int n3,int n4,int n5){
    int y  = 0;
    Cursor c = sql.rawQuery("select * from numeroloto",null);
    if(c!=null && c.moveToFirst()){
        do {
            if(c.getInt(1)==n1 && c.getInt(2)==n2 && c.getInt(3)==n3 && c.getInt(4)==n4 && c.getInt(5)==n5){
                y++;

            }

        }while (c.moveToNext());

    }return y;


    }
    public Numerodeloto getnumero1(int n1,int n2,int n3, int n4,int n5){
         lista= selesccion();
        for(Numerodeloto us : lista){
            if(us.getNum1()==n1 && us.getNum2()==n2 && us.getNum3()==n3 && us.getNum4()==n4 && us.getNum5()== n5){
                return  us;

            }

        }return null;

    }
    public  Numerodeloto numerobyid(int id){
        lista = selesccion();
        for (Numerodeloto j : lista){
            if(j.getId() == id){
                return  j;

            }

        }return null;

    }

}
