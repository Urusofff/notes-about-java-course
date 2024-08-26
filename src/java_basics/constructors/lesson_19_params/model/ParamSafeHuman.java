package java_basics.constructors.lesson_19_params.model;

/**
 * @author Maksim Urusov
 */
public class ParamSafeHuman {

    private final String name;
    private final int age;

//    2. Раскомментируйте, для конструктора с 4 параметрами
//    private final String surName;
//    private final String fatherName;
//
//    public ParamSafeHuman(String name, int age,
//                          String surName, String fatherName) {
//        this.name = checkString(name);
//        this.age = checkAge(age);
//        this.surName = checkString(surName);
//        this.fatherName = checkString(fatherName);
//    }

//    1. Поменяйте параметры имени и возраста местами и запустите
    public ParamSafeHuman(String name, int age) {
        this.name = checkString(name);
        this.age = checkAge(age);
    }

    private String checkString(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Ошибка! Поле должно быть заполнено!");
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