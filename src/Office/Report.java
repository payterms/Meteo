package Office;

import java.util.*;

class Report {
    private List<ReportItem> items;    // Отчетные данные

    public Report() {
        items = new ArrayList<ReportItem>();
    }

    // расчет отчетных данных
    public void calculate() {
        items.add(new ReportItem("First", (float) 5));
        items.add(new ReportItem("Second", (float) 6));
    }

    public void output(OutputReport outputReport) {
        outputReport.output(items);
    }
}