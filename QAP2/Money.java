public class Money {
    private int dollars;
    private int cents;

    // Constructor to initialize dollars and cents
    public Money(int dollars, int cents) {
        if (cents >= 100 || cents < 0) {
            this.dollars = dollars + cents / 100;
            this.cents = cents % 100;
        } else {
            this.dollars = dollars;
            this.cents = cents;
        }
    }

    // Copy constructor
    public Money(double amount) {
        this.dollars = (int) amount;  // Extract the dollar portion
        this.cents = (int) ((amount - this.dollars) * 100);  // Extract the cent portion
    }


   
   

    // Getters
    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Money money = (Money) obj;
        return dollars == money.dollars && cents == money.cents;
    }

    // toString method
    @Override
    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }

    // compareTo method
    public int compareTo(Money other) {
        if (this.dollars != other.dollars) {
            return this.dollars - other.dollars;
        } else {
            return this.cents - other.cents;
        }
    }

    // Add money
    public Money add(Money other) {
        return new Money(this.dollars + other.dollars, this.cents + other.cents);
    }

    // Subtract money
    public Money subtract(Money other) {
        int totalCents1 = this.dollars * 100 + this.cents;
        int totalCents2 = other.dollars * 100 + other.cents;
        int diffCents = totalCents1 - totalCents2;
        return new Money(diffCents / 100, diffCents % 100);
    }
}