package br.edu.ifpb.report.service;

import br.edu.ifpb.report.controller.ExpenseReport;
import br.edu.ifpb.report.controller.TaxReport;

public class ReportService {

    ExpenseReport expenseReport = new ExpenseReport(); //despesa
    TaxReport taxReport = new TaxReport(); //fiscal

    


    public void generateReport(String type) {
        if (type.equals("expense")) {
            expenseReport.generate();
        } else {
            taxReport.generate();
        }
    }

}
