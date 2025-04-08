package problems.SenzorRaportFactory.reports.implementations;

import problems.SenzorRaportFactory.reports.AbstractAirQualityReport;

import java.util.HashMap;

public class HealthHazardReport extends AbstractAirQualityReport {

    public HealthHazardReport(double pm25) {
        super(pm25);
    }

    @Override
    public String reportMessage() {
        return "Humans should not consume this air";
    }

    @Override
    public boolean isApplicable(double pm25) {
        return pm25 > 70;
    }

    @Override
    public AbstractAirQualityReport createReport(double pm25) {
        return new HealthHazardReport(pm25);
    }
}
