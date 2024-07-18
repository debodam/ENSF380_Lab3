package ca.ucalgary.ensf380;

public class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private Address address;
    private static int lastPersonalNumber = 0;
    private int personalNumber;

    public Person(String name, String phoneNumber, String emailAddress, Address address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
        this.personalNumber = ++lastPersonalNumber;
    }

    public String nextPersonalNumber() {
        return String.valueOf(personalNumber);
    }

    public boolean hasValidAddress() {
        return address.validate();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
