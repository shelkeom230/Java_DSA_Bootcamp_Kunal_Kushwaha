package oop;

public class Main3 {
    public static void main(String[] args) {
    Employee one=new Employee(1,"omkar",50000);

        // changing an object properties via another reference variable of the same type
    Employee two=one;
    two.salary=50000;

    one.getInfo();
    two.getInfo();
    }
}

// create employee class
class Employee{
    // properties
    int id;
    String name;
    double salary;

    // constructor
    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    // getinfo method
    void getInfo(){
        System.out.println("id: "+this.id+" name: "+this.name+" salary: "+this.salary);
    }

}
