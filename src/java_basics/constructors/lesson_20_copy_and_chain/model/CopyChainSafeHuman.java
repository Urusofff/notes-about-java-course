package java_basics.constructors.lesson_20_copy_and_chain.model;

/**
 * @author Maksim Urusov
 * @see <a href="https://vk.com/video-221759623_456239076">
 * 20 Урок - copy и chain конструкторы</a>
 */
public class CopyChainSafeHuman {

    private final String name;
    private final int age;

    public CopyChainSafeHuman(String name, int age) { // поменяйте параметры имени и возраста местами и запустите
        this.name = checkName(name);
        this.age = checkAge(age);
    }

    public CopyChainSafeHuman(CopyChainSafeHuman copyChainSafeHuman, int age) {
        this.name = copyChainSafeHuman.name;
        this.age = checkAge(age);
    }

    public CopyChainSafeHuman(String name) {
        this(name, 0);
    }

    private String checkName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Ошибка! Имя должно быть заполнено!");
            throw new IllegalArgumentException();
        } else {
            return name;
        }
    }

    private int checkAge(int i) {
        if (i < 0) {
            System.out.println("Ошибка! Возраст не может быть отрицательным!");
            throw new IllegalArgumentException();
        } else {
            return i;
        }
    }

    public void tellAboutYou() {
            System.out.println("Меня зовут " + name + " и мне " + age + " лет.");
    }
}