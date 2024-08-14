public class Elec_Bill implements Plan{
    int units;
    double bill;

    public double get_rate(){
        return rate;
    }

    public void computeBill(int u){
        units = u;
        bill = units * rate;
    }

    public double getBill(){
        return bill;
    }
}
