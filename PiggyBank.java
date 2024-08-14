public class PiggyBank {
    public static void main(String[] args) {
        AddAmount a1 = new AddAmount();
        System.out.println("Total money in your piggybank is $" + AddAmount.amount);
        AddAmount a2 = new AddAmount(100);
        AddAmount a3 = new AddAmount(200);
        System.out.println("Total money in your piggybank is $" + AddAmount.amount);
    }
}
