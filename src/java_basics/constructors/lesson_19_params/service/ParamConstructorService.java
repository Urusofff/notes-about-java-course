package java_basics.constructors.lesson_19_params.service;


import java_basics.constructors.lesson_19_params.model.ParamSafeHuman;

/**
 * @author Maksim Urusov
 * @see <a href="https://vk.com/video-221759623_456239080">
 * 19 Урок - параметры конструкторов</a>
 */
public class ParamConstructorService {

    public static void main(String[] args) {

        ParamSafeHuman boy = new ParamSafeHuman("Серафим", 7);
        boy.tellAboutYou();

//        2. Раскомментируйте и поменяйте местами значения последних 2 параметров
//        ParamSafeHuman badBoy = new ParamSafeHuman("Серафим", 7,
//                "Преподобный", "Саровский");

//        3. Раскомментируйте, чтобы увидить ошибку
//        ParamSafeHuman wrongBoy = new ParamSafeHuman();
    }
}