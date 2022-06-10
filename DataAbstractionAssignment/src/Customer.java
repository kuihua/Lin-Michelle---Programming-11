import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits = new ArrayList<Deposit>();
    private ArrayList<Withdraw> withdraws = new ArrayList<Withdraw>();
    public double checkBalance;
    public double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    Customer(){
        //create default constructor
        name="A";
        accountNumber=1;
        checkBalance=0;
        savingBalance=0;
    }

    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        //constructor code here
        this.name=name;
        this.checkBalance=checkDeposit;
        this.savingBalance=savingDeposit;
        this.accountNumber=accountNumber;
        accountNumber++;
    }

    //depositing money into specified account
    public double deposit(double amt, Date date, String account){
        //your code here
        deposits.add(new Deposit(amt,date,account));
        if(account.equals(CHECKING)){
            checkBalance+=amt;
            return checkBalance;
        }
        else if(account.equals(SAVING)){
            savingBalance+=amt;
            return savingBalance;
        }
        else return 0;
    }

    //withdrawing money only if there is enough in the account
    public double withdraw(double amt, Date date, String account){
        //your code here
        withdraws.add(new Withdraw(amt, date, account));
        //withdrawing money only if amount withdrawn does not go over account balance
        if(checkOverdraft(amt,account)==false) {
            if (account.equals(CHECKING)) {
                checkBalance -= amt;
                return checkBalance;
            }
            if (account.equals(SAVING)) {
                savingBalance -= amt;
                return savingBalance;
            }
        }
        return OVERDRAFT;
    }

    //checking if the amount you withdraw exceeds the amount in the account accessed
    private boolean checkOverdraft(double amt, String account){
        //your code here
        if((account.equals(CHECKING)&&checkBalance<amt)||(account.equals(SAVING)&&amt>savingBalance)){
            return true;
        }else return false;
    }

    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}
