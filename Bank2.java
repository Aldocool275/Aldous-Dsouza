import java.util.*;
public class Bank2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Savings s1 = new Savings("Aldous Dsouza",10111,"Savings",780000);
        Savings s2 = new Savings("Shreyash Vaigankar",10112,"Savings",560000);
        Current c1 = new Current("Ayush Maldar",10113,"Current",600);
        Current c2 = new Current("Saini Haldankar",10114,"Current",70000000);

        System.out.println("1.Deposit");
        System.out.println("2.Withdrawal");
        System.out.println("3.Check Balance");
        System.out.println("4.Check Interest Rate");
        System.out.println("Choose the above operations to Perform:");
        int choice = sc.nextInt();

            switch(choice){
                case 1 :
                    System.out.print("Enter your account number:");
                    int ac = sc.nextInt();
                    if(ac == 10111){
                        s1.display();
                        System.out.print("Enter Amount:");
                        double am = sc.nextDouble();
                        s1.deposit(am);
                    }else if(ac == 10112){
                        s2.display();
                        System.out.print("Enter Amount:");
                        double am = sc.nextDouble();
                        s2.deposit(am);
                    }else if(ac == 10113){
                        c1.display();
                        System.out.print("Enter Amount:");
                        double am = sc.nextDouble();
                        c1.deposit(am);
                    }else{
                        c2.display();
                        System.out.print("Enter Amount:");
                        double am = sc.nextDouble();
                        c2.deposit(am);
                    }
                    break;
                case 2 :
                    System.out.print("Enter your account number:");
                    ac = sc.nextInt();
                    if(ac == 10111){
                        s1.display();
                        System.out.print("Enter Amount:");
                        double am = sc.nextDouble();
                        s1.withdraw(am);
                    }else if(ac == 10112){
                        s2.display();
                        System.out.print("Enter Amount:");
                        double am = sc.nextDouble();
                        s2.withdraw(am);
                    }else if(ac == 10113){
                        c1.display();
                        System.out.print("Enter Amount:");
                        double am = sc.nextDouble();
                        c1.withdraw(am);
                    }else{
                        c2.display();
                        System.out.print("Enter Amount:");
                        double am = sc.nextDouble();
                        c2.withdraw(am);
                    }
                    break;
                case 3:
                    System.out.print("Enter your account number:");
                    ac = sc.nextInt();
                    if(ac == 10111){
                        s1.display();
                        s1.balance();
                    }else if(ac == 10112){
                        s2.display();
                        s2.balance();
                    }else if(ac == 10113){
                        c1.display();
                        c1.balance();
                    }else{
                        c2.display();
                        c2.balance();
                    }
                    break;
                case 4:
                    System.out.print("Enter your account number:");
                    ac = sc.nextInt();
                    if(ac == 10111){
                        s1.display();
                        System.out.print("Enter Rate of Interest:");
                        double r = sc.nextDouble();
                        System.out.print("Enter tenure:");
                        int t = sc.nextInt();
                        s1.interest_rate(r, t);
                    }else if(ac == 10112){
                    s1.display();
                    System.out.print("Enter Rate of Interest:");
                    double r = sc.nextDouble();
                    System.out.print("Enter tenure:");
                    int t = sc.nextInt();
                    s1.interest_rate(r, t);
                    }
                    break;
                default:
                    System.out.println("Please Enter correct Operation....");
                    break;
            }
        

        c1.chequebook("No");
        c2.chequebook("Yes");

        sc.close();
    }
}
