package problems.DroneConnections.interfaces;

public interface ServiceConnection<T> {
    boolean connect();
    String getServiceName();
    T getData();
}
