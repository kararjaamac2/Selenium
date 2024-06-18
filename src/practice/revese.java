package practice;

public class revese {
    public static void main(String[] args) {
        String hod="Hodman";
        String str=null;
        int elen=hod.length();
        for (int i=elen-1; i>=0; i--){
            str=str+hod.charAt(i);
        }
        System.out.println("str = " + str);
    }
}
