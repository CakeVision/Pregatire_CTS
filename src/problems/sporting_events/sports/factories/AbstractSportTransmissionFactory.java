package problems.sporting_events.sports.factories;

import problems.sporting_events.prototype.utils.Live;
import problems.sporting_events.sports.implementations.Sport;

import java.util.List;

public abstract class AbstractSportTransmissionFactory {
    public abstract Sport createSport(String name, String homeTeam, String awayTeam);
    public abstract Sport createSport(Sport sport);

    public void transmitSport(Sport sport, List<Live> trasmissions){
        System.out.println("Broadcasting sport: " + sport.getName());

        for(Live trasmission: trasmissions){
            trasmission.setFeed(sport.createFeed());
            trasmission.startStream();
        }
    }
}
