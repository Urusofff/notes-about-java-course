package java_basics;

/**
 * @author Maksim Urusov
 */
public class Lesson5OperatorIf {

    public static void main(String[] args) {

        boolean isNeededJava = true; // 1 - измените на false, чтобы попасть в else if

        // полная форма
        if (isNeededJava) {
            System.out.println("Мы изучаем курс Notes about Java!");
        } else if (2 + 2 == 4) { // 2 - измените на 2 + 2 != 4, чтобы попасть в else
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