package br.edu.ifpb.report.database;

public class MysqlDatabaseConnector implements MainDatabaseConnector {

    public void createConnection() {
        System.out.println("Create mysql connetion");
    }

    public void runnerQuery(String query) {
        System.out.println("Run SQL query");
    }

}
