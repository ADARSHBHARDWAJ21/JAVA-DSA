package OOPMPW;
   // creating a student class
public class StudentClass {
    // creating a new data type
    public static class Student{
        String name;
        int rno;
        double percent;
    }
    static void main() {
        //object creation is done in below line
       Student x = new Student(); // declaration used for making student dibba and in that dibba name, rollno and persent is there
       x.name = "Adarsh";
       x.rno = 76;
       x.percent = 92.5;
       //object creation is done in below line
       Student s = new Student(); // x and s  these are objects of student classs
       s.name = "akshat";
       s.percent = 97.2;
       s.rno = 3;
        System.out.println(x.name);
        System.out.println(s.name);
        s.name = "Darsh";
        System.out.println(s.name);
        System.out.println(x.rno);
        System.out.println(x.percent + 8);
    }
}
