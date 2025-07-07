package oop;

public class WrapperExample {
    public static void main(String[] args) {
        /*
        int a=10; // primitive value
        int b=20; // primitive value

//        using wrapper classes
        Integer aa=30; // now this is an object
        */

        Integer a=10;
        Integer b=20;

        swap(a,b);

        System.out.println(a+" "+b); // now also, it won't swap as Integer wrapper
        // class is final in java.

        // a final variable cannot be modified, it acts like a constant vlaue
        final int INCREASE=2;
//        INCREASE=5; -- error.

        final A kunal=new A("kunal kushwaha");
        kunal.name="omkar shelke"; // modification is allowed for final non-primitive
        // datatypes in java but you cannot reassign it.

//        kunal=new A("some other person"); -- this is not allowed

        A obj;

//        for(int i=0;i<=1000000000;i++){
//            obj=new A("some random obj");
//        }

    }

    static void swap(Integer a,Integer b)
    {
        Integer temp=a;
        a=b;
        b=temp;
    }
}

// A class
class A{
    final int num=50;
    String name;
    A(String name){
        this.name=name;
    }

    // finalise method is called when object not reachable or
    // not used are destroyed

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destoryed");
    }
}
