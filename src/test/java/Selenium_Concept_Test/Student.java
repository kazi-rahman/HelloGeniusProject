package Selenium_Concept_Test;

public class Student {
    int rollno;
    String name;
    String city;

    Student(int rollno, String name, String city){
        this.rollno=rollno;
        this.name=name;
        this.city=city;
    }
    public void  studentInfo(){
        System.out.println(rollno+", " + name+" ," + city);

    }

    public static void main(String args[]){
        Student s1=new Student(101,"Raj","lucknow");
        Student s2=new Student(102,"Vijay","ghaziabad");

       // System.out.println(s1.studentInfo());//compiler writes here s1.toString()
       // System.out.println(s2.studentInfo());//compiler writes here s2.toString()
    }
}
