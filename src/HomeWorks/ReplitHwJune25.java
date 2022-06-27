package HomeWorks;

public class ReplitHwJune25 {

        /*
        Create a static method with the following specification

Return Type: String

Method Name: mixString

Parameters:

a String called s1
a String called s2
Then inside method write logic that will return the strings combined, one letter at a time, starting with s1. See example below for an example.

NOTE: s1 and s2 should be of equal lengths:

s1 ==> "12345"
s2 ==> "abcde"
mixString(s1,s2) ==> "1a2b3c4d5e"
         */
    public static String mixString(String s1, String s2){
      return s1+s2;
    }

    public static void main(String[] args) {
        String m=mixString("12345","abcde");
        System.out.println(m);
    }

        /*
    For you to do:

    Create two methods:

    The first method should be a non-static method that will print out the following message:

    "Programming is amazing."

    The second method should be a static method that will print out the following message:

    "Java is awesome."

    Execute both methods

    Expected Output:

    Programming is amazing.
    Java is awesome.
     */

//    void printInfo(){
//        System.out.println("Programming is amazing.");
//    }
//
//    public static void printInfo2(){
//        System.out.println("Java is awesome.");
//    }
//
//    public static void main(String[] args) {
//        ReplitHwJune25 obj=new ReplitHwJune25();
//        obj.printInfo();
//        printInfo2();
//    }

    /*
    For you to do:

    Create a variable that will hold the count of all instances of the Main class

    Create 3 Object of the class and print value of the count variable;

    Expected Output:

    3
     */

//    public static int num;
//
//
//    public static void main(String[] args) {
//        System.out.println(num=3);
//    }

    /*
    For you to do:

    Declare a static variable number that will hold an integer value:

    Access number from the main method and assign value to it.

    Create an Object of the class, access number in a nonstatic way and assing value of 200.

    Print out number using class name and using instance

    Expected Output:

    200
    200
     */

//    public static int num;
//    int number(int num){
//        return num;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(num=200);
//        ReplitHwJune25 obj=new ReplitHwJune25();
//        int m=obj.number(200);
//        System.out.println(m);
//
//
//    }

    /*
    Declare static variable in class level as below and assign its value:

    String ss="Welcome To Syntax Technologies"

    Access variable in the main method and print it using three ways you learned so far

    Hint:

    first way: By calling directly

    Second way: By using the className

    Third way: By creating the object of the class

    Expected Output:

    Welcome To Syntax Technologies
    Welcome To Syntax Technologies
    Welcome To Syntax Technologies
     */


//    static String ss="Welcome To Syntax Technologies";
//
//    static void displayInfo(){
//        String ss="Welcome To Syntax Technologies";
//        System.out.println(ss);
//    }
//    void displayInfo2(){
//        String ss="Welcome To Syntax Technologies";
//        System.out.println(ss);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(ss);
//        displayInfo();
//        ReplitHwJune25 obj=new ReplitHwJune25();
//        obj.displayInfo2();


//    }


    /*
    For you to do:

    Declare the instance variables to hold:

    integer values
    String values
    double values
    boolean values
    float values
    Access instance variables and then print them all without assigning any values to them.

    Print variables one by one the same sequence that you declare them.

    Expected Output:

    0
    null
    0.0
    false
    0.0
     */

//    static int num1;
//    static String text;
//    static double num2;
//    static boolean boo;
//    static float num3;
//
//    public static void main(String[] args) {
//        System.out.println(num1);
//        System.out.println(text);
//        System.out.println(num2);
//        System.out.println(boo);
//        System.out.println(num3);
//    }


    /*
    For you to do:

    declare 3 instance variables to hold an integer, double and char values.

    Create 2 instances of the class and assign values to variables and the print them

    Expected Output:

    10
    10.23
    a
    100
    100.23
    s
     */

//    String country;
//    String capital;
//    int population;
//    void displayInfo(){
//        country= "USA";
//        capital="Washington DC";
//        population=330000000;
//
//        System.out.println("The capital of "+country+ " is "+capital+" and the population is "+population);
//    }
//
//    void displayInfo2(){
//        country= "Kazakhstan";
//        capital="Astana";
//        population=18500000;
//
//        System.out.println("The capital of "+country+ " is "+capital+" and the population is "+population);
//    }
//
//    public static void main(String[] args) {
//        ReplitHwJune25 obj=new ReplitHwJune25();
//        obj.displayInfo();
//        obj.displayInfo2();
//    }

//    int num1;
//    double num2;
//    char x;
//
//    void instanceClass1(){
//        num1=10;
//        num2=10.23;
//        x='a';
//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(x);
//    }
//
//    void instanceClass2(){
//        num1=100;
//        num2=100.23;
//        x='s';
//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(x);
//    }
//
//    public static void main(String[] args) {
//        ReplitHwJune25 obj=new ReplitHwJune25();
//        obj.instanceClass1();
//        obj.instanceClass2();
//    }

    /*
    For you to do:

    Declare 3 instance variables to hold:

    year, school name and batch #

    Access variables from the main method and assign specific values to them

    Print values of your variables in the following format:

    Expected Output:

    I am a student of batch 9 studying at Syntax in the year of 2021
     */

//    public static void main(String[] args) {
//        String year="2021";
//        String schoolName="Syntax";
//        String batchNum="9";
//
//        System.out.println("I am a student of batch "+batchNum+" studying at "+schoolName+" in the year of "+year);
//    }


    /*
    Write a method header with the following specs:

    Returns:

    a String
    Name:

    censorLetter
    Parameters:

    a String
    a char
    Then complete the method by programming the following behavior

    Replace all instances of given character with a "*" within the given String.
    See below examples.
    Examples:

    censorLetter("computer science",'e') ==> "comput*r sci*nc*"
    censorLetter("trick or treat",'t') ==> "*rick or *rea*"
     */

//    String censorLetter(String name, char a){
//        return name.replaceAll("e","*");
//
//    }
//    String censorLetter2(String name2, char a){
//        return name2.replaceAll("t","*");
//
//    }
//
//
//    public static void main(String[] args) {
//        ReplitHwJune25 obj=new ReplitHwJune25();
//        String m=obj.censorLetter("er science",'e');
//        System.out.println(m);
//        String n=obj.censorLetter2("trick or treat",'t');
//        System.out.println(n);
//    }




}
