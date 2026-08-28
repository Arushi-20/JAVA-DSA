public class MethodOverloading {
    static class doraemon{
        String gadget;
        int numberOfGadget;

        doraemon(int numberOfGadget, String gadget){
            this.numberOfGadget = numberOfGadget;
            this.gadget = gadget;
        }

        doraemon(String s, int x){
            gadget = s;
            numberOfGadget = x;
        }

        void print(){
            System.out.println(gadget+" "+numberOfGadget);
        }
    }

    public static void main(String[] args) {
        
        doraemon d1 = new doraemon(200, "BambooCopter");
        d1.print();

        doraemon d2= new doraemon("AnywhereDoor", 100);
        d2.print();
    }
}
