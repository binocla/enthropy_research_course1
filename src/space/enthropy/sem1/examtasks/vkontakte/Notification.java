package space.enthropy.sem1.examtasks.vkontakte;

public interface Notification {
    default boolean sendMessage() {
        return false;
    }
    boolean likePhoto();
}
