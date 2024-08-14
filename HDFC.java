import java.util.*;
public class HDFC extends Bank3{
    Scanner sc = new Scanner(System.in);
    int balance;
    double interest;

    void rate_of_interest(){
        System.out.print("Enter your Balance:");
        balance = sc.nextInt();
        if(balance < 5000000){
            interest = 3.00;
            System.out.println("HDFC Bank gives an interest of " + interest + " % p.a on Savings Account");
        }else{
            interest = 3.50;
            System.out.println("HDFC Bank gives an interest of " + interest + " % p.a on Savings Account");
        }
    }
}
