package br.edu.ifpb.report.database;

public interface MainDatabaseConnector {

    void createConnection();
    
    void runnerQuery(String query);
}
