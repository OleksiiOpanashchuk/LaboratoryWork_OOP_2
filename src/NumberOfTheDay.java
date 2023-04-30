public class NumberOfTheDay {
    public static void main(String[] args) {
        int dayOfWeek = 6; // Замість 3 можна використати будь-який номер дня тижня (1-7)

        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Це робочий день.");
                break;
            case 6:
            case 7:
                System.out.println("Це вихідний день.");
                break;
            default:
                System.out.println("Невірний номер дня тижня.");
        }
    }
}
