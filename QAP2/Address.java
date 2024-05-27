public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    // Constructor
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // Copy constructor
    public Address(Address other) {
        this.street = other.street;
        this.city = other.city;
        this.state = other.state;
        this.zip = other.zip;
    }

    // toString method
    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zip;
    }
}
