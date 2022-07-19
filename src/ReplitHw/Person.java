package ReplitHw;
/*
    Question (150)
    Create four classes (Person, Employee, Student, Retiree)
    Have properties
    For Person: name(String)

    For Person: lastName(String)

    For Person: age(int)

    For Employee: salary(int)

    For Student: grade(int)

    For Retiree: seniorActivity(String)

    At Employee, Student, Retiree Class have a print method in each that prints the properties in line as shown in the output

    Create multilevel inheritance: Person --> Employee --> Student --> Retiree

    From your Main class create objects of the Employee, Student and Retiree classes and call the print method.

    Expected Output:

    Joe Smith 35 35000
    Adam Smith 15 10
    Frank Smith 15 tour
     */

public class Person {
    String name;
    String lastName;
    int age;

    Person(String name,String lastName,int age){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
    }


}

class Employee extends Person{
    int salary=35000;
    Employee(String name, String lastName, int age) {
        super(name,lastName,age);

    }
    void printInfo(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}

class Student extends Employee{
    int grade=10;
    Student(String name, String lastName, int age) {
        super(name, lastName, age);
    }

    void printInfo(){
        System.out.println(name+" "+lastName+" "+age+" "+grade);
    }
}

class Retiree extends Student{
    String seniorActivity="tour";
    Retiree(String name, String lastName, int age) {
        super(name, lastName, age);
    }
    void printInfo(){
        System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
    }
}

class FourClassTester{
    public static void main(String[] args) {
    Employee obj1=new Employee("Joe","Smith",35);
    obj1.printInfo();
    Student obj2=new Student("Adam","Smith",15);
    obj2.printInfo();
    Retiree obj3=new Retiree("Frank","Smith",15);
    obj3.printInfo();
    }
}

