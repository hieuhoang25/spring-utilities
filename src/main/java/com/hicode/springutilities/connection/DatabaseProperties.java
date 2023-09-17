package com.hicode.springutilities.connection;
/**
 * Properties of the database
 * */
public class DatabaseProperties {
    /**server host*/
    private String serverHost;
    private String username;
    private String password;
    private String port;
    private String database;
    public DatabaseProperties() {
    }

    public DatabaseProperties(String serverHost, String username, String password, String port) {
        this.serverHost = serverHost;
        this.username = username;
        this.password = password;
        this.port = port;
    }

    public DatabaseProperties(String serverHost, String username, String password, String port, String database) {
        this.serverHost = serverHost;
        this.username = username;
        this.password = password;
        this.port = port;
        this.database = database;
    }

    public String getServerHost() {
        return serverHost;
    }

    public void setServerHost(String serverHost) {
        this.serverHost = serverHost;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }
}
