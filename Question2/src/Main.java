import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Select the console type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        System.out.println();

        int choice = scanner.nextInt();
        scanner.nextLine();

        String consoleType = " ";
        switch(choice) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "SWITCH";
                break;

            default:
                consoleType = "Unknown";
                break;

        }

        System.out.println("Enter the store: ");
        String store = scanner.nextLine();

        System.out.println("Enter the total sales of " + consoleType + " for " + store);
        int totalSales = scanner.nextInt();

        ConsoleSales consoleSales = new ConsoleSales(consoleType, store, totalSales );
        consoleSales.printReport();





        scanner.close();


    }
}