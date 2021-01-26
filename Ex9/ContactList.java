import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
    Scanner sc = new Scanner(System.in);
    ArrayList<Contact> contacts = new ArrayList<>();

    public ContactList() {

    }

    public void readMenu() {
        System.out.println("------Contact Menu--------");
        System.out.println("1. Add Contact");
        System.out.println("2. Update Contact");
        System.out.println("3. Delete Contact");
        System.out.println("4. List Contact");
        System.out.println("5. Exit program");
        System.out.print("Enter choice:");
    }

    public void addContact() {
        System.out.println("Please add Contact into ContactList\n");
        System.out.print("FirstName:");
        String firstname = sc.nextLine();
        System.out.print("LastName:");
        String lastName = sc.nextLine();
        System.out.print("Phone Number[0-9/+ first digit]:");
        String phonenumber = sc.nextLine();
        System.out.print("Purpose:");
        String purpose = sc.nextLine();
        Telephone telephone = new Telephone(phonenumber, purpose);
        while (telephone.getPhoneNumber() == null) {
            System.out.print("Please input Phone Number[0-9/+ first digit] again:");
            phonenumber = sc.nextLine();
            telephone = new Telephone(phonenumber, purpose);
        }
        ArrayList<Telephone> telephoneN = new ArrayList<>();
        telephoneN.add(telephone);
        Contact contact = new Contact(firstname, lastName, telephoneN);
        contacts.add(contact);
    }

    public void updateContact() {
        System.out.println("----Please search by full name or firstname or lastname--------");
        System.out.print("Input fullName or lastName or FirstName");
        String name = sc.nextLine();
        Contact contact = findByName(name);
        if (contact == null)
            System.out.println("There no contact name " + name);
        else {
            System.out.println("updateContact into ContactList\n");
            System.out.print("FirstName:");
            String firstname = sc.nextLine();
            System.out.print("LastName:");
            String lastName = sc.nextLine();
            System.out.print("Phone Number[0-9/+ first digit]:");
            String phonenumber = sc.nextLine();
            System.out.print("Purpose:");
            String purpose = sc.nextLine();
            contact.setFirstName(firstname);
            contact.setLastName(lastName);
            contact.setNumberandPuspose(phonenumber, purpose);
            System.out.println("Contact is updated");
        }
    }

    public void deleteContactFromList() {
        System.out.println("Please input fullname or firstname or lastname");
        System.out.print("Delete using LastName/Firstname/fullName:");
        String name = sc.nextLine();
        Contact contact = findByName(name);
        if (contact == null)
            System.out.println("There no name: " + name + " in ContactList");
        else {
            System.out.println(name + " is deleted from contact");
            contacts.remove(contact);
        }
    }

    public Contact findByName(String name) {
        for (Contact contact : contacts) {
            if (name.equalsIgnoreCase(contact.getFirstName()) || name.equalsIgnoreCase(contact.getLasttName())
                    || name.equalsIgnoreCase(contact.getFirstName() + contact.getLasttName())) {
                return contact;
            }
        }
        return null;
    }

    public void listContact() {
        int i = 1;
        System.out.println("---------Contact List--------\n");
        for (Contact contact : contacts) {
            System.out.println(i);
            System.out.println(contact.toString());
            i++;
        }
        if (contacts.isEmpty()) {
            System.out.println("there is no contact in List\n");
        }
    }

}
