package java_basics;

/**
 * @author Maksim Urusov
 */
public class Lesson8CycleForEach {

    public static void main(String[] args) {
        forEach();
    }

    public static void forEach() {
        System.out.println("Говорит цикл For Each в Java:");
        byte[] numbers = {11, 22, 33}; //измените значение чтобы проверить работу цикла
        byte counter = 1;
        for (byte i : numbers) {
            System.out.println(counter + "элемент массива = " + i);
            counter++;
        }
    }
}