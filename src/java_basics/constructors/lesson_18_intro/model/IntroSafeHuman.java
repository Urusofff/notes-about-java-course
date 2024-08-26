package java_basics.constructors.lesson_18_intro.model;

/**
 * @author Maksim Urusov
 */
public class IntroSafeHuman {

    private final String name;
    private final int age;

    public IntroSafeHuman(String name, int age) { // поменяйте параметры имени и возраста местами и запустите
        if (name == null || name.isEmpty()) {
            System.out.println("Ошибка! Имя должно быть заполнено!");
            throw new IllegalArgumentException();
        } else {
            this.name = name;
        }
        if (age < 0) {
            System.out.println("Ошибка! Возраст должен быть положительным!");
            throw new IllegalArgumentException();
        } else {
            this.age = age;
        }
    }

    public void tellAboutYou() {
            System.out.println("Меня зовут " + name + " и мне " + age + " лет.");
    }
}