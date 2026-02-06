package contactmanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactService service = new ContactService();

        while (true) {
            System.out.println("\n--- Contact Manager ---");
            System.out.println("1. Add contact");
            System.out.println("2. Show contacts");
            System.out.println("3. Search contact");
            System.out.println("4. Delete contact");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine(); // buffer clean

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Phone: ");
                    String phone = sc.nextLine();
                    service.addContact(name, phone);
                    break;

                case 2:
                    service.showContacts();
                    break;

                case 3:
                    System.out.print("Search name: ");
                    service.searchContact(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Delete name: ");
                    service.deleteContact(sc.nextLine());
                    break;

                case 0:
                    System.out.println("👋 Bye");
                    return;

                default:
                    System.out.println("❗ Noto‘g‘ri tanlov");
            }
        }
    }
}
