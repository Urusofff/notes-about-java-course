package java_basics;

/**
 * @author Maxim Urusov
 * @see <a href="https://vk.com/video-221759623_456239062">
 * 10 Урок - цикл while</a>
 */
public class Lesson10CycleWhile {

    public static void main(String[] args) {
        whileLoop();
    }

    public static void whileLoop() {
        byte kilometres = 3;
//        while (true) { // true для бесконечного цикла
        while (kilometres >= 0) { // закомментируйте при включении while (true)
            System.out.println("Осталось до финиша: " + kilometres + "км.");
//            if (kilometres < 2) { // расскомтрируйте чтобы остановить цикл
//                System.out.println("Недоехал...");
//                break;
//            }
            kilometres--;
        }
    }
}