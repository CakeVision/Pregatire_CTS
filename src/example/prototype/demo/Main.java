package example.prototype.demo;

import example.prototype.Client;
import example.prototype.Webinar;
import example.prototype.registry.WebinarRegistry;

public class Main {
    public static void main(String[] args){
        WebinarRegistry registry = Client.createWebinarRegistry();

        Webinar ytWebinar = registry.getWebinar("youtube");
        ytWebinar.setTitle("My awesome new crypto investment");
        ytWebinar.addComment("Awesome, help me lose my money faster");

        Webinar zoomWebinar = registry.getWebinar("zoom");
        zoomWebinar.setTitle("How to touch grass");
        zoomWebinar.addComment("What is grass?");

        ytWebinar.startStream();
        zoomWebinar.startStream();
    }
}
