package ReplitHw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Replit189 {
    /*
    Create a Linked List that will store Integer Objects from 50-100.

    Once Linked List is created remove all numbers that are not divisible by 3.

    Print Linked List

    Expected Output

    [51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]
     */

    public static void main(String[] args) {
        LinkedList <Integer>linky189=new LinkedList<Integer>();
        linky189.add(50);
        linky189.add(51);
        linky189.add(52);
        linky189.add(53);
        linky189.add(54);
        linky189.add(55);
        linky189.add(56);
        linky189.add(57);
        linky189.add(58);
        linky189.add(59);
        linky189.add(60);
        linky189.add(61);
        linky189.add(62);
        linky189.add(63);
        linky189.add(64);
        linky189.add(65);
        linky189.add(66);
        linky189.add(67);
        linky189.add(68);
        linky189.add(69);
        linky189.add(70);
        linky189.add(71);
        linky189.add(72);
        linky189.add(73);
        linky189.add(74);
        linky189.add(75);
        linky189.add(76);
        linky189.add(77);
        linky189.add(78);
        linky189.add(79);
        linky189.add(80);
        linky189.add(81);
        linky189.add(82);
        linky189.add(83);
        linky189.add(84);
        linky189.add(85);
        linky189.add(86);
        linky189.add(87);
        linky189.add(88);
        linky189.add(89);
        linky189.add(90);
        linky189.add(91);
        linky189.add(92);
        linky189.add(93);
        linky189.add(94);
        linky189.add(95);
        linky189.add(96);
        linky189.add(97);
        linky189.add(98);
        System.out.print("[");
        for (int i=1;i<linky189.size();i+=3){
            System.out.print(linky189.get(i)+", ");

        }
        System.out.println("99]");

    }
}
