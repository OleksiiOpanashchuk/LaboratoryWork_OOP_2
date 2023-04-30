import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть значення x: ");
        double x = input.nextDouble(); // введення значення x з клавіатури

        double fx; // змінна для збереження значення функції f(x)
        if (x < 0) {
            fx = Math.pow(x, 2) + 3;
            System.out.println("f(x) = " + fx); // виведення значення функції f(x) на екран
        }
        else if (x >= 0 && x <= 5) {
            fx = 6*Math.sqrt(x);
            System.out.println("f(x) = " + fx); // виведення значення функції f(x) на екран
        }
        if (x>5)  {
            fx = -x+9;
            System.out.println("f(x) = " + fx); // виведення значення функції f(x) на екран
        }


    }
}