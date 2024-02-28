package java_basics;

import java_basics.lesson_12_class_and_object.Human;

/**
 * @author Maxim Urusov
 * @see <a href="https://vk.com/video-221759623_456239075">
 * 16 Урок - сборщик мусора Garbage Collector</a>
 */
public class Lesson16GarbageCollector {

    public static void main(String[] args) {

        Human[] humans = createHumansArray();
        boolean printedToConsole = printHumansToConsole(humans); // 3. Удалите ненужное поле и запустите
    }

    public static Human[] createHumansArray() {

        Human man = new Human();
        Human woman = new Human();
        Human boy = new Human();
        Human girl = new Human();

        man = boy; // 2. Инициализируйте man = null для того чтобы отвязаться от объекта boy и запустите
        boy = null; // 1. Попробуйте указать boy = man
        woman = girl;

//        System.gc(); // ручной заказ уборки мусора из памяти
        return new Human[]{man, woman, boy, girl};
    }

    public static boolean printHumansToConsole(Human[] humans) {

        System.out.println("Строковое представление объектов типа Human:");
        byte counter = 1;

        for (Human human : humans) {
            System.out.println(String.valueOf(counter) + " " + human);
            counter++;
        }
        return true;
    }
}