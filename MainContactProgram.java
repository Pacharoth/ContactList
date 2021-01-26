import java.util.Scanner;

public class MainContactProgram {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        ContactList contacts = new ContactList();
        do {
            contacts.readMenu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    contacts.addContact();
                    break;
                case 2:
                    contacts.updateContact();
                    break;
                case 3:
                    contacts.deleteContactFromList();
                    break;
                case 4:
                    contacts.listContact();
                    break;
                case 5:
                    System.out.println("bye! Bye!");
                    break;
                default:
                    System.out.println("Input wrong operator");
                    break;
            }
        } while (choice != 5);
    }
}
