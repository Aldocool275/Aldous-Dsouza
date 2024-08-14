public class Student2 {
    String name;

    Student2(){
        name = "Unknown";
    }

    Student2(String name){
        this.name = name;
    }

    void student_display(){
        System.out.println("Name:" + name);
    }
}
