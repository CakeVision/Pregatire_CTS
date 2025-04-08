package example.prototype;

public interface Webinar {
    void setTitle(String title);
    void setDescription(String desc);
    //TODO: add comment class
    void addComment(String comment);
    void startStream();
    Webinar clone();

}
