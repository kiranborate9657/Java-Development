public class multilevel_inheritance {
    class Animal{
        void eat(){
            System.out.println("All Animal Are the Eating:");

        }
    }
    class dog extends Animal{
        void bark(){
            System.out.println("Dog is the Barking:");
        }
    }
    class maggi extends dog{
        void favorite(){
            System.out.println("Maggi is the Favorite:");
        }
    }

    public static void main(String[] args) {
        multilevel_inheritance m=new multilevel_inheritance();
        maggi d = m.new maggi();
        d.eat();
        d.bark();
        d.favorite();
        
    }
}
