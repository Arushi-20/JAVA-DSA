public class InterningNew {
    public static void main(String[] args) {
        String s1= "Arushi";
        String s2 = new String("Arushi");
        //check locations 
        System.out.println(s1==s2); //false

        //compare character by character
        System.out.println(s1.equals(s2)); //true
    }
}
