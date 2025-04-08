package problems.DroneConnections.reports.implementations;

import problems.DroneConnections.interfaces.FieldReport;

public class ServiceReport implements FieldReport {

    @Override
    public void sendReport() {
        System.out.println("Sending self diagnosis");
    }
}
