package problems.SenzorRaportFactory.reports;

public abstract class AbstractAirQualityReport {
    protected double pm25;

    public AbstractAirQualityReport(double pm25){
        this.pm25 = pm25;
    }

    public abstract String reportMessage();
    public abstract boolean isApplicable(double pm25);
    public abstract AbstractAirQualityReport createReport(double pm25);
}
