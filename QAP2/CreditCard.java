public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    // Constructor
    public CreditCard(Person owner, Money creditLimit) {
            this.owner = owner;
            this.creditLimit = creditLimit;
            this.balance = new Money (0, 0);
    }

    // Getters
    public Person getOwner() {
        return new Person(owner); // Return a copy to prevent modification
    }

    public Money getBalance() {
        return balance; 
    }

    public Money getCreditLimit() {
        return creditLimit; 
    }

    // Method to make a payment
    public void makePayment(Money amount) {
        balance = balance.subtract(amount);
    }

    // Method to charge an amount
    public boolean charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount);
            return true;
        }
        return false;
    }

    // toString method
    @Override
    public String toString() {
        return "CreditCard[owner=" + owner + ", balance=" + balance + ", creditLimit=" + creditLimit + "]";
    }
}

