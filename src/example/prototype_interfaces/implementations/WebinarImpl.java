package example.prototype_interfaces.implementations;



import example.prototype_interfaces.IWebinar;
import example.prototype_interfaces.StreamTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WebinarImpl implements IWebinar {
    private StreamTypes streamType;
    private String title;
    private String description;
    private List<String> comments;

    public WebinarImpl(StreamTypes type, String title, String description, List<String> comments){
        this.streamType = type;
        this.title = title;
        this.description = description;
        if(comments == null){
            this.comments = new ArrayList<>();
        }
        else{
            this.comments = comments;
        }
    }
    public WebinarImpl(WebinarImpl source){
        this.streamType = source.streamType;
        this.title = source.title;
        this.description = source.description;
        this.comments = new ArrayList<>();
    }

    @Override
    public void setStreamType(StreamTypes streamType) {
        this.streamType = streamType;
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
    public List<String> getComments(){
        return this.comments;
    }

    @Override
    public void startStream() {
        System.out.println("Starting stream");
        System.out.println("Type: " + streamType);
        System.out.println("Has: \n" +
                "Title: " + title +
                "\nDesc: " + description
                +"\nComments: " + comments.stream().map(x -> x + ',').collect(Collectors.joining()));
    }

    @Override
    public IWebinar clone() {
        return new WebinarImpl(this);
    }
}
