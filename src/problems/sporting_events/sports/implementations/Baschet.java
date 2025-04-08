package problems.sporting_events.sports.implementations;

public class Baschet extends Sport {

    public Baschet(String name, String homeTeam, String awayTeam) {
        super(name, homeTeam, awayTeam);
    }

    public Baschet(String name) {
        super(name);
    }

    @Override
    public String createFeed() {
        return "";
    }
}
