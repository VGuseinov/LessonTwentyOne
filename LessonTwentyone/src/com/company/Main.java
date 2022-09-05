package com.company;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Коллекции
        // интефейс Collection:
        // List (итерфейс) -> ArrayList, LinkedList
        // Set (итерфейс) -> HashSet
        // Queue (интерфейс)
        // Stack (класс)
        // интерфейс Map:
        // HashMap, SortedMap
        ArrayList<Integer> arrayList = new ArrayList<>();
        // ArrayList хранит элементы в виде массива
        // добааление элементов
        arrayList.add(12); // добавляет элемент в конец списка
        arrayList.add(43);
        arrayList.add(67);
        arrayList.add(12);
        arrayList.add(71);
        arrayList.add(98);
        arrayList.add(150);
        arrayList.add(1, 71);
        System.out.println(arrayList);
        // если индекс элемента который нужно добавитьб
        // оказался больше кол-ва элементов коллекции
        // то произойдет exception

        // получение элемента
        int elem = arrayList.get(2); // для дальнейшей работы с эелементом
        System.out.println(arrayList.get(2));
        arrayList.set(2, 34);
        System.out.println(arrayList.get(2));

        // удаление элемента
        arrayList.remove(2); // удаление по индексу
        System.out.println(arrayList);
        arrayList.remove(new Integer(67)); // удаление по значению
        System.out.println(arrayList);
        // arrayList.clear(); // удаляет все элементы из коллекции
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(12);
        arrayList1.add(71);
        arrayList.removeAll(arrayList1);
        System.out.println(arrayList);

        // получить текущее кол-во элементов
        System.out.println(arrayList1.size());

        // итерирование по коллекции
        for (int e : arrayList) {}

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        // toArray возвращает элементы коллекции в виде массива
        Object items = arrayList.toArray();
        Integer []arrItems = new Integer[arrayList.size()];
        arrayList.toArray(arrItems);
        for (int e : arrItems) {
            System.out.println(e);
        }

        // предварительное выделение памяти
        arrayList.ensureCapacity(4);
        ArrayList<Integer> arrayList2 = new ArrayList<>(12);

        // LinkedList == ArrayList (кроме capacity)

//        System.out.println("ArrayList");
//        addToBegin(new ArrayList<>());
//        addToEnd(new ArrayList<>());
//        addToMiddle(new ArrayList<>());
//
//        System.out.println("ArrayList with capacity = 200000");
//        addToBegin(new ArrayList<>(200000));
//        addToEnd(new ArrayList<>(200000));
//        addToMiddle(new ArrayList<>(200000));
//
//        System.out.println("LinkedList");
//        addToBegin(new LinkedList<>());
//        addToEnd(new LinkedList<>());
//        addToMiddle(new LinkedList<>());

        // Queue (очередь)
        // FIFO (first in, first out)
        // первым прищел, первым вышел

        // Stack (стэк)
        // LIFO (last in. first out)
        // последним пришел, первым ушел

        Stack<String> stack = new Stack<>();
        stack.push("hello"); // добавляет элемент в топ стэка
        stack.push("let's go");
        stack.push("goodbye");
        System.out.println(stack.peek()); // peek возвращает верхний элемент стэка
        // без его удаления
        System.out.println(stack.pop()); // pop возвращает верхний элемент стэка
        // и удаляет его
        System.out.println(stack);

        ArrayQueue<Integer> aq = new ArrayQueue<>(67);
        aq.add(100); // добавляет элемент в конец очереди
        aq.add(200);
        aq.add(300);
    }

    public static void addToBegin(List<Integer> list) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }
        long dt = System.currentTimeMillis() - time;
        System.out.printf("Добавление в начало: %d мс\n", dt);
    }

    public static void addToEnd(List<Integer> list) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long dt = System.currentTimeMillis() - time;
        System.out.printf("Добавление в конец: %d мс\n", dt);
    }

    public static void addToMiddle(List<Integer> list) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(list.size() / 2, i);
        }
        long dt = System.currentTimeMillis() - time;
        System.out.printf("Добавление в середину: %d мс\n", dt);
    }

}
