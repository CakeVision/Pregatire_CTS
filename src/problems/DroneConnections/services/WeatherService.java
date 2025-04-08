package problems.DroneConnections.services;

import problems.DroneConnections.ServiceConnection;

public class WeatherService implements ServiceConnection<String> {

    @Override
    public boolean connect() {
        return true;
    }

    @Override
    public String getServiceName() {
        return "Weather";
    }

    @Override
    public String getData() {
        return "The weather is:";
    }
}
