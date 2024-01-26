package java_basics;

import java_basics.lesson_12_class_and_object.Human;

/**
 * @author Maxim Urusov
 * @see <a href="https://vk.com/video-221759623_456239067">
 * 15 Урок - return методы</a>
 */
public class Lesson15ReturnMethods {

    public static void main(String[] args) {

        Human[] humans = createHumansArray();

        boolean printedToConsole = printHumansToConsole(humans);
//        boolean printedToConsole = printHumansToConsole(new Human[]{}); // запустите, чтобы получить false

        if (printedToConsole) {
            System.out.println("Ура! Наши return методы работают!");
        } else {
            System.out.println("Ой! У наших return методов проблемы!");
        }
    }

    public static Human[] createHumansArray() {

        Human man = new Human();
        Human woman = new Human();
        Human boy = new Human();
        Human girl = new Human();

        return new Human[]{man, woman, boy, girl};
//        return new Human(); // расскоментируйте для проверки возвращаемого типа
//        System.out.println("я невыполнимая строка!"); // расскоментируйте для того, чтобы увидить невозможность!
    }

    public static boolean printHumansToConsole(Human[] humans) {

        if (humans.length > 1) { // запустите метод printHumansToConsole(new Human[]{})
            // с пустым массивом, чтобы получить false

            System.out.println("Строковое представление объектов типа Human:");

            for (Human human : humans) {
                System.out.println(human);
            }
            return true;
        }
        return false;
    }
}