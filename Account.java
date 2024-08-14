public class Account{
    String cname;
    int acc_no;
    String acc_type;
    double balance;

    Account(String cname,int acc_no,String acc_type,double balance){
        this.cname = cname;
        this.acc_no = acc_no;
        this.acc_type = acc_type;
        this.balance = balance;
    }

    void deposit(double amount){
        System.out.println("Dear!!" + cname + "Rs." + amount + " is credited to your account");
        balance += amount;
        System.out.println("Your current balance is " + balance);
    }

    void withdraw(double amount){
        System.out.println("Dear!!" + cname + "Rs." + amount + " is debited from your account");
        balance -= amount;
        System.out.println("Your current balance is " + balance);

        if(balance < 500 && acc_type == "Current"){
            System.out.println("Dear!!" + cname + " you have been imposed a penalty due to insufficient amount");
            balance -= 100;
            System.out.println("Your current balance is " + balance);
        }
    }

    void balance(){
        System.out.println("Your current balance is " + balance);
    }

    void display(){
        System.out.println("Customer Name:" + cname + ", Account Number:" + acc_no + ", Account Type:" + acc_type);
    }
}
