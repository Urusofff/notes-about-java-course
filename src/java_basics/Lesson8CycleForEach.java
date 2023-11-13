package java_basics;

/**
 * @author Maxim Urusov
 * @see <a href="https://vk.com/video-221759623_456239033">
 * 8 Урок - цикл for each</a>
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