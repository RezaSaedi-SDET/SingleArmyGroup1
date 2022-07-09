package ReplitHw;

public class Car {

    /*
    Question (143)
    Complete the Car.java class:
    Create the following variable (Choose proper datatype)

    make

    model

    numberOfDoors

    topSpeed

    price

    following the proper naming convention for variables.

    Write four constructors:

    The first constructor(with all parameters)

    A secondary constructor Have all parameters **except numberOfDoors. (**numberOfDoors value should assign to 4 inside constructor)

    A third constructor Have all parameters except make and model . **(**make and model value should assign to "unknown" inside constructor)

    A fourth constructor Have all parameters except topSpeed and price;**(**topSpeed value should assign to "90" and price value should be assign to 0 inside constructor)

    Create a display method in Cars class to print the class variable value in console.

    Test your code with the Main.java class:
    Create several Car objects using all Constructors.

    then call display method with each object.

    Output:

    Toyota Prius 4 120 30000.0
    Toyota Prius 4 120 30000.0
    unknown unknown 4 120 30000.0
    Toyota Prius 4 90 0.0
     */
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    Car(String carMake, String carModel, int carNumberOfDoors, int carTopSpeed, double carPrice){

        make=carMake;
        model=carModel;
        numberOfDoors=carNumberOfDoors;
        topSpeed=carTopSpeed;
        price=carPrice;

    }

    void carInfo(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }

    public static void main(String[] args) {
        Car obj1=new Car("Toyota","Prius",4,120,30000.0);
        obj1.carInfo();
        Car obj2=new Car("Toyota","Prius",4,120,30000.0);
        obj2.carInfo();
        Car obj3=new Car("unknown","unknown",4,120,30000.0);
        obj3.carInfo();
        Car obj4=new Car("Toyota","Prius",4,90,0.0);
        obj4.carInfo();

    }


}
