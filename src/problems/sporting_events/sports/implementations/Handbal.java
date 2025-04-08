package problems.sporting_events.sports.implementations;

public class Handbal extends Sport{
    public Handbal(String name, String homeTeam, String awayTeam) {
        super(name, homeTeam, awayTeam);
    }

    @Override
    public String createFeed() {
        return "";
    }
}
