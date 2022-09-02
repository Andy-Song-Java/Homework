package com.aaa.homeworks._07collection;
import java.util.*;
public class SimulateDB {
    public static HashMap<Integer, Row> db = new HashMap<>();
    public static int key;


    //Create
    public static void create(Row row){
        if (db.size() == 0) {
            db.put(0,row);
        } else {
            db.put(db.size(),row);
        }
    }

    //Read
    public static Row read(int key){
        return db.get(key);
    }

    //Update
    public static void update(int key, Row row){
        db.put(key,row);
        db.get(key).print();
    }

    //delete
    public static void delete(int key){
        db.remove(key);
    }

    public static void print(){
            System.out.println("key" + "   value");
        for (int i = 0; i< db.size(); i++) {

            System.out.println(i + "   " + db.get(i).r1);
        }
            System.out.println("end of database");
    }
}

class Row {
    String r1;

    public Row(){}
    public Row(String str){
        this.r1 = str;
    }

    @Override
    public int hashCode(){
        return (r1 == null) ? 0 : r1.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null) return false;
        if (!(obj instanceof Row)) return false;
        Row row = (Row) obj;
        return r1.equals(row.r1);
    }

    //print method
    public void print(){
        System.out.println(r1);
    }
}

class Test2 {

    public static void main(String[] args){
        Row row1 = new Row("aaa");
        Row row2 = new Row("bbb");
        Row row3 = new Row("ccc");
        SimulateDB.print();
        //create
        SimulateDB.create(row1);
        SimulateDB.create(row2);
        SimulateDB.create(row3);
        SimulateDB.print();
        //read
        SimulateDB.read(0);
        SimulateDB.read(1);
        SimulateDB.read(2);
        SimulateDB.print();
        //update
        Row row4 = new Row("BBB");
        SimulateDB.update(1,row4);
        SimulateDB.print();
        //delete
        SimulateDB.delete(2);
        SimulateDB.print();
    }
}