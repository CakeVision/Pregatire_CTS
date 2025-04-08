package example.prototype;

import example.prototype.implementations.YTWebinar;
import example.prototype.implementations.ZoomWebinar;
import example.prototype.registry.WebinarRegistry;

public class Client {
    public static WebinarRegistry createWebinarRegistry(){
        WebinarRegistry registry = new WebinarRegistry();

        YTWebinar youtubePrototype = new YTWebinar();
        youtubePrototype.setDescription("Common webinar content about Java design patterns");
        youtubePrototype.setChannelId("@agoodchannel");
        registry.registerWebinar("youtube", youtubePrototype);

        ZoomWebinar zoomWebinar = new ZoomWebinar();
        zoomWebinar.setDescription("Common webinar content about Java design patterns");
        zoomWebinar.setMeetingId("ont-123-h21");
        registry.registerWebinar("zoom", zoomWebinar);

        return registry;
    }
}
