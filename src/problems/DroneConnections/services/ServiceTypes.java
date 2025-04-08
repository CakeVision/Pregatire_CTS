package problems.DroneConnections.services;

import problems.DroneConnections.ServiceConnection;

import java.util.function.Supplier;

public enum ServiceTypes {
    BASE(ControlService::new),
    GPS(GPSService::new),
    WEATHER(WeatherService::new);


    private final Supplier<? extends ServiceConnection<?>> factory;

    <T> ServiceTypes(Supplier<? extends ServiceConnection<T>> factory) {
        this.factory = factory;
    }

    public <T> ServiceConnection<T> createConnection() {
        // This cast is safe because the enum constructor ensures type compatibility
        @SuppressWarnings("unchecked")
        ServiceConnection<T> connection = (ServiceConnection<T>) factory.get();
        return connection;
    }
}
