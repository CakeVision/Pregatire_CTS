package problems.sporting_events;

import problems.sporting_events.prototype.EventTransmission;
import problems.sporting_events.prototype.utils.Live;
import problems.sporting_events.prototype.utils.Platforms;
import problems.sporting_events.sports.ESportFactory;
import problems.sporting_events.sports.factories.AbstractSportTransmissionFactory;
import problems.sporting_events.sports.implementations.Baschet;
import problems.sporting_events.sports.implementations.Fotbal;
import problems.sporting_events.sports.implementations.Handbal;
import problems.sporting_events.sports.implementations.Sport;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args){
        Live event = new EventTransmission(Platforms.TV, "Football", "title", null);
        event.addComment("Nice game");

        Live ytEvent = event.clone();
        ytEvent.addComment("Better Game here");
        ytEvent.setPlatform(Platforms.YOUTUBE);
        ytEvent.setTitle("Hockey");
        Live twitchEvent = event.clone();
        twitchEvent.setPlatform(Platforms.TWITCH);

        event.startStream();
        ytEvent.startStream();
        twitchEvent.startStream();
        List<Live> transmissions = new ArrayList<>();

        transmissions.add(event);
        transmissions.add(ytEvent);
        transmissions.add(twitchEvent);

        List<Sport> sports = new ArrayList<Sport>();
        sports.add(new Fotbal(ESportFactory.FOTBAL.name(), "e1", "e2"));
        sports.add(new Baschet(ESportFactory.BASCHET.name(), "b1", "b2"));
        sports.add(new Handbal(ESportFactory.HANDBAL.name(), "h1", "h2"));


        for(Sport sport: sports){
            System.out.println(sport.getName());
            ESportFactory option = ESportFactory.fromString(sport.getName());
            AbstractSportTransmissionFactory currentFactory = option.createFactory();
            currentFactory.transmitSport(sport,transmissions);
        }
    }
}
