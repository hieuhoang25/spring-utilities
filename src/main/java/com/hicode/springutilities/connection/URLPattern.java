package com.hicode.springutilities.connection;

public class URLPattern {
    public static final String URL_MYSQL_ROOT = "jdbc:mysql://%s:%s/?user=%s&password=%s";
    public static final String URL_MYSQL_DBNAME = "jdbc:mysql://%s:%s/%s?user=%s&password=%s";
    public static final String URL_SQLSERVER_ROOT = "jdbc:sqlserver://%s:%s;user=%s;password=%s";;
    public static final String URL_SQLSERVER_DBNAME = "jdbc:sqlserver://%s:%s;databaseName=%s;user=%s;password=%s";
    public static final String URL_POSTGRES_DBNAME = "jdbc:postgresql://%s:%s/%s?user=%s&password=%s";
    public static final String URL_POSTGRES_ROOT = "jdbc:postgresql://%s:%s/?user=%s&password=%s";

    //.....



}
