package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.MainDatabaseConnector;
import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public class ExpenseReport extends MainReport {

    private MainDatabaseConnector connector = new PostgreSQLDatabaseConnector();

    public void createConnection() {
        System.out.println("Creating Database Connection...");
        connector.createConnection();
    }

    public void executeQuery() {
        System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        connector.runnerQuery(query);
    }

    public void convertReportTo() {
        System.out.println("Converting To XLS...");
    }

}
