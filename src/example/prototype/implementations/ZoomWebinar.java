package example.prototype.implementations;

import example.prototype.BaseWebinar;
import example.prototype.Webinar;

import java.util.stream.Collectors;

public class ZoomWebinar extends BaseWebinar {
    private String meetingId;

    public ZoomWebinar(){
        super();
    }

    private ZoomWebinar(ZoomWebinar source){
        super(source);
        this.meetingId = source.meetingId;
    }

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    @Override
    public void startStream() {
        System.out.println("Starting youtube webinar: " + meetingId );
        if(!comments.isEmpty()) System.out.println("Got comments: " + comments.stream().map(x -> x + ",").collect(Collectors.joining()));
        if(webinarContent !=null && !webinarContent.isBlank()) System.out.println("got content" + webinarContent);
    }

    @Override
    public Webinar clone() {
        return new ZoomWebinar(this);
    }
}
