package java_basics;

import java.util.Arrays;

/**
 * @author Maxim Urusov
 * @see <a href="https://vk.com/video-221759623_456239059">
 * 7 Урок - массивы</a>
 */
public class Lesson7Arrays {

    public static void main(String[] args) {
        arrayInitInCreation();
//        arrayInitByIndex();
    }

    public static void arrayInitInCreation() {
        byte[] numbers  = {1, 2, 3}; //добавьте/удалите цифры для изменения массива
        printArrayInfo(numbers);
    }

    private static void printArrayInfo(byte[] numbers) {
        System.out.println("Вся начинка массива - " + Arrays.toString(numbers));
        System.out.println("Первый элемент массива - " + numbers[0]);
        System.out.println("Длина массива - " + numbers.length);
    }

    public static void arrayInitByIndex() {
        byte[] numbers = new byte[3]; //измените размер массива
        numbers[0] = 1; //добавьте/удалите инициализацию массива под размер
        numbers[1] = 2;
        numbers[2] = 3;
        printArrayInfo(numbers);
    }
}