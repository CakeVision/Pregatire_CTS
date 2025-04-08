package example.prototype;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseWebinar implements Webinar {
    protected String title;
    protected String description;
    protected List<String> comments;
    protected String webinarContent;

    public BaseWebinar(){
        this.comments = new ArrayList<>();
    }

    protected BaseWebinar(BaseWebinar source){
        this.title = source.title;
        this.description = source.description;
        this.comments = new ArrayList<>(source.comments);
        this.webinarContent = source.webinarContent;
    }
    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setDescription(String desc) {
        this.description = desc;
    }

    @Override
    public void addComment(String comment) {
        this.comments.add(comment);
    }

    @Override
    public abstract void startStream();

    public abstract Webinar clone();

}
