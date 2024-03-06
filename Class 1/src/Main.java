public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

/* Решение 1 с новой переменной --> */
        int c = a;
        a = b;
        b = c;
        System.out.println("Значение а: " + a + ". Значение b: " + b);
/* Решение 1 с новой переменной ^^^ */

        a = 5;
        b = 10;

/* Решение 2 без новой переменной --> */
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Значение а: " + a + ". Значение b: " + b);
/* Решение 2 без новой переменной ^^^ */
    }
}