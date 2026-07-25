import java.util.ArrayList;

public class ArrayListExample {
 public static void main(String[] args) {
    //<Integer> is the wrapper class
    ArrayList<Integer> list= new ArrayList<Integer>(10);
    list.add(67);
    // list.add("Arushi");
    list.add(99);
    list.add(88);
    list.add(45);
    list.add(51);
    list.add(33);
    System.out.println(list);


    ArrayList<String> s=  new ArrayList<>();
    s.add("Arushi");
    s.add("Sharma");
    System.out.println(s);

    
 }   
}
