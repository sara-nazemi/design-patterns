package org.designpatterns.structural.facade;

public class Facade {
    public static void main(String[] args) {
        ConnectionFacade connectionFacade = new ConnectionFacade();
        connectionFacade.getConnection("oracle");
    }
}

class MySqlConnection {
    void getConnection() {
        System.out.println("get my sql connection");
    }
}

class OracleConnection {
    void getConnection() {
        System.out.println("get oracle connection");
    }
}

class ConnectionFacade {
    void getConnection(String type) { // controller
        switch (type) {
            case "oracle":
                OracleConnection oracleConnection = new OracleConnection();
                oracleConnection.getConnection();
                break;
            case "mysql":
                MySqlConnection connection = new MySqlConnection();
                connection.getConnection();
                break;
        }
    }
}