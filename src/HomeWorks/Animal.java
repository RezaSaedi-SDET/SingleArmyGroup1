package HomeWorks;

public class Animal {
    String name;
    String breed;
    String color;
    int age;
    double weight;
    void printInfo(){
        System.out.println("Name "+name+" color "+color);
}

}
class Dog extends Animal{
    Dog (String name,String color){
        this.name=name;
        this.color=color;
    }

}

class Cat extends Animal{
    Cat(String name,String color){
        this.name=name;
        this.color=color;
    }

}

class AnimalTester {
    public static void main(String[] args) {
        Cat obj1=new Cat("jimmy","white");
        obj1.printInfo();
        Dog obj2=new Dog("flex","black");
        obj2.printInfo();
    }
}
