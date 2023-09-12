
/**
 * @author Maxim Urusov
 *
 * @see <a href="https://vk.com/video-221759623_456239027">
 *     5 Урок - условный оператор if</a>
 */
public class Lesson5OperatorIf {

    public static void main(String[] args) {

        boolean isNeededJava = false; // 1 - измените на false, чтобы попасть в else if

        // полная форма
        if (isNeededJava) {
            System.out.println("Мы изучаем курс Notes about Java!");
        } else if (2 + 2 != 4) { // 2 - измените на 2 + 2 != 4, чтобы попасть else
            System.out.println("Здорово! Мы изучаем курс Notes about Java!");
        }
        // else if ...
        else {
            System.out.println("Мы все равно изучаем курс Notes about Java!");
        }

        // сокращенная форма
//        if (isNeededJava) // измените на false, чтобы ничего не выводилось в консоль
//            System.out.println("Здорово! Мы изучаем курс Notes about Java!");
    }
}