import java.util.ArrayList;

public class Contact {
    String FirstName, LastName;
    ArrayList<Telephone> telephones = new ArrayList<>();

    public Contact() {

    }

    public Contact(String FirstName, String LastName, ArrayList<Telephone> telephones) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.telephones = telephones;
    }

    public String getContactNumberAndPurpose() {
        String contact;
        for (Telephone telephone : telephones) {
            return contact = telephone.toString();
        }
        return null;
    }

    public void setNumberandPuspose(String phoneNumber, String purpose) {
        for (Telephone telephone : telephones) {
            telephone.setPhoneNumber(phoneNumber);
            telephone.setPurpose(purpose);
        }
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLasttName() {
        return LastName;
    }

    @Override
    public String toString() {
        return "\nFirstname:" + FirstName + "\nLastName:" + LastName + getContactNumberAndPurpose();
    }

}
