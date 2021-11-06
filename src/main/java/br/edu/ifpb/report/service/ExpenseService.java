package br.edu.ifpb.report.service;

import br.edu.ifpb.report.controller.MainReport;
import br.edu.ifpb.report.controller.ExpenseReport;

public class ExpenseService implements ReportService {

    private MainReport report = new ExpenseReport();

    public void generateReport() {
        report.generate();
    }

}
