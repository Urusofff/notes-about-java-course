package java_basics.constructors.lesson_21_chain.service;


import java_basics.constructors.lesson_21_chain.model.ChainSafeHuman;

/**
 * @author Maksim Urusov
 */
public class ChainConstructorService {

    public static void main(String[] args) {

        ChainSafeHuman boy = new ChainSafeHuman("Серафим", 7);
        boy.tellAboutYou();

        ChainSafeHuman copyOfBoy = new ChainSafeHuman(boy.getName(), 14);
        boy.setName("Василий");
        boy.tellAboutYou();
        // замените первый аргумент конструктора на
        // new CopyChainSafeHuman("Серафим", 7).getName() и запустите
        copyOfBoy.tellAboutYou();

//        CopySafeHuman copyOfBoy2 = boy;
//        boy.setName("Николай");
//        boy.tellAboutYou();
//        copyOfBoy2.tellAboutYou();

//        CopyChainSafeHuman boyNewBorn = new CopyChainSafeHuman("Серафим", 0);
//        // добавьте второй параметр возраста равным 0 в конструктор и запустите
//        boyNewBorn.tellAboutYou();
    }
}