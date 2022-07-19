package HomeWorks;

public class Task1 {

    public static String reversString(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverse(String word){
        return new StringBuilder(word).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(Task1.reversString("Saturday"));
        System.out.println(Task1.reverse("make"));
    }


}
