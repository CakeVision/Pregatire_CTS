package problems.SenzorRaportFactory.reports.demo;

import problems.SenzorRaportFactory.reports.AbstractAirQualityReport;
import problems.SenzorRaportFactory.reports.Factory.ReportFactory;
import problems.SenzorRaportFactory.reports.ReportType;

public class WheatherReportCreatorDemo {
    public static void main(String[] args){
        ReportFactory.registerNewReportType(ReportType.class);
        AbstractAirQualityReport report = ReportFactory.createReport(25);
        System.out.println("Report has: " + report.reportMessage());
    }
}
