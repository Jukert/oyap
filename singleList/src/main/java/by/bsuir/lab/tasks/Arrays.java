package by.bsuir.lab.tasks;

import java.util.Comparator;

public class Arrays {

    public static  <E> void sort(E[] array, Comparator<? super E> c) {
        E temp = null;
        for (int x = 1; x < array.length; x++) {
            for (int y = 0; y < array.length - x; y++) {
                if (c.compare(array[y], array[y + 1]) > 0) {
                    temp = array[y];
                    array[y] = array[y + 1];
                    array[y + 1] = temp;
                }
            }
        }

    }

}
