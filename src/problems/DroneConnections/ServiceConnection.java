package problems.DroneConnections;

public interface ServiceConnection<T> {
    boolean connect();
    String getServiceName();
    T getData();
}
