package br.edu.ifpb.report.database;

public class PostgreSQLDatabaseConnector implements MainDatabaseConnector {

    public void createConnection() {
        System.out.println("Create postgres connetion");
    }

    public void runnerQuery(String query) {
        System.out.println("Run SQL query");
    }

}
