public class Numbers {
    public static void main(String[] args) {
        int num = 44; // Замість 42 можна використати будь-яке число
        if (num >= 10 && num <= 99 && num % 2 == 0) {
            System.out.println(num + " є двозначним і парним числом.");
        } else {
            System.out.println(num + " не є двозначним і парним числом.");
        }
    }
}
