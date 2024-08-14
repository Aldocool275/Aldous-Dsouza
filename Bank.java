public class Bank {
    String name;
    int account_number;
    String account_type;
    double balance;

    Bank(String n,int acc_no,String acc_type,double b){
        name = n;
        account_number = acc_no;
        account_type = acc_type;
        balance = b;
    }

    void withdraw(double amount){
        System.out.println("Dear Customer,,Rs." + amount + " is debited from your account");
        balance -= amount;
    }

    void deposit(double amount){
        System.out.println("Dear Customer,,Rs." + amount + " is credited to your account");
        balance += amount;
    }

    void display_holder(){
        System.out.println("Account Holder:" + name + " Account Number:" + account_number + " Account Type:" + account_type + " Balance:" + balance);
    }
}
