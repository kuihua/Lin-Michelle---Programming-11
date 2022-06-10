import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Date;


public class Tests {

    ArrayList<Deposit> testDeposits;
    ArrayList<Withdraw> testWithdraws;
    Customer testCustomer;

    //checking customer.deposit
    @Before
    public void setUpDeposit(){
        testCustomer = new Customer();
    }

    @Test
    public void testCustomerDeposit() {
        //inserting a deposit
        testCustomer.deposit(50,new Date(),"Checking");
        //checking if there is a deposit made into the checking account, initial balance=0
        assertEquals(testCustomer.checkBalance,50,0);
        assertTrue(testCustomer.checkBalance==50);
    }

    //checking customer.withdraw
    @Before
    public void setUpWithdraw(){
        testWithdraws = new ArrayList<Withdraw>();
        testCustomer = new Customer();
    }

    @Test
    public void testCustomerWithdraw() {
        //no money, no withdraw
        //making sure account is empty
        assertEquals(testCustomer.checkBalance,0,0);
        assertTrue(testCustomer.checkBalance==0);
        //withdrawing from an empty account
        testCustomer.withdraw(50,new Date(),"Checking");
        //ensuring account is still 0, not negative
        assertEquals(testCustomer.checkBalance,0,0);
        assertTrue(testCustomer.checkBalance==0);

        //inserting a deposit
        testCustomer.deposit(100,new Date(),"Checking");

        //has enough money, will withdraw
        //making sure account has the deposit
        assertEquals(testCustomer.checkBalance,100,0);
        assertTrue(testCustomer.checkBalance==100);
        //withdrawing from account with enough money
        testCustomer.withdraw(50,new Date(),"Checking");
        //ensuring appropriate amount was removed
        assertEquals(testCustomer.checkBalance,50,0);
        assertTrue(testCustomer.checkBalance==50);

        //have money in the account, but overdrawing, not enough money in account
        //so no money will be taken
        //withdrawing from account with not enough money
        testCustomer.withdraw(150,new Date(),"Checking");
        //can't withdraw over the total balance, nothing taken
        assertEquals(testCustomer.checkBalance,50,0);
        assertTrue(testCustomer.checkBalance==50);
    }

    //checking deposit.toString
    @Before
    public void setUpDepositStr(){
        testDeposits = new ArrayList<Deposit>();
        testCustomer = new Customer();
    }

    @Test
    public void testDepositString() {
        //depositing money
        testCustomer.deposit(50,new Date(),"Checking");
        //checking if there is something in the deposit
        assertEquals(testCustomer.checkBalance,50,0);
        assertTrue(testCustomer.checkBalance==50);
        //checking string
        Date date = new Date();
        //unsure how to compare, tried actual: testDeposits.toString(), and testCustomer.toString()
        //and testCustomer.displayDeposits().toString(); (same with testing withdrawals toString)
        assertEquals("Deposit of: $50.0"+" Date: "+date+" into account: Checking.", testDeposits.toString());
    }

    //checking withdraw.toString
    @Before
    public void setUpWithdrawStr(){
        testWithdraws = new ArrayList<Withdraw>();
        testCustomer = new Customer();
    }

    @Test
    public void testWithdrawString() {
        //depositing money
        testCustomer.deposit(50,new Date(),"Checking");

        //checking if there is something in the deposit
        assertEquals(testCustomer.checkBalance,50,0);
        assertTrue(testCustomer.checkBalance==50);

        //withdrawing
        testCustomer.withdraw(50,new Date(),"Checking");

        //checking string
        Date date = new Date();
        assertEquals("Withdrawal of: $50.0"+" Date: "+date+" from account: Checking.", testCustomer.toString());
    }

}//eoc
