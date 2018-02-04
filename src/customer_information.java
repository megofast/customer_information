import java.util.Scanner;

public class customer_information {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int selection = 0;
        String name, contact, phone;

        System.out.println("What type of customer are you?");
        System.out.println("1. Business");
        System.out.println("2. Residential");
        System.out.print("Selection: ");

        try {
            selection = Integer.valueOf(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Incorrect selection. Exiting.");
        }

        if (selection == 1) {
            System.out.print("Enter your business name: ");
            name = scanner.nextLine();
            System.out.print("Enter your contact name: ");
            contact = scanner.nextLine();
            System.out.print("Enter your phone number: ");
            phone = scanner.nextLine();
            information(name, contact, phone);
        } else if (selection == 2) {
            System.out.print("Enter your business name: ");
            name = scanner.nextLine();
            System.out.print("Enter your phone number: ");
            phone = scanner.nextLine();
            information(name, phone);
        }
    }

    public static void information(String name, String phone) {
        System.out.println(name);
        System.out.println(phone);
    }

    public static void information(String name, String contact, String phone) {
        System.out.println(name);
        System.out.println(contact);
        System.out.println(phone);
    }
}
