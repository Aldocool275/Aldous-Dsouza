import java.util.*;
public class Test_Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name of Account Holder:");
        String name = sc.next();
        System.out.print("Enter Account Number:");
        int acc = sc.nextInt();
        System.out.println("Enter Account Type:");
        String acc_t = sc.next();
        System.out.print("Enter balance:");
        double balance = sc.nextDouble();

        Bank b1 = new Bank(name, acc, acc_t, balance);
        b1.display_holder();
        b1.withdraw(3400);
        b1.display_holder();

        System.out.print("Enter name of Account Holder:");
        name = sc.next();
        System.out.print("Enter Account Number:");
        acc = sc.nextInt();
        System.out.println("Enter Account Type:");
        acc_t = sc.next();
        System.out.print("Enter balance:");
        balance = sc.nextDouble();

        Bank b2 = new Bank(name, acc, acc_t, balance);
        b2.display_holder();
        b2.deposit(5600);
        b2.display_holder();



        
        sc.close();
    }
}
