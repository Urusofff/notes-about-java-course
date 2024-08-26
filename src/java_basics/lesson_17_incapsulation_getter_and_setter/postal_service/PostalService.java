package java_basics.lesson_17_incapsulation_getter_and_setter.postal_service;

import java_basics.lesson_17_incapsulation_getter_and_setter.Human;

/**
 * @author Maksim Urusov
 */
public class PostalService {

    public static void main(String[] args) {

        Human boy = new Human();
        boy.setAge(7); // измените возраст на отрицательный и запустите
        boy.setName("Серафим");
        boy.tellAboutYou();

        callPostmanPechkin(boy);

        Human girl = new Human();
        girl.setAge(5);
        girl.setName("София"); // измените имя девочки и запустите
        girl.tellAboutYou();

        callPostmanPechkin(girl);
    }

    private static void callPostmanPechkin(Human human) {
            System.out.println("Почтальон Печкин принес посылку на имя " + human.getName()
                    + " с возрастом " + human.getAge() + " лет.");
    }
}