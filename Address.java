public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address() {
        this.street = "";
        this.city = "";
        this.state = "";
        this.zip = "";
    }

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Address(Address otherAddress) {
        this.street = otherAddress.street;
        this.city = otherAddress.city;
        this.state = otherAddress.state;
        this.zip = otherAddress.zip;
    }


    public String getStreet() {
        return this.street;
    }

    public void setStreet(String newStreet) {
        this.street = newStreet;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String newCity) {
        this.city = newCity;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String newState) {
        this.state = newState;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String newZip) {
        this.zip = newZip;
    }

    public String toString() {
        return this.street + " " + this.city + ", " + this.state + " " + this.zip;
    }
}
