public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardholder, Money limit) {
        this.owner = newCardholder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0.0); 
    }

    public Money getBalance() {
        return new Money(this.balance);
    }

    public Money getCreditLimit() {
        return new Money(this.creditLimit);
    }

    public String getPersonals() {
        return this.owner.toString();
    }

    public void charge(Money amount) {
        Money potentialBalance = new Money(this.balance);
        potentialBalance.add(amount);
        
        String comparison = potentialBalance.compareTo(this.creditLimit);
        if (comparison.equals("less") || comparison.equals("equal")) {
            this.balance.add(amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    public void payment(Money amount) {
        this.balance.subtract(amount);
    }
}