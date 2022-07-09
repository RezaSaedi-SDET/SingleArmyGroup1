package ReplitHw;

public class SyntaxTechnologies {

    /*
    Question (142)
    1. Complete the SyntaxTechnologies class:

    Include the following class variables:

    schoolName(String)

    batch(int)

    year(int)

    lastDayOfClass(String)

    Write two constructors:

    non-argument constructor

    parameterized constructor

    Create method to display values of instance variables.

    2. In Main Class:

    Create two different objects of the SyntaxTechnologies class using both constructors and call display method.

    Expected Output:

    null 0 0 null
    Syntax 6 2020 07/30/2020
     */

    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    SyntaxTechnologies(String syntaxSchoolName, int syntaxBatch, int syntaxYear, String syntaxLastDayOfClass){
        schoolName=syntaxSchoolName;
        batch=syntaxBatch;
        year=syntaxYear;
        lastDayOfClass=syntaxLastDayOfClass;
    }
    void displayInfo(){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
    }
    public static void main(String[] args) {
        SyntaxTechnologies obj=new SyntaxTechnologies("Syntax",6,
                2020, "07/30/2020");
        obj.displayInfo();
        SyntaxTechnologies obj1=new SyntaxTechnologies("null",0,0,"null");
        obj1.displayInfo();
    }


}