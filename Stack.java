//Выполнил студент группы 2А Иванов Данил

public class Stack<T> {
    private Node<T> top; // верхний элемент стека

    // Внутренний класс, представляющий узел стека
    private static class Node<T> {
        private T data; // данные узла
        private Node<T> next; // ссылка на следующий узел

        public Node(T data) {
            this.data = data;
        }
    }

    // Помещает элемент на вершину стека
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }

    // Удаляет и возвращает элемент с вершины стека
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    // Возвращает элемент с вершины стека без удаления
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return top.data;
    }

    // Проверяет, пуст ли стек
    public boolean isEmpty() {
        return top == null;
    }
}

//Пример использования стека:

Stack<Integer> stack = new Stack<>();
stack.push(10);
stack.push(20);
stack.push(30);

System.out.println(stack.pop()); // Выводит 30
System.out.println(stack.peek()); // Выводит 20
System.out.println(stack.isEmpty()); // Выводит false


