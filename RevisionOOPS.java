public class RevisionOOPS {
    private static class Pokemon{
        int power;
        String type;
        String name;


        //constructor
        Pokemon(int p, String t, String n){
            power = p;
            type = t;
            name = n;
        }

        void print(){
            System.out.println(this.power+" "+ this.name+" "+this.type);
        }
    }

    public static void main(String[] args) {
        // Pokemon p1= new Pokemon();
        // p1.name = "pikachu";
        // p1.type = "Electric";

        // Pokemon p2= new Pokemon();
        // p2.name= "Charizard";

        // Pokemon p3= p1; //p3 is shallow copy of p1 (can control)
        // p3.type ="Water";
        // System.out.println(p1.type);
        // // System.out.println(p3.type);

        Pokemon p1 = new Pokemon(70, "Electric", "Pikachu");
        p1.print();

        final int x=9; //value of x can not be changed
        // x=2;
        
    }

}
