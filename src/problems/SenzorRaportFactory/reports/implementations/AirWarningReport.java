package problems.SenzorRaportFactory.reports.implementations;

import problems.SenzorRaportFactory.reports.AbstractAirQualityReport;

public class AirWarningReport extends AbstractAirQualityReport {
    public AirWarningReport(double pm25) {
        super(pm25);
    }

    @Override
    public String reportMessage() {
        return "Air is in the warning levels with: " + Double.toString(pm25);
    }

    @Override
    public boolean isApplicable(double pm25) {
        return pm25 > 30 && pm25 <= 70;
    }

    @Override
    public AbstractAirQualityReport createReport(double pm25) {
        return new AirWarningReport(pm25);
    }

}
