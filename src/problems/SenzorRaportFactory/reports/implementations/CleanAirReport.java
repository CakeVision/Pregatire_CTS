package problems.SenzorRaportFactory.reports.implementations;

import problems.SenzorRaportFactory.reports.AbstractAirQualityReport;

public class CleanAirReport extends AbstractAirQualityReport {

    public CleanAirReport(double pm25) {
        super(pm25);
    }

    @Override
    public String reportMessage() {
        return "Clean air report";
    }

    @Override
    public boolean isApplicable(double pm25) {
        return pm25 >= 0 && pm25 <= 30;
    }

    @Override
    public AbstractAirQualityReport createReport(double pm25) {
        return new CleanAirReport(pm25);
    }
}
