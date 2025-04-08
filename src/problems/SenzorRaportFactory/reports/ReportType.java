package problems.SenzorRaportFactory.reports;

import problems.SenzorRaportFactory.reports.implementations.AirWarningReport;
import problems.SenzorRaportFactory.reports.implementations.CleanAirReport;
import problems.SenzorRaportFactory.reports.implementations.HealthHazardReport;

public enum ReportType implements IReportCreator {
        CLEAN_AIR(0, 30) {
            @Override
            public AbstractAirQualityReport createReport(double pm25Value) {
                return new CleanAirReport(pm25Value);
            }
        },

        WARNING(31, 70) {
            @Override
            public AbstractAirQualityReport createReport(double pm25Value) {
                return new AirWarningReport(pm25Value);
            }
        },

        HEALTH_RISK(71, Integer.MAX_VALUE) {
            @Override
            public AbstractAirQualityReport createReport(double pm25Value) {
                return new HealthHazardReport(pm25Value);
            }
        };

        private final int minValue;
        private final int maxValue;

        ReportType(int minValue, int maxValue) {
            this.minValue = minValue;
            this.maxValue = maxValue;
        }

        public boolean isApplicable(double pm25Value) {
            return pm25Value >= minValue && pm25Value <= maxValue;
        }

        public abstract AbstractAirQualityReport createReport(double pm25Value);
}
