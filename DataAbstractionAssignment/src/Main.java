import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Ty",1,0,0);

        customer.deposit(50,new Date(),"Checking");
        System.out.println(customer.checkBalance);

        customer.withdraw(50,new Date(),"Checking");
        System.out.println(customer.checkBalance);

        customer.deposit(50,new Date(),"Saving");
        customer.displayDeposits();
        System.out.println(customer.checkBalance);

        customer.withdraw(50,new Date(),"Saving");
        customer.displayWithdraws();
        System.out.println(customer.checkBalance);

    }
}
