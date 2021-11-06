package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.MainDatabaseConnector;
import br.edu.ifpb.report.database.MysqlDatabaseConnector;

public class TaxReport extends MainReport {

    private MainDatabaseConnector connector = new MysqlDatabaseConnector();

    public void createConnection() {
        System.out.println("Creating Database Connection...");
        connector.createConnection();
    }

    public void executeQuery() {
        System.out.println("Executing MySQL Query...");
        String query = "SELECT * FROM taxes";
        connector.runnerQuery(query);
    }

    public void convertReportTo() {
        System.out.println("Converting To PDF...");
    }
}
