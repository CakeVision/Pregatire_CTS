package problems.DroneConnections.singleton;

import problems.DroneConnections.ServiceConnection;
import problems.DroneConnections.services.ServiceTypes;

import java.util.HashMap;

public enum ConnectionRegistry {
    INSTANCE;

    public final HashMap<ServiceTypes, ServiceConnection<?>> connections = new HashMap<>();

    public void addService(ServiceTypes type){
        ServiceConnection<?> connection = connections.get(type);
        if(connection == null){
            connection = type.createConnection();
            connections.put(type, connection);
        }
    }
    public ServiceConnection<?> getService(ServiceTypes type){
        ServiceConnection<?> connection;
        for(ServiceTypes options: ServiceTypes.values()){
            if(type.equals(options) && (connection = connections.get(type)) != null){
                return connection;
            }
        }
        return null;
    }

}
