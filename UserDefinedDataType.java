import java.util.Scanner;

public class UserDefinedDataType {

    public static class Student{ 
        //class is a blueprint
        String name;
        int rno;
        double cgpa;

        //method
        void print(){
            System.out.println(name + " "+ rno +" "+ cgpa);
        }
    }
    public static void main(String[] args) {
        //Scanner is class and sc is an object
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student(); //object creation and s1,s2 are objects
        s1.name = "Arushi";
        s1.rno= 1;
        s1.cgpa = 8.86;

        Student s2= new Student();
        s2.name = "abc";
        s2.rno = sc.nextInt();
        // s2.rno = 2;
        s2.cgpa = 8.5;

        System.out.println(s1.name+" "+ s1.rno+ " "+ s1.cgpa);

        s2.cgpa = 8.7;
        System.out.println(s2.cgpa);
        System.out.println(s2.rno);

        s1.print();
        s2.print();
        
    }
}
