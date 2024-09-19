package RationalOperations;

public class incrementOperator {

    public static void main(String[] args) {

        // ++ is called increament
        // case 1
        int a= 10;
        System.out.println(a);

        a= a+1;
        System.out.println(a);

        // case 2 post increament operator

        int a1 = 10;
        int res= a1++;

        System.out.println(res); // 10 psot Increament
        System.out.println(a1); // 11


        // case 3 pre increament

        int a2 = 10;
        int res2= ++a2;

        System.out.println(res2); // 11
        System.out.println(a2); // 11











    }


}
