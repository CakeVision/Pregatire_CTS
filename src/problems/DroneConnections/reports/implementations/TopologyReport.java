package problems.DroneConnections.reports.implementations;

import problems.DroneConnections.interfaces.FieldReport;

public class TopologyReport implements FieldReport {
    @Override
    public void sendReport() {
        System.out.println("Sending topology data");
    }
}
