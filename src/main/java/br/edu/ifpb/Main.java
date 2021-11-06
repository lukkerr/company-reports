package br.edu.ifpb;

import br.edu.ifpb.report.service.ExpenseService;
import br.edu.ifpb.report.service.ReportService;
import br.edu.ifpb.report.service.TaxService;

public class Main {

    public static void main(String[] args) {

        ReportService expenseService = new ExpenseService();
        ReportService taxService = new TaxService();

        expenseService.generateReport();
        taxService.generateReport();

    }
}
