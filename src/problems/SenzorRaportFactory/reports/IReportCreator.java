package problems.SenzorRaportFactory.reports;

public interface IReportCreator {
    boolean isApplicable(double pm25Value);
    AbstractAirQualityReport createReport(double pm25Value);
}
