package problems.DroneConnections.reports.implementations;

import problems.DroneConnections.reports.utils.FieldReport;

public class EnemiesReport implements FieldReport {

    @Override
    public void sendReport() {
        System.out.println("Sending detected enemies report");
    }
}
