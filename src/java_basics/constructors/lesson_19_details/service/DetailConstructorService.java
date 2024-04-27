package java_basics.constructors.lesson_19_details.service;


import java_basics.constructors.lesson_19_details.model.DetailSafeHuman;

/**
 * @author Maksim Urusov
 * @see <a href="https://vk.com/video-221759623_456239076">
 * 19 Урок - устройство конструкторов</a>
 */
public class DetailConstructorService {

    public static void main(String[] args) {

        DetailSafeHuman boy = new DetailSafeHuman("Серафим", 7);
        // измените возраст в конструкторе на отрицательный и запустите
        boy.tellAboutYou();

//        DetailSafeHuman wrongBoy = new DetailSafeHuman(); // расскоментируйте, чтобы увидить ошибку
    }
}