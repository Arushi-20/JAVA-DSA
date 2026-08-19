class CN{
    int x;
    int y;

    CN(int x, int y){
        this.x= x;
        this.y= y;
    }

    CN(){}

    void print(){
        if(y>0) System.out.println(x+" + "+y+"i");
        else System.out.println(x+" - "+(-y)+"i");
    }

    void add(CN z2) {
        this.x += z2.x;
        this.y += z2.y;
    }

    void multiply(CN z1) {
        this.x = x*z1.x - y*z1.y;
        this.y = x*z1.y + y*z1.x;
    }
}


public class ComplexNumber {
    public static void main(String[] args) {
        CN z1 = new CN(2, 5);
        z1.print();

        CN z2= new CN(2, -8);
        z2.print();

        z1.add(z2);
        z1.print();
        // z2.print();

        z2.multiply(z1);
        z2.print();
    }
}
