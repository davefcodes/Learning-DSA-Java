package com.davefcodes.introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        Integer num = (45);

        Integer a = 10;
        Integer b = 20;

        swap(a, b);
        System.out.println(a + " " + b);

        // primitive can't be modified
//        final int bonus = 2;
//        bonus = 3; // can't be modified since its final

        final A david = new A("david");
        david.name = "wonder";

        // when a non primitivive is final, you cannot reassign it.
//        david = new  A("other object");

        A obj;
        for (int i = 0; i < 10000000; i++){
            obj = new A("Random name");
        }



    }
    static void swap(Integer a, Integer b){
        int temp = a; //10
        a = b;  // a: 20
        b = temp; // b: 10
        System.out.println(a + " " + b) ;

    }
}
class A{
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }

    // garbage collection
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being destroyed");
    }
}
