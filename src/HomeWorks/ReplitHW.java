package HomeWorks;

import java.util.Scanner;

public class ReplitHW {



    public static void main(String[] args) {

        System.out.println("Hello");

        /*
        Write code that will take in a String input and check to see if it is a palindrome or not.

        A palindrome means that the characters are the same forwards and backwards, ignoring spaces.

        Examples of palindromes:

        racecar
        was it a car or a cat I saw
        never odd or even
        rats live on no evil star
        Your check should be case insensitive too. For example, "Bob" is a palindrome, despite the first B being capitalized.

        Your program will print out "true" if it's a palindrome and "false" if not.
         */

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();

        if(givenString.equalsIgnoreCase()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


        /*
        For you to do:

        Create a String given="Hello Syntax friends".

        Using String methods from given String create new String "Welcome Syntax family"

        Expected Output:

        Welcome Syntax family
         */
//        String text="Hello Syntax friends";
//        System.out.println(text.replace("Hello","Welcome").replace("friends","family"));



//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the browser name to proceed further with execution");
//        String browser = sc.nextLine();
//        if (browser.equalsIgnoreCase("chrome")){
//            System.out.println("Proceed with Chrome browser");
//        } else if (browser.equalsIgnoreCase("firefox")) {
//            System.out.println("Proceed with Firefox browser");
//        } else if (browser.equalsIgnoreCase("ie")) {
//            System.out.println("Proceed with IE browser");
//        }else{
//            System.out.println("Invalid browser");
//        };



        /*
        For you to do:

        Based on the user inputs program should give a correct answer.

        If browser is Chrome or Chrome or CHROME or ChRoMe it should print the:

        "Proceed with Chrome browser"

        If browser is firefox, FIREFOX or FireFOX it should print the:

        "Proceed with Firefox browser"

        If browser is IE, ie or iE it should print the:

        "Proceed with IE browser"

        If any other browser it should print the:

        "Invalid browser"
         */
    }
}
