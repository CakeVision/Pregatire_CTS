package problems.DroneConnections.reports.implementations;

import problems.DroneConnections.reports.utils.FieldReport;

public class WeatherReport implements FieldReport {

    @Override
    public void sendReport() {
        System.out.println("Sending weather report");
    }
}
