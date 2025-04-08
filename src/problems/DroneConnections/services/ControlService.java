package problems.DroneConnections.services;

import problems.DroneConnections.ServiceConnection;

public class ControlService implements ServiceConnection<String> {

    @Override
    public boolean connect() {
        return true;
    }

    @Override
    public String getServiceName() {
        return "Control Service";
    }

    @Override
    public String getData() {
        return "Hello from base";
    }
}
