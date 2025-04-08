package example.prototype_interfaces.demo;

import example.prototype_interfaces.IWebinar;
import example.prototype_interfaces.StreamTypes;
import example.prototype_interfaces.implementations.WebinarImpl;

public class Main {
    public static void main(String[] args){
        IWebinar webinarTemp = new WebinarImpl(StreamTypes.Zoom, "hello1", "welcome to my crypto course", null);
        IWebinar webinarYoutube = webinarTemp.clone();
        webinarYoutube.setStreamType(StreamTypes.Youtube);
        webinarYoutube.addComment("hello there scammers");
        System.out.println("Stream init: " );
        webinarTemp.startStream();
        System.out.println("Stream yt: " );
        webinarYoutube.setTitle("welcome to yt");
        webinarYoutube.startStream();
    }
}
