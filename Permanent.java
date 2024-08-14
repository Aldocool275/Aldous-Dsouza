public class Permanent extends Employee2{
    double bs;
    double da;
    double hra;
    double ta;
    double salary;

    Permanent(int empid,String empname,String empaddress,double bs,double da,double hra,double ta){
        super(empid,empname,empaddress);
        this.bs = bs;
        this.da = da;
        this.hra = hra;
        this.ta = ta;
    }

    void calculateSalary(){
        salary = bs + da + hra + ta;
    }

    double getSalary(){
        return salary;
    }
}
