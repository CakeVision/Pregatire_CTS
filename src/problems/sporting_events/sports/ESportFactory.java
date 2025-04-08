package problems.sporting_events.sports;

import problems.sporting_events.sports.factories.AbstractSportTransmissionFactory;
import problems.sporting_events.sports.factories.BaschetTransmissionFactory;
import problems.sporting_events.sports.factories.FotbalTransmissionFactory;
import problems.sporting_events.sports.factories.HandbalTransmissionFactory;

import java.util.function.Supplier;

public enum ESportFactory {
    FOTBAL("FOTBAL", FotbalTransmissionFactory::new),
    BASCHET("BASCHET", BaschetTransmissionFactory::new),
    HANDBAL("HANDBAL", HandbalTransmissionFactory::new);

    private final String name;
    private final Supplier<? extends AbstractSportTransmissionFactory> factory;

    ESportFactory(String name, Supplier<? extends AbstractSportTransmissionFactory> factory){
        this.name = name;
        this.factory = factory;
    }

    public AbstractSportTransmissionFactory createFactory(){
        return factory.get();
    }

    public static ESportFactory fromString(String sport){
        for(ESportFactory sport_option : ESportFactory.values()){
            if(sport_option.name.equals(sport)){
                return sport_option;
            }
        }
        return null;
    }
}
