public class Test_Employee2 {
    public static void main(String[] args) {
        Permanent p1 = new Permanent(10111,"Aldous Dsouza","Mandrem",66000,15000,30000,5000);
        Permanent p2 = new Permanent(10112,"Shreyash Vaigankar","Arambol",55000,20000,25000,5000);
        Permanent p3 = new Permanent(10113,"Ayush Maldar","Aldona",40000,10000,25000,1000);
        Permanent p4 = new Permanent(10114,"Saini Haldankar","Revora",80000,20000,25000,5000);
        Permanent p5 = new Permanent(10115,"Chanda Prajapati","Verla Canca",78000,20000,30000,5000);

        Manager m1 = new Manager(20230, "Sundar Pichai", "Hyderabad", 14000000,8000000, 40000, 30000,"Tesla Model X",200000);

        System.out.println("Manager Details:");
        m1.display();
        m1.calculateSalary();
        System.out.println("Salary:" + m1.getSalary());
        m1.manager_display();
        System.out.println("\n");

        System.out.println("Employee Details:");
        p1.display();
        p1.calculateSalary();
        System.out.println("Salary:" + p1.getSalary());
        System.out.println("\n");

        p2.display();
        p2.calculateSalary();
        System.out.println("Salary:" + p2.getSalary());
        System.out.println("\n");

        p3.display();
        p3.calculateSalary();
        System.out.println("Salary:" + p3.getSalary());
        System.out.println("\n");

        p4.display();
        p4.calculateSalary();
        System.out.println("Salary:" + p4.getSalary());
        System.out.println("\n");

        p5.display();
        p5.calculateSalary();
        System.out.println("Salary:" + p5.getSalary());
        System.out.println("\n");
    }
}
