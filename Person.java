public class Person {
    private String firstName;
    private String lastName;
    private Address home;

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.home = new Address();
    }

    public Person(String firstName, String lastName, Address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = new Address(home);
    }

    public Person(Person otherPerson) {
        this.firstName = otherPerson.firstName;
        this.lastName = otherPerson.lastName;
        this.home = new Address(otherPerson.home);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public Address getHome() {
        return new Address(this.home);
    }

    public void setHome(Address newAddress) {
        this.home = new Address(newAddress);
    }

    public String toString() {
        return this.lastName + " " + this.firstName + " " + this.home.toString();
    }
}
