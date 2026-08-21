

class Cricketer{
    // final String country = "India";
    static String country = "Aus";
    int runs;
    String name;
    double avg;
}
public class finalAndStatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        // c1.country= 'Aust'; //beacuse value of final is not changed
        Cricketer c2 = new Cricketer();
        // System.out.println(c1.country);
        c1.country = "India";
        c2.country = "New Zealand";
        System.out.println(c1.country);
        System.out.println(c2.country); 
    }
}
