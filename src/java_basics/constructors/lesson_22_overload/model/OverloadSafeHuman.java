package java_basics.constructors.lesson_22_overload.model;

/**
 * @author Maksim Urusov
 */
public class OverloadSafeHuman {

    private final String name;
    private final int age;
    private final String moneyMessage = "Поступления средств в год = ";

    public OverloadSafeHuman(String name, int age) { // поменяйте параметры имени и возраста местами и запустите
        this.name = checkName(name);
        this.age = checkAge(age);
    }

    public OverloadSafeHuman(String name, int age, int totalIncome) {
        this.name = checkName(name);
        this.age = checkAge(age);
        System.out.println(moneyMessage + totalIncome/age);
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

    public void printIncomeByAge(int totalIncome) {
        if (age <= 0) {
            System.out.println("Ошибка! Возраст должен быть больше нуля!");
            throw new IllegalArgumentException();
        } else {
            System.out.println(moneyMessage + totalIncome / age);
        }
    }
}