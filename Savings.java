public class Savings extends Account {
    double interest;

    Savings(String cname,int acc_no,String acc_type,double balance){
        super(cname, acc_no, acc_type, balance);
    }

    void interest_rate(double rate,int tenure){
        interest = balance * rate * tenure;
        balance += interest;
        if(tenure == 1){
            System.out.println("Dear!!" + cname + " you have got an interest of Rs" + interest + " at the rate of " + rate + " for the period of " + tenure + " month");
        }else{
            System.out.println("Dear!!" + cname + " you have got an interest of Rs" + interest + " at the rate of " + rate + " for the period of " + tenure + " months");
        }
        System.out.println("Your current balance is " + balance);
    }
}
