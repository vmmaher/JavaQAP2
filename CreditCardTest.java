public class CreditCardTest { 
    public static void main (String [] args) {
        // Task #1 - Copy constructor testing 
        // System.out.println("Task #1 - Copy");
        // Money originalMoney = new Money(25.75);
        // Money copiedMoney = new Money(originalMoney);
        // System.out.println("Original: " + originalMoney);
        // System.out.println("Copy: " + copiedMoney);
        // Money money1 = new Money(100.00);
        // Money money2 = new Money(money1);
        // money1.add(new Money(50.00));
        // System.out.println("Money1: " + money1);
        // System.out.println("Money2: " + money2);

        // Task #2 - Passing and returning objects
        final Money LIMIT = new Money(1000); 
        final Money FIRST_AMOUNT = new Money(200); 
        final Money SECOND_AMOUNT = new Money(10.02); 
        final Money THIRD_AMOUNT = new Money(25); 
        final Money FOURTH_AMOUNT = new Money(990); 
        Person owner = new Person("Christie", "Diane", new Address("237J Harvey Hall", "Menomonie", "WI", "54751")); 
        CreditCard visa = new CreditCard(owner, LIMIT); 
        System.out.println(visa.getPersonals()); 
        System.out.println("Balance: " + visa.getBalance()); 
        System.out.println("Credit Limit : " + visa.getCreditLimit()); 
        System.out.println(); 
        System.out.println("Attempt to charge " + FIRST_AMOUNT); 
        visa.charge(FIRST_AMOUNT); 
        System.out.println("Balance : " + visa.getBalance()); 
        System.out.println("Attempt to charge " + SECOND_AMOUNT); 
        visa.charge(SECOND_AMOUNT); 
        System.out.println("Balance : " + visa.getBalance()); 
        System.out.println("Attempt to pay " + THIRD_AMOUNT); 
        visa.payment(THIRD_AMOUNT); 
        System.out.println("Balance : " + visa.getBalance()); 
        System.out.println("Attempt to charge " + FOURTH_AMOUNT); 
        visa.charge(FOURTH_AMOUNT); 
        System.out.println("Balance : " + visa.getBalance()); 
    } 
} 
