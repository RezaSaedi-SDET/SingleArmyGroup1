package ReplitHw;

public class Dog {
    String name;
    String breed;
    String color;
    int age;
    int weight;

    Dog(String dogName,String dogBreed, String dogColor, int dogAge, int dogWeight){
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        age=dogAge;
        weight=dogWeight;

    }
    void printInfo(){
        System.out.println("Name "+name+"Breed "+breed+"Color "+color+"Age "+age+"Weight "+weight);
    }

    public static void main(String[] args) {

    }

}
