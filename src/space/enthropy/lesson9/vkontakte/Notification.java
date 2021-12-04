package space.enthropy.lesson9.vkontakte;

public interface Notification {
    default boolean sendMessage() {
        return false;
    }
    boolean likePhoto();
}
