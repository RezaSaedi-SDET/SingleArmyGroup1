package ReplitHw;

import java.util.LinkedList;

public class Replit193 {
    /*
    Create Linked List that will store Integer Objects

    Add the values below:

    111

    222

    333

    444

    555

    666

    Create a logic to calculate sum of the all the values in list.

    Print the result of sum.

    Expected Output:

    Result of sum is 2331
     */

    public static void main(String[] args) {
        LinkedList<Integer> linky193=new LinkedList<Integer>();
        linky193.add(111);
        linky193.add(222);
        linky193.add(333);
        linky193.add(444);
        linky193.add(555);
        linky193.add(666);
        int sum=0;
        for(int number:linky193){
            sum+=number;
        }
        System.out.println("Result of sum is "+sum);
    }
}

