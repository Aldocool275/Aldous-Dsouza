public class AddAmount {
    static double amount = 50;

    AddAmount(){
        System.out.println("No more money added in PiggyBank");
    }

    AddAmount(double money){
        System.out.println("$" + money + " is added in your piggybank");
        amount += money;
    }
}
