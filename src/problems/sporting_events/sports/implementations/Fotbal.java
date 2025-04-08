package problems.sporting_events.sports.implementations;

public class Fotbal extends Sport {

    public Fotbal(String name, String homeTeam, String awayTeam) {
        super(name, homeTeam, awayTeam);
    }
    public Fotbal(String name){
        super(name);
    }
    @Override
    public String createFeed() {
        return "";
    }
}
