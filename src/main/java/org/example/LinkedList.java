package org.example;

public class LinkedList {

    public static Node reverse(Node head){
        Node current = head;
        Node prev = null;
        Node tempNext = null;


        while(current != null){
            tempNext = current.next;    // Сохраняем ссылку на следующий узел
            current.next = prev;    // Разворачиваем ссылку текущего узла

            prev = current;// Сдвигаем prev на текущий узел

            current = tempNext;  // Переходим к следующему узлу

        }
        return prev; // Новый head списка
    }

    // Метод для вывода списка
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
