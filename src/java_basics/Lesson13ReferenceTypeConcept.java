package java_basics;

import java_basics.lesson_12_class_and_object.Human;

/**
 * @author Maxim Urusov
 * @see <a href="https://vk.com/video-221759623_456239065">
 * 13 Урок - понятие о ссылочном типе</a>
 */
public class Lesson13ReferenceTypeConcept {

    public static void main(String[] args) {

//        int boy = new Human(); // попробуйте присвоить ссылочный тип Human - примитиву

        // аналогия - почта у человека ivanov@company.ru
        Human man = new Human(); // инициализируйте man = null и запустите!
        System.out.println("man - " + man);

        Human woman = new Human();
        System.out.println("woman - " + woman);

        Human boy = new Human();
        System.out.println("boy - " + boy);

        Human girl = new Human();
        System.out.println("girl - " + girl);

        byte seven = 7; // попробуйте инициализировать seven = null
        System.out.println("seven - " + seven);
    }
}