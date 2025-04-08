package problems.DroneConnections.demo;

import problems.DroneConnections.ServiceConnection;
import problems.DroneConnections.services.ServiceTypes;
import problems.DroneConnections.singleton.ConnectionRegistry;

import javax.sound.midi.SysexMessage;

public class Main {
    public static void main(String[] args){
        ConnectionRegistry.INSTANCE.addService(ServiceTypes.GPS);
        ConnectionRegistry.INSTANCE.addService(ServiceTypes.WEATHER);
        ConnectionRegistry.INSTANCE.addService(ServiceTypes.BASE);

        ServiceConnection<?> gpsService = ConnectionRegistry.INSTANCE.getService(ServiceTypes.GPS);
        ServiceConnection<?> gpsService1 = ConnectionRegistry.INSTANCE.getService(ServiceTypes.GPS);
        if(gpsService != null && gpsService1 != null){
            System.out.println("Gps Service var 1");
            System.out.println(gpsService.getServiceName());
            System.out.println(gpsService.hashCode());

            System.out.println("Gps Service var 2");
            System.out.println(gpsService1.getServiceName());
            System.out.println(gpsService1.hashCode());
        }

    }
}
