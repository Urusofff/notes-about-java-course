package java_basics.constructors.lesson_20_copy.service;


import java_basics.constructors.lesson_20_copy.model.CopySafeHuman;

/**
 * @author Maksim Urusov
 */
public class CopyConstructorService {

    public static void main(String[] args) {

        CopySafeHuman boy = new CopySafeHuman("Серафим", 7);
        boy.tellAboutYou();

        CopySafeHuman copyOfBoy = new CopySafeHuman(boy.getName(), 14);
        boy.setName("Василий");
        boy.tellAboutYou();
        // замените первый аргумент конструктора на
        // new CopyChainSafeHuman("Серафим", 7).getName() и запустите
        copyOfBoy.tellAboutYou();

        CopySafeHuman copyOfBoy2 = boy;
        boy.setName("Николай"); // смените имя на "дядя Коля" и запустите
        boy.tellAboutYou();
        copyOfBoy2.tellAboutYou();
    }
}