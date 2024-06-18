package practice;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter you String");
        String str=sc.next();

        String org_str=str;
        String reverse="";
        int elen=str.length();
        for (int i=elen-1; i>=0; i--){
            reverse=reverse+str.charAt(i);



        }if (org_str.equals(reverse)){
            System.out.println("string is the plimdrome");
        }else {
            System.out.println("string is not plimdrome");
        }

        System.out.println(reverse);





    }


}
