public class Employee2 {
    int empid;
    String empname;
    String empaddress;

    Employee2(int empid,String empname,String empaddress){
        this.empid = empid;
        this.empname = empname;
        this.empaddress = empaddress;
    }

    public void display(){
        System.out.println("Employee ID:" + empid + " ,Employee Name:" + empname + " ,Employee Address:" + empaddress);
    }
}
