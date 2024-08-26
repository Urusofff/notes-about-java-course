package java_basics;

/**
 * @author Maksim Urusov
 */
public class Lesson4PrimitiveTypesOperations {

    public static void main(String[] args) {

        // присваивание
        byte x = 5, y = x, z = x;
        byte x1, x2, x3;
        x1 = x2 = x3 = 5;
        System.out.println(x1); // выведите x2

        // унарные
//        int i = 5, j, k;
//        j= -i; // j = -5
//        k = +i; // k = 5
//        int x = 3, y, z;
//        y = ++x; //4
//        z = x++; //4
//        System.out.println(z); // выведите y

        // бинарные
//        int x = 9, x1, x2, x3, x4;
//        x1 = x + 10; // x1 = 19
//        x2 = x - 8; // x2 = 1
//        x3 = x2 * x; // x3 = 9
//        x4 = x/4; // x4 = 2 (дробная часть отбрасывается)
//        System.out.println(x4); // выведите x3

        // комибинированные
//        int x = 0, b = 9;
//        x += b; // x = x + b
//        System.out.println(x); // выведите b

        // сравнение
//        boolean isEqual, isNonEqual;
//        int x1 = 7, x2 = 7;
//        isEqual = x1 == x2; // isEqual = true
//        isNonEqual = x1 != x2; // isNonEqual = false
//        System.out.println(isNonEqual); // выведите isEqual

        // условная операция
//        int x, n = 2;
//        x = n > 1 ? 0:1;
//        System.out.println(x); // выведите n

        // приведение типов и усечение до целого
//        int x = (int) 77.85; // смените на 77.50
//        System.out.println(x);

    }
}