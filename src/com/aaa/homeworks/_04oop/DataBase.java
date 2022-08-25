package com.aaa.homeworks._04oop;

import java.sql.Connection;

public class DataBase {
//1)	Define an interface “DatabaseConnection” and then
// define class “OracleConnection”, “MySqlConnection”, “SqlServerConnection”.
// They should all implements the “getConnection” method from the interface.
// The method should initialize data source and return a database connection.

    public static void main(String[] args) {
        MySqlConnection sqlConn = new MySqlConnection();
        Connection conn = sqlConn.getConnection("aaa","bbb","xxx");
    }
}
interface DatabaseConnection{
    public Connection getConnection();
}

class OracleConnection implements DatabaseConnection {
    public Connection getConnection(){return null;}
    public Connection getConnection(String dataSource, String userName, String psw){
        System.out.println("OracleConnections established");
        return null;
    }
}

class MySqlConnection implements DatabaseConnection {
    public Connection getConnection(){return null;}
    public Connection getConnection(String dataSource, String userName, String psw){
        System.out.println("MySqlConnections established");
        return null;
    }
}

class SqlServerConnection implements DatabaseConnection {
    public Connection getConnection(){return null;}
    public Connection getConnection(String dataSource, String userName, String psw){
        System.out.println("SqlServerConnections established");
        return null;
    }
}