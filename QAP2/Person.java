public class Person {
    private String name;
    private Address address;

    // Constructor
    public Person(String name, Address address) {
        this.name = name;
        this.address = new Address(address); // Use copy constructor
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.address = new Address(other.address);
    }

    // Getters
    public String getName() {
        return name;
    }

    public Address getAddress() {
        return new Address(address);
    }

    // toString method
    @Override
    public String toString() {
        return name + ", " + address;
    }
}

