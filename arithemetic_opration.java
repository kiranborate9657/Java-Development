public class method_calling {

    int a=10; 
    int b=20;
    void add(){
        System.out.println("Addition: " + (a+b));      
    }

        void sub(){
            System.out.println("Subtraction: " + (a-b));
        }    
        void mul(){
            System.out.println("Multiplication: " + (a*b));
        }    
         void div(){
            System.out.println("Division: " + (a/b));
        }      



    public static void main(String[] args) {
        method_calling obj = new method_calling();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}
