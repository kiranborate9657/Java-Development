public class inheritance {

    class Animal{
        void eat()
        {
            System.out.println("All Animal Are Eating:");
        }
    }

    class dog extends Animal{
        void bark()
        {
            System.out.println("Dog is Barking:");
        }
    } 
    public static void main(String[] args) {

        inheritance i = new inheritance();
        dog d = i.new dog();
        d.eat();
        d.bark();


        
    }
    
}
