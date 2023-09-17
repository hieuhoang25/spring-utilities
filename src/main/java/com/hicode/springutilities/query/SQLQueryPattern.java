package com.hicode.springutilities.query;

/**
 * SQLQueryPattern
 *
 * @author hicode
 */
public class SQLQueryPattern {
    /*DDL (Data Definition Language)*/
    /*=======DATABASE======*/
    public static String DDL_CREATE_DATABASE= "CREATE DATABASE %s";
    public static String DDL_DROP_DATABASE = "DROP DATABASE %s";

    /*=======Table=========*/
    public static String DDL_CREATE_TABLE = "CREATE TABLE ( %s );";
    public static String DDL_DROP_TABLE = "DROP TABLE %s ";
    public static String DDL_ALTER_TABLE = "ALTER TABLE %s %s ;";
    public static String DDL_TRUNCATE_TABLE = "";
    public static String DDL_COMMENT_TABLE = "";
    public static String DDL_RENAME_TABLE = "";

    /*DQL (Data Query Language)*/
    public static String DQL_SELECT_ALL = "SELECT * FROM %s ;";
    public static String DQL_SELECT_OPTION = "SELECT %s FROM %s ;";

    /*DML(Data Manipulation Language)*/
    public static String DML_INSERT_TABLE = "";
    public static String DML_UPDATE_TABLE = "";
    public static String DML_DELETE_TABLE= "";
    public static String DML_LOCK_TABLE = "";
    public static String DML_CALL_SP = "CALL %s";
    public static String DML_CALL_SP_WITH_PARAMS = "CALL %s(%s)";
    public static String DML_CALL_FN = "";

    /*DCL (Data Control Language)*/
    public static String DCL_GRANT = "";
    public static String DCL_REVOKE = "";

    /*TCL (Transaction Control Language)*/
    //...
}
