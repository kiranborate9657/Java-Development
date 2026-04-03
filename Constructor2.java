class Employee {

    String name;
    int id;

    Employee(String n, int i) {

        name = n;
        id = i;

    }

    void display() {

        System.out.println(name + " " + id);

    }
}

public class ConstructorExample {

    public static void main(String[] args) {

        Employee e1 = new Employee("Kiran", 101);

        e1.display();

    }
}
