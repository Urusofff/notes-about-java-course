package java_basics;

/**
 * @author Maksim Urusov
 */
public class Lesson9CycleFor {

    public static void main(String[] args) {
        classicFor();
    }

    public static void classicFor() {
        System.out.println("Говорит классический цикл For в Java:");
        byte kilometres = 3; //измените значение чтобы проверить работу цикла
        for (byte i = 1; i <= kilometres; i++) {
            System.out.println("Проехал " + i + " км.");
        }
    }
}