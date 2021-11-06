package br.edu.ifpb.report.controller;

public abstract class MainReport {

    public void generate() {
        createConnection();
        executeQuery();
        convertReportTo();
    }

    abstract void createConnection();

    abstract void executeQuery();

    abstract void convertReportTo();
}
