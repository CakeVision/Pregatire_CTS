package problems.DroneConnections.reports.factory;

import problems.DroneConnections.reports.utils.FieldReport;
import problems.DroneConnections.reports.utils.ReportTypes;
import problems.DroneConnections.reports.implementations.EnemiesReport;
import problems.DroneConnections.reports.implementations.ServiceReport;
import problems.DroneConnections.reports.implementations.TopologyReport;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ReportFactory {
    private static final Map<ReportTypes, Supplier<? extends FieldReport>> factories = new HashMap<>();

    static {
        register(ReportTypes.INFO, TopologyReport::new);
        register(ReportTypes.WARNING, ServiceReport::new);
        register(ReportTypes.ALERT, EnemiesReport::new);
    }

    public static void register(ReportTypes type, Supplier<? extends FieldReport> factory){
        factories.put(type, factory);
    }

    public static FieldReport createReport(ReportTypes type){
        Supplier<? extends FieldReport> factory = factories.get(type);
        if(factory == null){
            throw new IllegalArgumentException("No factory for the given type");
        }
        return factory.get();
    }

}
