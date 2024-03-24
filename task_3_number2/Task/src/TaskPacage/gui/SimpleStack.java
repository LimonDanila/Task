package TaskPacage.gui;

public interface SimpleStack<T> {
    T push(T value);

    T pop() throws Exception;

    T peek() throws Exception;

    int count();

    default boolean empty() {
        return count() == 0;
    }
}
