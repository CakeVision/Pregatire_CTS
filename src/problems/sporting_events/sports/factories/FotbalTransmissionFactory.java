package problems.sporting_events.sports.factories;

import problems.sporting_events.sports.implementations.Fotbal;
import problems.sporting_events.sports.implementations.Sport;

public class FotbalTransmissionFactory extends AbstractSportTransmissionFactory{
    @Override
    public Sport createSport(String name, String homeTeam, String awayTeam) {
        return new Fotbal(name, homeTeam, awayTeam);
    }

    @Override
    public Sport createSport(Sport sport) {
        return new Fotbal(sport.getName(), sport.getHomeTeam(), sport.getAwayTeam());
    }
}
