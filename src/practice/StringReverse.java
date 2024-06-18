package practice;

public class StringReverse {
    public static void main(String[] args) {
        String string= "ABCDF";
       String reverse= "";
       int elen=string.length();
        for (int i =elen-1; i >=0 ; i--) {
            reverse=reverse+string.charAt(i);
        }
        System.out.println("elen = " + reverse);
    }
}
