public class Main {
    static public void main(String[] args) {
        System.out.println("Привет, мир!");

        double my_weight = 58;
        double moon_gravity = 17;
        double earth_gravity = 100;
        double moon_weight;

        moon_weight = (moon_gravity / earth_gravity) * my_weight;
        String result = String.format("%.2f", moon_weight);
        System.out.println("Мой вес на Луне равен: " + result + " кг");
    }
} 


/*
 * Реализовать таблицу истинности: т.е. у нас есть p = false и q = true.
 * Чему будет равно p & q == ? , ? - вынести в таблицу.
 */

/*
 * Сила тяжести на Луне составляет около 17% земной.
 *  Напишите программу, которая вычислила бы ваш вес на Луне.
 */

