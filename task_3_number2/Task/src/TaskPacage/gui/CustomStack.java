package TaskPacage.gui;

public class CustomStack<T> implements SimpleStack<T>{
    private Node<T> top;
    private int count = 0;

    public CustomStack() {
        this.top = null;
    }

    public T push(T a) {
        top = new Node<T>(a, top);
        count++;
        return a;
    }

    public T pop() {
        if (top == null) {
            throw new RuntimeException("Стек пуст!!!");
        }
        T temp = top.data;
        top = top.link;
        count--;
        return temp;
    }

    public T peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            throw new RuntimeException("Стек пуст!!");
        }
    }

    @Override
    public int count() {
        return count;
    }

    private boolean isEmpty() {
        return top == null;
    }

    private static class Node<T> {
        Node<T> link;
        T data;

        public Node(T data, Node<T> link) {
            this.data = data;
            this.link = link;
        }
    }
}
