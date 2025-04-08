package example.prototype.implementations;

import example.prototype.BaseWebinar;
import example.prototype.Webinar;

import javax.sound.midi.SysexMessage;
import java.util.stream.Collectors;

public class YTWebinar extends BaseWebinar {
    private String channelId;

    public YTWebinar(){
        super();
    }

    private YTWebinar(YTWebinar source){
        super(source);
        this.channelId = source.channelId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    @Override
    public void startStream() {
        System.out.println("Starting youtube webinar: " + channelId );
        if(!comments.isEmpty()) System.out.println("Got comments: " + comments.stream().map(x -> x + ",").collect(Collectors.joining()));
        if(webinarContent != null && !webinarContent.isBlank()) System.out.println("got content" + webinarContent);
    }

    @Override
    public Webinar clone() {
        return new YTWebinar(this);
    }
}
