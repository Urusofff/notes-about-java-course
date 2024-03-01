package java_basics;

/**
 * @author Maksim Urusov
 *
 * @see <a href="https://vk.com/video-221759623_456239058">
 *     6 Урок - оператор выбора Switch</a>
 */
public class Lesson6OperatorSwitch {

    public static void main(String[] args) {

        byte countOfPassengers = 3; //измените значение чтобы проверить варинты в switch
        printCarType(countOfPassengers);

    }

    public static void printCarType(byte maxCountOfPassengers) {
        switch (maxCountOfPassengers) { // из примитивных типов можно: byte, short, char, int.
            case 1,2,3,4,5 -> System.out.println("Можно ехать на обычной легковой!");
            case 6,7 -> System.out.println("Придется брать семиместную.");
            case 8,9 -> System.out.println("Как насчет микроавтобуса бизнес класса?");
            default -> System.out.println("У нас машины только до 9 мест.");
        }
    }

}