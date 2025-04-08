package problems.DroneConnections.services;

import problems.DroneConnections.interfaces.ServiceConnection;

public class GPSService implements ServiceConnection<String> {
    @Override
    public boolean connect() {
        return true;
    }

    @Override
    public String getServiceName() {
        return "GPS";
    }

    @Override
    public String getData() {
        return "Current Location";
    }
}
