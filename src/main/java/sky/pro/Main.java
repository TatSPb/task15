package sky.pro;

import java.util.Arrays;
import java.util.List;


/***
 * Необходимо реализовать следующий метод:
 * Получаем на входе массив чисел.
 * Все четные числа увеличиваем на единицу.
 * Возвращаем кусок списка с 3-го по 7-й элемент.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] array = {1,8,6,12,6,2,3,1,0};
        System.out.println("Массив на входе: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = array[i]+1;
            }
        }
        System.out.println("Все четные числа увеличены на единицу: " + Arrays.toString(array));\
        List<Integer> list  = Arrays.asList(array).subList(3,7+1);
        System.out.println("Возвращаем кусок списка с 3-го по 7-й элемент: " + list);
    }
}