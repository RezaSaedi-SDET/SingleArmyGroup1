package ReplitHw;

import java.util.LinkedList;
import java.util.List;

public class Replit192 {
    /*
    Create an Linked List that will store all prime numbers from 1 to 100

    Step 1. Create a method that will identify wether number is prime or not

    Step 2. Add all prime numbers into Linked List

    Print Linked List:

    Expected Output:

    [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
     */
    public static void main(String[] args) {
        List<Integer> primeNumbers190=new LinkedList<Integer>();
        for (int numberToCheck=2;numberToCheck<=96;numberToCheck++){
            boolean isPrime=true;
            for(int factor=2;factor<=numberToCheck/2;factor++){
                if(numberToCheck%factor==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                primeNumbers190.add(numberToCheck);
            }
        }
        System.out.println("Prime numbers from 1 to 100 are:");
        System.out.print("[");
        for (int number:primeNumbers190){
            System.out.print(number+", ");
        }
        System.out.println("97]");

}
    }


