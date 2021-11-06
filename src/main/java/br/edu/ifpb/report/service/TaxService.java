package br.edu.ifpb.report.service;

import br.edu.ifpb.report.controller.MainReport;
import br.edu.ifpb.report.controller.TaxReport;

public class TaxService implements ReportService {

    private MainReport report = new TaxReport();

    public void generateReport() {
        report.generate();
    }

}
