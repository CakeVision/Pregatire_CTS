package problems.sporting_events.prototype;

import problems.sporting_events.prototype.utils.Live;
import problems.sporting_events.prototype.utils.Platforms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EventTransmission implements Live {
    private Platforms platform;
    private String feed;
    private String title;
    private List<String> comments;

    public EventTransmission(Platforms platform,String feed,String  title, List<String> comments){
        this.platform = platform;
        this.feed = feed;
        this.title = title;
        if(comments != null){
            this.comments = comments;
        }
        this.comments = new ArrayList<>();
    }

    public EventTransmission(EventTransmission other){
        this.platform = other.platform;
        this.feed = other.feed;
        this.title = other.title;
        this.comments = new ArrayList<>();
    }

    @Override
    public void setFeed(String feed) {
        this.feed = feed;
    }

    @Override
    public String getFeed() {
        //would be an api call
        return feed;
    }

    public Platforms getPlatform() {
        return platform;
    }

    public void setPlatform(Platforms platform) {
        this.platform = platform;
    }
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public List<String> getComments() {
        return comments;
    }
    @Override
    public void addComment(String comment){
        this.comments.add(comment);
    }
    @Override
    public void resetComments(){
        this.comments = new ArrayList<>();
    }

    @Override
    public void startStream() {
        System.out.println("Starting stream on " + this.platform +
                            "\nWe have the title: " + this.title +
                            "\n And the comments: " + this.comments.stream().map(x -> "\n" + x).collect(Collectors.joining()));

    }

    @Override
    public Live clone() {
        return (Live) new EventTransmission(this);
    }
}
