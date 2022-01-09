package space.enthropy.examtasks.vkontakte;

public interface Notification {
    default boolean sendMessage() {
        return false;
    }
    boolean likePhoto();
}
