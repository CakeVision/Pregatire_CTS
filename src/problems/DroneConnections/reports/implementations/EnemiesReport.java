package problems.DroneConnections.reports.implementations;

import problems.DroneConnections.interfaces.FieldReport;

public class EnemiesReport implements FieldReport {

    @Override
    public void sendReport() {
        System.out.println("Sending detected enemies report");
    }
}
