package problems.sporting_events.prototype.utils;

import java.util.List;

public interface IComments<T> {
    List<T> getComments();
    void resetComments();
    void addComment(T comment);
}
