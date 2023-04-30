import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть координату x: ");
        double x = input.nextDouble();
        System.out.print("Введіть координату y: ");
        double y = input.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Точка знаходиться в першому квадранті");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка знаходиться в другому квадранті");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка знаходиться в третьому квадранті");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка знаходиться в четвертому квадранті");
        } else if (x == 0 && y == 0) {
            System.out.println("Точка знаходиться в початку координат");
        } else if (x == 0) {
            System.out.println("Точка знаходиться на вісі y");
        } else if (y == 0) {
            System.out.println("Точка знаходиться на вісі x");
        }
    }
}
