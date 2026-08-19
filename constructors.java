public class constructors {
    public static class Car{
        String name;
        int seats;
        double length;

        //default constructor (same name as class name)
        // Car(){

        // }

        //parametrized constructor
        Car(int x, String s, double d){
            seats = x;
            name = s;
            length = d;
        }

        void print(){
            System.out.println(seats+" "+name+" "+length);
        }
    }

    public static void main(String[] args) {
       Car  c1 = new Car(5, "Kia Sonet", 3.99);
       c1.print();

       Car c2 = new Car(4, "Mercedes", 4.87);
       c2.print();
    }
}
