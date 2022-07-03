package HomeWorks;

public class ReplitHwJuly2 {

    /*
    For you to do: Create the maxValue method that will accept int array and return return the maximum value in the array.

    Method should visible every class in any package!

    Expected Output:

    22
     */

    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        int max=getMax(arr);
        System.out.println(+max);
    }

    public static int getMax(int[] inputArr){
        int maxValue=inputArr[0];
        for (int i=0;i<inputArr.length;i++){
            if (inputArr[i]>maxValue){
                maxValue=inputArr[i];
            }
        }
        return maxValue;
    }

    /*
    Problem 140 - Create the maxLength method that will accept String array of words and return the word with the largest length.

    Method should visible only within same package!

    Expected Output:

    this is long
     */

//    public static String findLongestName(String arr []){
//    int size=arr.length;
//    String maxLength=arr[0];
//    for(int i=0;i<arr.length;i++){
//        if (arr[i].length()>maxLength.length()){
//            maxLength=arr[i];
//        }
//    }
//    return maxLength;
//    }
//
//    public static void main(String[] args) {
//        String[] arr = {"hey","yolo","hi","this is long"};
//        String word=findLongestName(arr);
//        System.out.println(word);
//    }
}
