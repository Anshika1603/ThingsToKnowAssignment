package com.knoldus.Question7;

public class Database {
    private static int numOfConnections = 0; // Static variable for the number of active database connections

    public static void establishConnection() {
        // Code to establish a database connection
        numOfConnections++;
    }

    public static void closeConnection() {
        // Code to close a database connection
        numOfConnections--;
    }

    public static int getNumOfConnections() {
        return numOfConnections;
    }
    public static void main(String[] args){
        Database.establishConnection();
        Database.establishConnection();
        Database.establishConnection();
        int activeConnections = Database.getNumOfConnections();
        System.out.println("Number of active database connections: " + activeConnections);
        Database.closeConnection();
    }
}
