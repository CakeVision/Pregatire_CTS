package problems.sporting_events.sports.implementations;

public abstract class Sport {
    private String name;
    private String homeTeam;
    private String awayTeam;

    public Sport(String name, String homeTeam, String awayTeam) {
        this.name = name;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public Sport(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public abstract String createFeed();
}
