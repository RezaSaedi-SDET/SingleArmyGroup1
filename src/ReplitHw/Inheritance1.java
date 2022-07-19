package ReplitHw;

/*
Question (149)
    Create Three classes (Main, A, B):
    Have a method that prints out the following

    For A: "Class A"

    For B: "Class B"

    Make B extend A

    From your Main class create an object of the B class and call the methods.

    Output:

    Class A
    Class B
 */


public class Inheritance1 {
    String name;
    void PrintInfo(){
        System.out.println(name);
    }
}

class A extends Inheritance1{

    A(String name){
        this.name=name;
    }

}

class B extends Inheritance1{
    B(String name){
        this.name=name;
    }

}

class Tester{
    public static void main(String[] args) {
        A obj1=new A("Class A");
        obj1.PrintInfo();
        B obj2=new B("Class B");
        obj2.PrintInfo();
    }
}



