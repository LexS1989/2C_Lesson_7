package ru.skypro;

import java.util.*;

public class Main {

    public static void printSeparator(String string) {
        System.out.println("===============");
        System.out.println(string);
    }

    public static void printingOddValues(List<Integer> list) {
        List<Integer> listNew = new ArrayList<>();
        for (Integer integer : list) {
            if (integer % 2 != 0) {
                listNew.add(integer);
            }
        }
        System.out.println(listNew);
    }

    public static void printEvenValuesInAscendingOrder(List<Integer> list) {
        Set<Integer> s = new HashSet<>(list);
        List<Integer> d = new ArrayList<>(s);
        List<Integer> afterRemoveDoubleList = new ArrayList<>();
        for (Integer integer : d) {
            if (integer % 2 == 0) {
                afterRemoveDoubleList.add(integer);
            }
        }
        Collections.sort(afterRemoveDoubleList);
        System.out.println(afterRemoveDoubleList);
    }

    public static List<String> listNoDuplicates(List<String> list) {
        Set<String> uniqueWords = new HashSet<>(list);
        return new ArrayList<>(uniqueWords);
    }

    public static void printNumberOfDuplicates(List<String> list) {
        List<String> listNew = new ArrayList<>(listNoDuplicates(list));
        for (String word : listNew) {
            int count = Collections.frequency(list, word);
            if (count > 1) {
                System.out.println("Слово " + "\"" + word + "\"" + " повторяется " + count + " раз.");
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 6, 7, 31, 31, 30, 30, 28, 100, 29, 29, 1, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> nums1 = new ArrayList<>(List.of(32, 31, 31, 30, 30, 29, 29, 1, 1, 2, 100, 100, 7, 28, 27, 27, 26, 25, 25));
        List<String> words = new ArrayList<>(List.of("раз", "два", "два", "три", "три", "три",
                "четыре", "четыре", "четыре", "пять", "шесть", "шесть", "шесть", "шесть", "шесть"));

        printSeparator("Задание №1");
        printingOddValues(nums1);
        printSeparator("Задание №2");
        printEvenValuesInAscendingOrder(nums);
        printSeparator("Задание №3");
        System.out.println(listNoDuplicates(words));
        printSeparator("Задание №4");
        printNumberOfDuplicates(words);

    }
}
