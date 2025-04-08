package problems.DroneConnections.reports.implementations;

import problems.DroneConnections.reports.utils.FieldReport;

public class ServiceReport implements FieldReport {

    @Override
    public void sendReport() {
        System.out.println("Sending self diagnosis");
    }
}
