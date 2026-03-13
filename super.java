class Parent {
    int a = 10;
}

class Child extends Parent {
    int a = 20;

    void show() {
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
