public class Money {
    private int dollars;
    private int cents;

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public Money(double amount) {
        this.dollars = (int) amount;
        this.cents = (int) Math.round((amount - dollars) * 100);
    }

    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public void add(Money otherMoney) {
        this.dollars += otherMoney.dollars;
        this.cents += otherMoney.cents;
        if (this.cents >= 100) {
            this.dollars += this.cents / 100;
            this.cents = this.cents % 100;
        }
    }

    public void subtract(Money otherAmount) {
        this.dollars -= otherAmount.dollars;
        this.cents -= otherAmount.cents;
        if (this.cents < 0) {
            this.dollars -= 1;
            this.cents += 100;
        }
    }

    public String compareTo(Money otherObject) {
        if (this.dollars < otherObject.dollars) {
            return "less";
        } else if (this.dollars > otherObject.dollars) {
            return "greater";
        } else if (this.cents < otherObject.cents) {
            return "less";
        } else if (this.cents > otherObject.cents) {
            return "greater";
        } else {
            return "equal";
        }
    }

    public String toString() {
        return String.format("$%d.%02d", this.dollars, this.cents);
    }
}
