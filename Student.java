class Student{
    String name;
    int roll_no;
    int age;

    Student(String n,int r,int a){
        name = n;
        roll_no = r;
        age = a;
    }

     void display(){
        System.out.println("Name: " + name + ", Age: " + age + ", Roll No: " + roll_no);
     }
}