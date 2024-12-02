package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        reverseWithNewArray(inputArr);
        System.out.println(findFirsUnique(inputStr));
//        Node node1 = new Node("5", null);
//        Node node2 = new Node("4", node1);
//        Node node3 = new Node("6", node2);
//
//
//        // Указываем голову списка
//        Node head = node3;
//
//
//        // Выводим исходный список
//        System.out.println("Исходный список:");
//        LinkedList.printList(head);
//
//        // Разворачиваем список
//        head = LinkedList.reverse(head);
//
//        // Выводим перевёрнутый список
//        System.out.println("Перевёрнутый список:");
//        LinkedList.printList(head);

    }

    static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    public static void reverseArray(int[] array) {
        int[] nextArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            nextArray[i] = array[array.length - i - 1];
        }
        for (int n : nextArray) {
            System.out.println(n);
        }
    }


    public static void revArr(int[] input) {
        for (int i = 0; i < input.length / 2; i++) {
            int temp = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }
    }

    public static void reverseArrayInCurrentArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;

        }
        for (int n : array) {
            System.out.println(n);
        }
    }

//    Node node1 = new Node("5", null);
//    Node node2 = new Node("4", node1);
//    Node node3 = new Node("6", node2);
//
//
//
//    // Указываем голову списка
//    Node head = node3;
//
//
//    // Выводим исходный список
////        System.out.println("Исходный список:");
////        LinkedList.printList(head);
////
////    // Разворачиваем список
////    head = LinkedListUtils.reverse(head);
////
////    // Выводим перевёрнутый список
////        System.out.println("Перевёрнутый список:");
////        LinkedListUtils.printList(head);
////
//


    static int[] inputArr = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    private static void reverseArrayOneMoreTime(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }
        for (int n : arr) {
            System.out.println(n);
        }

    }


    private static void reverseWithNewArray(int[] arr) {
        int[] resultedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            resultedArr[i] = arr[arr.length - 1 - i];
        }

        for (int n : resultedArr) {
            System.out.println(n);
        }
    }


//    Задача 1: Массивы (Arrays)
//    Написать метод, который принимает массив целых чисел и возвращает сумму всех элементов массива.

    static int[] inputArray = {5, 22, 1111, 888, 66};

    private static int sumArray(int[] input) {
        if (input == null || input.length == 0) {
            return 0;
        }
        return Arrays.stream(input).sum();
    }

    //    Задача 2: Строки (Strings)
//    Создать функцию, которая принимает строку и возвращает её в обратном порядке.
    static String inputString = "String to reverse!";

    private static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string must not be empty or null");
        }
        return new StringBuilder(str).reverse().toString();
    }


    private static String reverseString2(String inputString) {
        char[] chars = inputString.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char tmp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = tmp;

        }
        return new String(chars);
    }


//    Задача 3: Списки (Lists)
//    Разработать метод, который принимает список целых чисел и удаляет из него все четные числа.

    static ArrayList<Integer> inputList = new ArrayList<>(List.of(44, 33, 1, 3, 4, 55, 6));

    private static List<Integer> removeEvenFromList(ArrayList<Integer> input) {
        if (input == null) {
            throw new IllegalArgumentException("Input list must not be empty");
        }
//        for (int i = 0; i < input.size(); i++) {
//            if (input.get(i) % 2 == 0) {
//                input.remove(i);
//                i--;
//            }
//        }
//        return input;
        input.removeIf(x -> x % 2 == 0);
        return input;
    }


    //    Задача 4: Стеки (Stacks)
//    Написать функцию, использующую стек для проверки правильности последовательности скобок в строке (например, "([]{})" является правильной, а "([)]" — нет).
    static String brackets = "([]{})";

    private static boolean isBracketsValid(String input) {
        Stack<Character> stack = new Stack<>();
        char[] chars = input.toCharArray();
        for (char ch : chars) {
            if (ch == '[' || ch == '(' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return true;
    }
//
//    Задача 1: Перевернуть коллекцию
//    Разработать функцию, которая принимает коллекцию элементов и возвращает её в обратном порядке. Определите, какой тип коллекции обеспечит наиболее эффективное выполнение этой задачи.

    static ArrayList<Integer> arr = new ArrayList<>(List.of(444, 5, 6));

    private static List<Integer> reverseCollection(ArrayList<Integer> list) {
//        return list.reversed();
        Collections.reverse(list);
        return list;
    }

    //    Задача 2: Поиск пары чисел
//    Написать метод, который ищет два числа в коллекции, сумма которых равна заданному значению. Определите, какая структура данных лучше всего подойдёт для быстрого поиска.
    static int[] input = {77, 99, 2, 7, 11, 5};

    private static int[] twoSum(int[] input, int target) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] + input[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("There is no correct data");
    }

    static int[] myArray = {2, 1, 7, 8};

    private static int[] twoSumHashMap(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            map.put(array[i], i);
        }
        for (int i = 0; i < array.length; i++) {
            int complement = array[i] - target;
            if (map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            }
        }
        return new int[]{};
    }


//    Задача 3: Удаление дубликатов
//    Создать функцию, которая очищает коллекцию от дублирующихся элементов. Выберите и обоснуйте использование конкретной структуры данных для этой операции.


    static List<String> listWithDuplicates = List.of("apple", "kiwi", "Apple", "orange", "banana", "apple");

    private static void removeDuplicates(List<String> input) {
        Set<String> set = new LinkedHashSet<>(input.stream().map(x -> x.toLowerCase()).collect(Collectors.toSet()));
        for (String s : set) {
            System.out.println(s);
        }
    }

//    Задача 4: Первый уникальный символ
//    Разработать метод, который возвращает первый уникальный символ в тексте. Какую структуру данных использовать для оптимизации поиска?

    static String inputStr = "Love";

    private static char findFirsUnique(String s) {
        char[] letters = s.toLowerCase().replace(" ", "").toCharArray();

        Map<Character, Integer> lettersMap = new LinkedHashMap<>();

        for (char ch : letters) {
            if (!lettersMap.containsKey(ch)) {
                lettersMap.put(ch, 1);
            } else {
                lettersMap.put(ch, lettersMap.get(ch) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : lettersMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0';
    }
}