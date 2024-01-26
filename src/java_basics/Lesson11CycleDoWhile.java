package java_basics;

/**
 * @author Maxim Urusov
 * @see <a href="https://vk.com/video-221759623_456239063">
 * 11 Урок - цикл do while</a>
 */
public class Lesson11CycleDoWhile {

    public static void main(String[] args) {
        doWhileLoop();
    }

    public static void doWhileLoop() {
        byte kilometres = 3; // попробуйте сменить на 0 и запустить
        do {
            System.out.println("Осталось до финиша: " + kilometres + "км.");
            kilometres--;
        } while (kilometres >= 0);
    }
}