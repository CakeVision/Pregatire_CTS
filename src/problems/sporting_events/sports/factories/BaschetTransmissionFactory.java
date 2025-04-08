package problems.sporting_events.sports.factories;

import problems.sporting_events.sports.implementations.Baschet;
import problems.sporting_events.sports.implementations.Sport;

public class BaschetTransmissionFactory extends AbstractSportTransmissionFactory{
    @Override
    public Sport createSport(String name, String homeTeam, String awayTeam) {
        return new Baschet(name, homeTeam, awayTeam);

    }

    @Override
    public Sport createSport(Sport sport) {
        return new Baschet(sport.getName(), sport.getHomeTeam(), sport.getAwayTeam());
    }
}
