public class Main {
    public static void main( String[] args) {

        /* Вывод String */
        String name = "Петр";
        System.out.println(name);
        System.out.print("\n" + name);
        System.out.println("\n");

        /* Вывод String посимвольно (println) */
        int i;
        for (i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        System.out.print("\n");
        /* Вывод String посимвольно (print) */

        for (i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + "\n");
        }

        /* Вывод char посимвольно (println) */

        char a = 'П';
        char b = 'е';
        char c = 'т';
        char d = 'р';

        System.out.println("\n");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        /* Вывод char посимвольно (print) */

        System.out.print("\n\n");
        System.out.print(a + "\n");
        System.out.print(b + "\n");
        System.out.print(c + "\n");
        System.out.print(d + "\n\n");

        /* Вывод char одной переменной (print) */

        char nameChar = 'П';
        System.out.print(nameChar);
        nameChar = 'е';
        System.out.print(nameChar);
        nameChar = 'т';
        System.out.print(nameChar);
        nameChar = 'р';
        System.out.print(nameChar + "\n\n");

        /* Вывод char одной переменной (println) */

        nameChar = 'П';
        System.out.println(nameChar);
        nameChar = 'е';
        System.out.println(nameChar);
        nameChar = 'т';
        System.out.println(nameChar);
        nameChar = 'р';
        System.out.println(nameChar + "\n");

        /* Вывод char одной переменной с переносом строки (print) */

        nameChar = 'П';
        System.out.print("\n" + nameChar + "\n");
        nameChar = 'е';
        System.out.print(nameChar + "\n");
        nameChar = 'т';
        System.out.print(nameChar + "\n");
        nameChar = 'р';
        System.out.print(nameChar + "\n");

    }

}