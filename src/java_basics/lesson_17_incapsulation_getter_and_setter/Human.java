package java_basics.lesson_17_incapsulation_getter_and_setter;

/**
 * @author Maksim Urusov
 */
public class Human {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Ошибка! Возраст должен быть положительным!");
        }
    }

    public void tellAboutYou() {
        if (age >= 0) {
            System.out.println("Меня зовут " + name + " и мне " + age + " лет.");
        }
    }
}