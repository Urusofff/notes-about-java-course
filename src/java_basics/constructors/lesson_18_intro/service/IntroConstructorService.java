package java_basics.constructors.lesson_18_intro.service;

import java_basics.constructors.lesson_18_intro.model.IntroSafeHuman;
import java_basics.lesson_17_incapsulation_getter_and_setter.Human;

/**
 * @author Maksim Urusov
 * @see <a href="https://vk.com/video-221759623_456239079">
 * 18 Урок - введение в конструкторы</a>
 */
public class IntroConstructorService {

    public static void main(String[] args) {

        Human humanNoArgs = new Human();
        humanNoArgs.tellAboutYou();

        IntroSafeHuman boy = new IntroSafeHuman("Серафим", 7);
        // измените в конструкторе возраст на отрицательный и запустите
        boy.tellAboutYou();
    }
}