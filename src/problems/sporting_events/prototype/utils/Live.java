package problems.sporting_events.prototype.utils;

public interface Live extends Cloneable, ITitle<String>,IComments<String> {
    Platforms getPlatform();
    void setPlatform(Platforms platform);
    public void setFeed(String feed);
    public String getFeed();
    public void startStream();
    Live clone();
}
