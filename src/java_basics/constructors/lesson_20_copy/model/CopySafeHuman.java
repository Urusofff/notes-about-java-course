package java_basics.constructors.lesson_20_copy.model;

/**
 * @author Maksim Urusov
 */
public class CopySafeHuman {

    private String name;
    private final int age;

    public CopySafeHuman(String name, int age) {
        this.name = checkName(name);
        this.age = checkAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = checkName(name);
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