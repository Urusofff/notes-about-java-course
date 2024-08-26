package java_basics.lesson_12_class_and_object;

/**
 * @author Maksim Urusov
 */
public class Human { // переименуйте класс в GodHuman

    String name;
    int age;

    public static void main(String[] args) {

        Human boy = new Human();
        boy.age = 6; // измените возраст мальчика и запустите
        boy.name = "Серафим";
        System.out.println("Мальчика зовут " + boy.name + " и ему " + boy.age + " лет.");

        Human girl = new Human();
        girl.age = 4;
        girl.name = "София"; // измените имя девочки и запустите
        System.out.println("Девочку зовут " + girl.name + " и ей " + girl.age + " года.");

    }
}