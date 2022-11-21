package hw1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    static public void main(String[] args) {
        System.out.println("Привет, мир!"); // проверка

        /*
         * Сила тяжести на Луне составляет около 17% земной.
         * Напишите программу, которая вычислила бы ваш вес на Луне.
         */

        double my_weight = 58;
        double moon_gravity = 17;
        double earth_gravity = 100;
        double moon_weight;

        moon_weight = (moon_gravity / earth_gravity) * my_weight;
        String result = String.format("%.2f", moon_weight);
        System.out.println("Мой вес на Луне равен: " + result + " кг");
        System.out.println();

        /*
         * Видоизмените программу, созданную в упражнении 1.2, таким образом, чтобы
         * она выводила таблицу перевода дюймов в метры. Выведите значения длины до
         * 12 футов через каждый дюйм. После каждых 12 дюймов выведите пустую строку.
         * (Один метр приблизительно равен 39,37 дюйма.)
         */
        double meter;
        int foot = 12 * 12;
        int inch;
        int count = 0;

        for (inch = 1; inch <= foot; inch++) {
            meter = inch / 39.37;
            System.out.println(inch + " дюйму соответствует " + meter + " метра");

            count++;

            if (count == 12) {
                System.out.println();
                count = 0;
            }
        }

        /*
         * Реализовать таблицу истинности: т.е. у нас есть p = false и q = true.
         * Чему будет равно p & q == ? , ? - вынести в таблицу.
         */

        boolean[] bool = { true, false };
        boolean p, q, z;
        System.out.println("p\t&\tq\t==\t?");
        System.out.println("===============================================");
        for (int i = 0; i < bool.length; i++) {
            p = bool[i];
            int j = 0;
            while (j < bool.length) {
                q = bool[j++];
                int k = 0;
                do {
                    z = bool[k++];
                    boolean pq = p & q;
                    System.out.println(p + "     |    " + q + "     |        " + pq);
                } while (k != bool.length);
            }
        }

        /*
         * Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя
         * количество выполняемых действий к минимуму.
         * Пример 1: а = 3, b = 2, ответ: 9
         * Пример 2: а = 2, b = -2, ответ: 0.25
         * Пример 3: а = 3, b = 0, ответ: 1
         * Пример 4: а = 0, b = 0, ответ: не определено
         * Пример 5
         * входные данные находятся в файле input.txt в виде
         * b 3
         * a 10
         * Результат нужно сохранить в файле output.txt
         * 1000
         */

        public class Test {
            static int power(int a, int b) {
                int result = 1;
                for (int i = 1; i <= b; i++) {
                    result = result * a;
                }
                return result;
            }

        }

        FileReader fr = new FileReader("input.txt");
        
        FileWriter fw = new FileWriter("output.txt");
    }
}



 
 

