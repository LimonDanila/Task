package TaskPacage.gui;
import java.util.EmptyStackException;
import java.util.Stack;

public class JavaStackSimple<T> extends Stack<T> implements SimpleStack<T> {

    public int count() {
        return super.size();
    }
}
