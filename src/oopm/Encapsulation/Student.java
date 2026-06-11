package oopm.Encapsulation;

public class Student {
    private int age;
    // setter method  (used for encapsulation)
    public void setAge(int age) {
        if(age>0){
        this.age = age;
    }}
    //getter method

    public int getAge() {
        return age;
    }
}