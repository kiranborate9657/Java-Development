public class hierachical {

    class Animal{
        void eat()
        {
            System.out.println("Animal are the Eating");
        }
    }
    class dog extends Animal{
        void bark(){
            System.out.println("Dog is the Barking:");
        }
    }
    class cat extends Animal{
        void meow(){
            System.out.println("Cat is the Meowing:");
        }
    }

    public static void main(String[] args) {
        hierachical h=new hierachical();
        dog d=h.new dog();
        cat c=h.new cat();
        d.eat();    
        d.bark();
        c.eat();    
        c.meow();
        
    }
    
}
