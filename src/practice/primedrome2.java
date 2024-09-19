package practice;

import java.util.Scanner;

public class primedrome2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the String");
        String str=sc.next();
        String org_String=str;
        String reverse= "";
        int elen=str.length();
       for (int i=elen-1; i>=0; i-- ){
           reverse=reverse+str.charAt(i);
       }if (org_String.equals(reverse)){
            System.out.println("it is not plimdromes");
        }else {
            System.out.println("not plimdromes");
        }
        System.out.println(reverse);
    }
}
