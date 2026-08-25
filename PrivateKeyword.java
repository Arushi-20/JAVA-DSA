//encapsulations

import java.util.Scanner;

class Students{
        String name;
        private int rno ;
        double cgpa;

        void print(){
            System.out.println(name+" "+rno+" "+cgpa);
        }

        // public void p(){
        //     print();
        // }

        int getRno(){
            return rno;
        }

        void setRno(int x){
            rno = x;
        }
}


public class PrivateKeyword {

    

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.print();
        s1.cgpa = 8.86;
        s1.name = "Arushi";


        s1.setRno(51);
        System.out.println(s1.getRno());
        // s1.print();

        // Scanner sc =  new Scanner(System.in);
        // StringBuilder sb = new StringBuilder(sc.nextLine());
        // System.out.println(sb);
        

    }
}
