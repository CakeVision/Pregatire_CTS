package example.prototype_interfaces;


public interface IWebinar extends Cloneable {
    void setStreamType(StreamTypes streamType);
    void setTitle(String attr );
    void setDescription(String attr);
    void addComment(String attr );
    void startStream();
    IWebinar clone();
}
