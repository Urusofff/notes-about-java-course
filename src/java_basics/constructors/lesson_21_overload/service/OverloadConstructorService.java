package java_basics.constructors.lesson_21_overload.service;


import java_basics.constructors.lesson_21_overload.model.OverloadSafeHuman;

/**
 * @author Maksim Urusov
 */
public class OverloadConstructorService {

    public static void main(String[] args) {

        OverloadSafeHuman boyZeroAgeWithIncome = new OverloadSafeHuman("Серафим", 0, 100);

        OverloadSafeHuman boyZeroAge = new OverloadSafeHuman("Серафим", 0);
        // измените возраст на отрицательный и запустите
        boyZeroAge.printIncomeByAge(100);
    }
}