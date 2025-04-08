package example.prototype.registry;

import example.prototype.Webinar;

import java.util.HashMap;
import java.util.Map;

public class WebinarRegistry {
    private Map<String, Webinar> webinarPrototypes = new HashMap<>();

    public void registerWebinar(String name, Webinar webinar){
        webinarPrototypes.put(name, webinar);
    }
    public Webinar getWebinar(String name){
        Webinar webinar = webinarPrototypes.get(name);
        if(webinar == null) {
            throw new IllegalArgumentException("webinar with name: " + name + "not defined");
        }
        return webinar.clone();
    }
}
