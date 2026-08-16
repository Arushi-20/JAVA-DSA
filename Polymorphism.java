public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("bark");
        }
    }

    public static class Cat{
        void speak(){
            System.out.println("meow");
        }
    }

    public static class Sher{
        void speak(){
            System.out.println("Grrrr");
        }
    }

    public static class pikachu{
        void speak(){
            System.out.println("Pika Pika");
        }
    }


    public static void main(String[] args) {
        pikachu p = new pikachu();
        Dog d = new Dog();
        Cat c = new Cat();
        Sher s = new Sher();

        d.speak();
        c.speak();
        s.speak();
        p.speak();
    }
}
