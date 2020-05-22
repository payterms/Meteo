package Algorythms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {
    private static final int CAPACITY = 8;
    private static final String message2Reverse = "АБЫРВАЛГ";

    public static void main(String[] args) {

        Random random = new Random();

        int ARR_SIZE = 100_000;

        long before;
        long after;
        long time;
        int[] array = new int[ARR_SIZE];


        for (int i = 0; i < ARR_SIZE; i++) {
            array[i] = random.nextInt();
        }
        //Разработать и написать на Java алгоритм сортировки методом вставки (поиском максимума или минимума).
        // сложность алгоритма. O(n^2)
        before = System.currentTimeMillis();
        Algorythms.TestArray.insertionSort(array, 0, ARR_SIZE - 1);
        after = System.currentTimeMillis();
        time = after - before;

        System.out.println(" Время сортировки insertionSort :" + time + " ms");
        // 2. Разработать и написать на Java алгоритм вычисления чисел Фибоначчи.
        // сложность алгоритма cycleFibo O(N).

        long fibo;
        before = System.currentTimeMillis();
        // Демонстрация плохого применения рекурсии. Очень долго вычисляет!
        fibo = recursiveFibo(50);
        after = System.currentTimeMillis();
        time = after - before;

        System.out.println("\n Время recursiveFibo:" + time + " ms" + " val:" + fibo);

        before = System.currentTimeMillis();
        fibo = cycleFibo(50);
        after = System.currentTimeMillis();
        time = after - before;

        System.out.println("\n Время cycleFibo:" + time + " ms" + " val:" + fibo);

        //Разработать и написать двунаправленный связанный список (у которого есть ссылка не только на следующий элемент, но и на предыдущий)
        testMyLinkedList();

        // Разработать и написать на Java алгоритм вычисления простых чисел до 100 (например, с помощью решета Эратосфена).
        List<Integer> list = getNPrimes(100);
        System.out.println("\n" + list);
    }

    static long recursiveFibo(int n) {
        if (n < 3) {
            return 1;
        }
        return recursiveFibo(n - 2) + recursiveFibo(n - 1);
    }


    static long cycleFibo(int n) {
        long a = 1;
        long b = 1;

        for (int i = 3; i <= n; i++) {
            b = b + a;
            a = b - a;
        }
        return b;
    }

    private static void testMyLinkedList() {
        MyLinkedList<Character> linkedList = new MyLinkedList<>();

        for (int i = 0; i < CAPACITY; i++) {
            linkedList.insertLast(message2Reverse.charAt(i));
        }
        linkedList.insertLast('Ы');
        System.out.println(linkedList);

        for (Character character : linkedList) {
            System.out.print(character + " ");
        }

        Iterator<Character> iter = linkedList.iterator();
        while (iter.hasNext()) {
            if (iter.next() == 'Ы') {
                iter.remove();
            }
        }

        System.out.println();

        for (Character s : linkedList) {
            System.out.print(s + " ");
        }

    }

    private static List<Integer> getNPrimes(int max) {
        List<Integer> primes = new ArrayList<>();
        if (max > 0) {
            primes.add(2);
        }
        for (int i = 3; i <= max; i += 2) {
            if (isPrime(i, primes)) {
                primes.add(i);
            }
        }
        return primes;
    }

    private static boolean isPrime(int n, List<Integer> primes) {
        double sqrt = Math.sqrt(n);
        for (int prime : primes) {
            if (prime > sqrt) {
                return true;
            }
            if (n % prime == 0) {
                return false;
            }
        }
        return true;
    }
}
