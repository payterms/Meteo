package Algorythms;

public class TestArray {
    private int[] arr;
    private int size;

    public TestArray(int size) {
        this.size = 0;
        this.arr = new int[size];
    }


    public static void insertionSort(int[] array, int start, int finish) {
        int tmp;
        for (int i = start; i < finish; i++)
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) // пока j>0 и элемент j-1 > j, x-массив int
            {
                // меняем местами элементы j и j-1
                tmp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = tmp;

            }

    }


    public static void bubbleSort(int[] array, int start, int end) {
        int er;
        while (true) {
            er = 0;
            for (int j = start; j < end; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    er++;
                }
            }
            if (er == 0) break;
            end--;
        }
    }


}

