package Sem_3;

import java.util.ArrayList;
import java.util.Random;


import static java.util.Collections.max;
import static java.util.Collections.min;

public class Main3 {
    public static void main(String[] args){
        task100();
        task200();
        task300();
    }

/** Task 1
 * Реализовать алгоритм сортировки слиянием
 */

    public static void task100(){
        System.out.println("\nTask 1\n");
        int[] actual = { 5, 1, 6, 2, 7, 4 };
        ArrayList<Integer> list0 = new ArrayList<>();
        for (int o: actual) {
            list0.add(o);
        }
        System.out.println(list0);

        mergeSort(actual, actual.length);
        ArrayList<Integer> list01 = new ArrayList<>();
        for (int o: actual) {
            list01.add(o);
        }
        System.out.println(list01);
    }
    public static void mergeSort (int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = a[i];
        }
        mergeSort(left, mid);
        mergeSort(right, n - mid);

        merge(a, left, right, mid, n - mid);
    }
    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    /** Task 2
     * Пусть дан произвольный список целых чисел, удалить из него четные числа
     */

    public static void task200(){
        System.out.println("\nTask 2\n");
        Random dom = new Random();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int val = dom.nextInt(-100, 100);
            list1.add(val);
        }
        System.out.printf("Изначальный список %s\n", list1);
        int i = 0;
        while (i < list1.size()) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.printf("Список без четных чисел %s", list1);
    }

    /** Task 3
     * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
     */

    public static void task300(){
        System.out.println("\n\nTask 3\n");
        Random rnd = new Random();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            list2.add(val);
        }
        System.out.printf("Исходный список %s\n", list2);
        int max = max(list2);
        int min = min(list2);
        int maxItem = list2.get(0);
        int minItem = list2.get(0);
        int sumItems = 0;
        for (int item : list2) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
            sumItems += item;
        }
        float average = (float)sumItems/list2.size();
        System.out.printf("Максимальный элемент при помощи max %s\n", max);
        System.out.printf("Максимальный элемент %s\n", maxItem);
        System.out.printf("Минимальный элемент при помощи min %s\n", min);
        System.out.printf("Минимальный элемент %s\n", minItem);
        System.out.printf("Среднее арифметическое %s\n", average);
    }
}
