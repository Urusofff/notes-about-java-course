package java_basics.constructors.lesson_20_copy_and_chain.service;


import java_basics.constructors.lesson_20_copy_and_chain.model.CopyChainSafeHuman;

/**
 * @author Maksim Urusov
 * @see <a href="https://vk.com/video-221759623_456239076">
 * 20 Урок - copy и chain конструкторы</a>
 */
public class CopyChainConstructorService {

    public static void main(String[] args) {

        CopyChainSafeHuman boy = new CopyChainSafeHuman("Серафим", 7);
        // измените возраст в конструкторе на отрицательный и запустите
        boy.tellAboutYou();

        CopyChainSafeHuman copyOfBoy = new CopyChainSafeHuman(boy, 14);
        // замените первый аргумент конструктора на new SafeHuman("Серафим", 7) и запустите
        copyOfBoy.tellAboutYou();

        CopyChainSafeHuman boyNewBorn = new CopyChainSafeHuman("Серафим");
        boyNewBorn.tellAboutYou();
    }
}