package problems.SenzorRaportFactory.reports.Factory;

import problems.SenzorRaportFactory.reports.AbstractAirQualityReport;
import problems.SenzorRaportFactory.reports.IReportCreator;
import problems.SenzorRaportFactory.reports.ReportType;
import problems.SenzorRaportFactory.reports.implementations.AirWarningReport;
import problems.SenzorRaportFactory.reports.implementations.CleanAirReport;
import problems.SenzorRaportFactory.reports.implementations.HealthHazardReport;
import java.util.ArrayList;
import java.util.List;

public class ReportFactory {
    private static final List<IReportCreator> reportCreators = new ArrayList<>();

    public static void registerReportCreator(IReportCreator reportCreator){
        reportCreators.add(reportCreator);
    }
    public static void registerNewReportType(Class<? extends IReportCreator> reportCreatorEnum){
        for(ReportType type : ReportType.values()){
            registerReportCreator(type);
        }
    }
    public static AbstractAirQualityReport createReport(double pm25Value) {
            for (IReportCreator creator : reportCreators ) {
                if (creator.isApplicable(pm25Value)) {
                    return creator.createReport(pm25Value);
                }
            }

        throw new IllegalArgumentException("No suitable report type for PM2.5 value: " + pm25Value);
    }
}
