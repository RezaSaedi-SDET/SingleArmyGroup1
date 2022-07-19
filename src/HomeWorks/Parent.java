package HomeWorks;

public class Parent {
    String name="Misha";
    double money=1000000;

}
class child extends Parent{
    void printInfo(){
        System.out.println("My full name is "+name );
    }
    void buyCar(){
        System.out.println("I can buy a car from Dad's money"+money);
    }
}

class Tester{
    public static void main(String[] args) {
        child obj1=new child();
        obj1.printInfo();
        obj1.buyCar();

    }
}