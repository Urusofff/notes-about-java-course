package java_basics;

import java_basics.lesson_12_class_and_object.Human;

/**
 * @author Maxim Urusov
 * @see <a href="https://vk.com/video-221759623_456239066">
 * 14 Урок - void методы</a>
 */
public class Lesson14VoidMethods {

    public static void main(String[] args) {

        createAndPrintHumans();
    }

    public static void createAndPrintHumans() {

        // 1 действие - создание объектов Human
        Human man = new Human();
        Human woman = new Human();
        Human boy = new Human();
        Human girl = new Human();

        // 2 действие - оборачивание в массив
        Human[] humans = {man, woman, boy, girl}; // добавьте еще один элемент массива new Human() и запустите

        // 3 действие - вызов метода для печати в консоль
        printToConsole(humans);
        printToConsole(woman, man, boy, girl); // добавьте еще один параметр new Human() и запустите
    }

    public static void printToConsole(Human[] humans) {

        System.out.println("Строковое представление объектов типа Human:");

        for (Human human : humans) {
            System.out.println(human);
        }
    }

    public static void printToConsole(Human man, Human woman, Human boy, Human girl) {

        System.out.println("Строковое представление объектов типа Human:");
        System.out.println(man);
        System.out.println(woman);
        System.out.println(boy);
        System.out.println(girl);
    }
}