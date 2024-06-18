package oopJava;

public class reverseString {
    public static void main(String[] args) {

        String str= "ABCD"; // step 1
        String rev= ""; //step 2

        int elen=str.length(); // step 3
        for (int i=elen-1; i>=0; i--){  // step 4
            rev=rev+str.charAt(i);
        }
        System.out.println("Reversed string "+rev);

    }
}
